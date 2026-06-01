public class Shirt202560112 extends Clothing202560112 {
    private char colorCode = 'U';
    
    public Shirt202560112 (String descr, double pric, int quant,char col){
        super.calculateID();
        super.setDescription(descr);
        super.setPrice(pric);
        super.setQuantityInStock(quant);
        this.colorCode = col;
    }
    public void DisplayShirtInformatión() {
        System.out.println("----------- Shirt Informatión ----------");
        System.out.println("      Shirt ID"+ super.getID());
        System.out.println("      Description: "+ super.getDescription());
        System.out.println("      Price: $"+ super.getPrice());
        System.out.println("      Quantity: "+ super.getQuantityInStock());
        String color;
        switch( colorCode ){
            case 'B': color = "Blue"; break;
            case 'R': color = "Red"; break;
            case 'G': color = "Green"; break;
            case 'W': color = "white"; break;
            default : color = "not definid";
        }
        System.out.println("     color: "+ color);
        System.out.println("-----------------------------------------");
    }
}
