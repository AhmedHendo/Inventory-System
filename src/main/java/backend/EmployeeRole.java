
package backend;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.time.Period;

public class EmployeeRole {
    private Database productDatabase;
    private Database customerProductDatabase;

    public EmployeeRole (){
        productDatabase = new ProductDatabase("Products.txt");
        customerProductDatabase = new CustomerProductDatabase ("CustomersProducts.txt");
        productDatabase.readFromFile();
        customerProductDatabase.readFromFile();
    }
    
    public ProductDatabase getProductDatabase() {
        return (ProductDatabase) productDatabase;
    }

    public CustomerProductDatabase getCustomerProductDatabase() {
        return (CustomerProductDatabase) customerProductDatabase;
    }
    
    public void addProduct(String productID, String productName, String manufacturerName, String supplierName, int quantity ,float price){
        String flag = productID + "," + productName + "," + manufacturerName + "," + supplierName + "," + quantity + "," + price; 
        productDatabase.insertRecord(productDatabase.createRecordFrom(flag));      
    }
    
    public Product[] getListOfProducts (){
        ArrayList<Record> flag = productDatabase.returnAllRecords();
        Product [] p = new Product[flag.size()];
        for (int i=0; i<flag.size(); i++){
            p[i] = (Product) flag.get(i);
        }
        return p;
    }
    
    public CustomerProduct[] getListOfPurchasingOperations(){
        ArrayList<Record> flag = customerProductDatabase.returnAllRecords();
        CustomerProduct [] c = new CustomerProduct[flag.size()];
        for (int i=0; i<flag.size(); i++){
            c[i] = (CustomerProduct) flag.get(i);
        }
        return c;
    }
    
    public boolean purchaseProduct(String customerSSN, String productID, LocalDate purchaseDate) throws IOException{
        if (!productDatabase.contains(productID))
            return false;
        else if (((Product) productDatabase.getRecord(productID)).getQuantity() == 0)
            return false;
        else{
            Product p = (Product) productDatabase.getRecord(productID);
            p.setQuantity(p.getQuantity() - 1);
            CustomerProduct c = new CustomerProduct(customerSSN, productID, purchaseDate);
            customerProductDatabase.insertRecord(c);
            return true;
        }       
    }
    
    public double returnProduct(String customerSSN, String productID, LocalDate purchaseDate ,LocalDate returnDate){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String str = customerSSN + "," + productID + "," + purchaseDate.format(formatter);
        Period period = Period.between(purchaseDate, returnDate);
        int years = period.getYears(), months = period.getMonths(), days = period.getDays();
        if (returnDate.isBefore(purchaseDate) || (years != 0 || months > 1 || days > 14) || customerProductDatabase.getRecord(str) == null || productDatabase.getRecord(productID) == null)
            return -1;
        else{
            Product p = (Product) productDatabase.getRecord(productID);
            p.setQuantity(p.getQuantity() + 1);
            customerProductDatabase.deleteRecord(str);
            //productDatabase.saveToFile();
            return p.getPrice();
        }
    }
    
    public void logout(){
        productDatabase.saveToFile();
        customerProductDatabase.saveToFile();
    }
}
