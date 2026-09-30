package backend;

public class Product implements Record{

    @Override
    public String toString() {
        return productID + "," + productName + "," + manufacturerName + "," + supplierName + "," + quantity + "," + price;
    }

    
    
    private final String productID;
    private final String productName;
    private final String manufacturerName;
    private final String supplierName;
    private int quantity;
    private final float price;

    public Product(String productID, String productName, String manufacturerName, String supplierName, int quantity, float price) {
        this.productID = productID;
        this.productName = productName;
        this.manufacturerName = manufacturerName;
        this.supplierName = supplierName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public float getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public String lineRepresentation() {
        return (productID + "," + productName + "," + manufacturerName + "," + supplierName + "," + quantity + "," + price);
    }

    public String getSearchKey() {
        return productID;
    }
}
