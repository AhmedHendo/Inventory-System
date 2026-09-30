package backend;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class CustomerProductDatabase extends Database{

    CustomerProduct p;
    String[] str;

    public CustomerProductDatabase(String fileName) {
        super(fileName);
    }
    public CustomerProduct createRecordFrom(String line) {
        str = line.split(",");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        p = new CustomerProduct(str[0], str[1], LocalDate.parse(str[2], formatter));
        return p;
    }
}
