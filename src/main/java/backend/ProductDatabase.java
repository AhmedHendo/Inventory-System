package backend;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class ProductDatabase extends Database{
    String[] str;
    Product p;

    public ProductDatabase(String fileName) {
        super(fileName);
    }
    
    public Product createRecordFrom(String line) {
        str = line.split(",");
        p = new Product (str[0], str[1], str[2], str[3], Integer.parseInt(str[4]), Float.parseFloat(str[5]));
                return p;
        }
    
    public int hendo (){
        return 1;
    }
}
