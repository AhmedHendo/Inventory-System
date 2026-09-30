
package backend;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AdminRole{
   private Database employeeUserDatabase;
    public AdminRole()
    {
        employeeUserDatabase= new EmployeeUserDatabase("Employees.txt");
        employeeUserDatabase.readFromFile();
    }

    public EmployeeUserDatabase getEmployeeUserDatabase() {
        return (EmployeeUserDatabase) employeeUserDatabase;
    }
    
    @Override
    public String toString() {
        return "AdminRole{" +
                "database=" + employeeUserDatabase +
                '}';
    }

    public void addEmployee(String employeeId, String name, String email, String address, String phoneNumber)  {
        String line=employeeId+","+name+","+email+","+address+","+phoneNumber;
        employeeUserDatabase.insertRecord(employeeUserDatabase.createRecordFrom(line));
    }
    public EmployeeUser[] getListOfEmployees()
    {
        ArrayList<Record> flag = employeeUserDatabase.returnAllRecords();
        EmployeeUser [] p = new EmployeeUser[flag.size()];
        for (int i=0; i<flag.size(); i++){
            p[i] = (EmployeeUser) flag.get(i);
        }
        return p;
        
        /*List employeeList = new ArrayList<>();
        try{
            BufferedReader bufferedReader=new BufferedReader(new FileReader("Employees.txt"));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                EmployeeUser employee = (EmployeeUser) employeeUserDatabase.createRecordFrom(line);
                employeeList.add(employee);

            }
            bufferedReader.close();

        }catch (IOException e)
        {
            e.printStackTrace();
        }
        return (EmployeeUser[]) employeeList.toArray( new EmployeeUser[employeeList.size()]);*/
    }
    public void removeEmployee(String key) 
    {
        employeeUserDatabase.deleteRecord(key);
    }
    public void logout()
    {
        employeeUserDatabase.saveToFile();
    }
        /*try {
            FileWriter fileWriter = new FileWriter("Employees.txt",true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (EmployeeUser employee : getListOfEmployees()) {
                if (!employeeUserDatabase.contains((employee.getEmployeeId()))) {
                    String record = employee.lineRepresentation();
                    bufferedWriter.write(record);
                    bufferedWriter.newLine();
                }
            }

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
}


