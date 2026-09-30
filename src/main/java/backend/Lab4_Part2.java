package backend;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Lab4_Part2 {

    public static void main(String[] args) throws IOException {

        AdminRole a = new AdminRole();
        
          // Create an instance of TheAdminRoleWindow
        TheAdminRoleWindow adminWindow = new TheAdminRoleWindow();

        // Create an instance of AnotherClass and pass the adminWindow instance
        AnotherClass anotherClass = new AnotherClass(adminWindow);

        // Now you can use the same instance in both classes
        adminWindow.doSomething();
        anotherClass.doSomethingElse();
    }
    
    public static class TheAdminRoleWindow {
    public void doSomething() {
        System.out.println("TheAdminRoleWindow is doing something.");
    }

    // Other methods and properties...
}

// AnotherClass class
public static class AnotherClass {
    private TheAdminRoleWindow admin;

    // Constructor that receives an instance of TheAdminRoleWindow
    public AnotherClass(TheAdminRoleWindow adminWindow) {
        this.admin= adminWindow;
    }

    public void doSomethingElse() {
        // Use the same instance of TheAdminRoleWindow
        admin.doSomething();
    }

    // Other methods and properties...
}
//In this example, the MainClass creates an instance of TheAdminRoleWindow. Then, it creates an instance of AnotherClass and passes the TheAdminRoleWindow instance to it through the constructor. Now, both classes (MainClass and AnotherClass) have access to the same instance of TheAdminRoleWindow, and they can interact with it accordingly.

//This approach ensures that you are working with a single instance throughout your application. It's important to design your classes and their interactions to maintain a clean and understandable structure.






//        Database d3 = new ProductDatabase("Products.txt");
//        System.out.println(((ProductDatabase)d3).hendo());
//        System.out.println(d3 instanceof CustomerProductDatabase);
//        System.out.println(d3 instanceof Database);
//        d3.readFromFile();
//        d3.deleteRecord("SMT-002");
//        d3.saveToFile();

        /*Record r1 = new Product("P9999", "Abbas", "Foad", "Samya", 12, 5400);
        System.out.println(r1.lineRepresentation());
        System.out.println(r1.getSearchKey());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        Record r2 = new CustomerProduct("77886655", "Hondaaaa", LocalDate.parse("28-10-2003",formatter));
        System.out.println(r2.lineRepresentation());
        System.out.println(r2.getSearchKey());*/
 /*Record r3 = new EmployeeUser("E12", "Abdo", "AbddoGabA5ro.com", "Alexandria", "0123456789");
        System.out.println(r3.lineRepresentation());
        System.out.println(r3.getSearchKey());
        Database d3 = new EmployeeUserDatabase("Employees.txt");
        d3.readFromFile();
        System.out.println(d3.returnAllRecords());
        System.out.println(d3.createRecordFrom("E1200,Abdo,Abdo.com,Alex,011"));
        System.out.println(d3.contains("E12"));
        System.out.println(d3.getRecord("E1200"));
        d3.insertRecord(r3);
        System.out.println(d3.returnAllRecords());
        d3.deleteRecord("123");
        System.out.println(d3.returnAllRecords());
        
        AdminRole a = new AdminRole();
        a.getEmployeeUserDatabase().readFromFile();
        a.addEmployee("E8341", "Hendoo", "hendo.com", "alex", "010");
        System.out.println(a.getListOfEmployees()[0]);
        a.removeEmployee("E12");
        a.logout();*/
 /*Database d1 = new ProductDatabase("Products.txt");
        d1.readFromFile();
        System.out.println(d1.returnAllRecords());
        Database d2 = new CustomerProductDatabase("CustomersProducts.txt");
        d2.readFromFile();
        System.out.println(d2.returnAllRecords());
        System.out.println(d1.createRecordFrom("P3234,Hassanat,gtgt,Samya,12,6780"));
        System.out.println(d2.createRecordFrom("A123456,H2323,28-10-2022"));
        System.out.println(d1.contains("1234"));
        System.out.println(d2.contains("20209080,T345,12-05-2002"));
        System.out.println(d1.getRecord("12"));
        System.out.println(d2.getRecord("20209080,T345,12-05-2002"));
        d1.insertRecord(r1);
        System.out.println(d1.returnAllRecords());
        d2.insertRecord(r2);
        System.out.println(d2.returnAllRecords());
        d1.deleteRecord("P9999");
        System.out.println(d1.returnAllRecords());
        d2.deleteRecord("20209080,T345,12-05-2002");
        System.out.println(d2.returnAllRecords());
        
        EmployeeRole e = new EmployeeRole();
        e.getProductDatabase().readFromFile();
        e.getCustomerProductDatabase().readFromFile();
        e.addProduct("L1111", "Scooter", "Sym", "Sssss", 3 , 2360);
        System.out.println(e.getListOfProducts()[1]);
        System.out.println(e.getListOfPurchasingOperations()[2]);
        System.out.println(e.purchaseProduct("0000000000", "99999", LocalDate.parse("21-10-2006",formatter)));
        System.out.println(e.returnProduct("9898989", "A1111", LocalDate.parse("28-10-2003", formatter), LocalDate.parse("01-11-2003", formatter)));
        System.out.println(e.getProductDatabase().returnAllRecords());
        System.out.println(e.getCustomerProductDatabase().returnAllRecords());
        e.logout();*/
    }
