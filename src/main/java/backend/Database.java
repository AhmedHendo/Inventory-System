package backend;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

abstract class Database {

    int i;

    private ArrayList<Record> records = new ArrayList<>();
    private String fileName;

    public Database(String fileName) {
        this.fileName = fileName;
    }

    public ArrayList<Record> getRecords() {
        return records;
    }

    public String getFileName() {
        return fileName;
    }

    public void readFromFile() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(getFileName()));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                Record employee = createRecordFrom(line);
                getRecords().add(employee);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Record> returnAllRecords() {
        return records;
    }

    public abstract Record createRecordFrom(String line);

    public boolean contains(String key) {
        for (i = 0; i < records.size(); i++) {
            if (records.get(i).getSearchKey().equals(key)) {
                return true;
            }
        }
        return false;
    }

    public Record getRecord(String key) {
        for (i = 0; i < records.size(); i++) {
            if (contains(key)) {
                return records.get(i);
            }
        }
        return null;
    }

    public void insertRecord(Record record) {
        for (i = 0; i < records.size(); i++) {
            if (contains(record.getSearchKey())) {
                //System.out.println("You can't add a product with the same product_id.");
                return;
            }
        }
        records.add(record);
        //saveToFile();
    }

    public void deleteRecord(String key) {
        for (i = 0; i < records.size(); i++) {
            if (contains(key)) {
                records.remove(i);
                //saveToFile();
                return;
            }
        }
        //System.out.println("This key is not found.");
    }

    public void saveToFile() {
        try ( BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName, false))) {
            if (!records.isEmpty()) {
                for (i = 0; i < records.size() - 1; i++) {
                    bufferedWriter.write(records.get(i).lineRepresentation());
                    bufferedWriter.newLine();
                }
                bufferedWriter.write(records.get(i).lineRepresentation());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //JOptionPane.showMessageDialog(null, records.get);
    }

    /*public void saveToFile (){
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName,false))){
            for (i=0; i<records.size()-1; i++){
                bufferedWriter.write(records.get(i).lineRepresentation());
                bufferedWriter.newLine();
            }
            bufferedWriter.write(records.get(i).lineRepresentation());   
            bufferedWriter.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }*/
}
