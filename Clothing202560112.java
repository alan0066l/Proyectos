public class Clothing202560112 {
    private int ID=0;
    private String description="Descripción";
    private double Price=0.0;
    private int quantityInStock=0;

    public int getID() {
        return ID;
    }

    public void calculateID() {
        this.ID = (int)(Math.random()*10000+1);
        
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }
    
    
}
