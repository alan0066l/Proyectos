
public class CustomerTest {
    public static void main(String[] args) {
    Customer MiCliente = new Customer();
    MiCliente.displayCustomerInfo();
    MiCliente.customerID = 100;
    MiCliente.customerName = "Bill Gates Perez";
    MiCliente.customerStatus = 'V';
    MiCliente.totalPurchases = 10000;
    MiCliente.displayCustomerInfo();
    }
}
