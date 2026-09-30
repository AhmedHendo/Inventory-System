
package backend;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class CustomerProduct implements Record{

    @Override
    public String toString() {
        return customerSSN + "," + productID + "," + purchaseDate;
    }
    
    
    private final String customerSSN;
    private final String productID;
    private final LocalDate purchaseDate;
    public CustomerProduct(String customerSSN, String productID, LocalDate purchaseDate){
        this.customerSSN = customerSSN;
        this.productID = productID;
        this.purchaseDate = purchaseDate;
    }

    public String getCustomerSSN() {
        return customerSSN;
    }

    public String getProductID() {
        return productID;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }
    public String lineRepresentation() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = this.purchaseDate.format(formatter);
        return (customerSSN + "," + productID + "," + formattedDate);
    }
    public String getSearchKey(){
        return lineRepresentation();
    }
}
