
public class Customer {
    //atributos
    public int customerID = 0;
    public String customerName = "---name---"; 
    public char customerStatus = 'N'; //char lleva comillas simples
    public double totalPurchases = 0.0; //si es float lleva 0.0f
    //metodos
    public void displayCustomerInfo(){
        System.out.println("------- Customer Info -------");
        System.out.println("Numero ID: "+customerID);
        System.out.println("Nombre: "+customerName);
        System.out.println("Estatus: "+customerStatus);
        System.out.println("Compras: $"+totalPurchases+"\n");
    }
}
