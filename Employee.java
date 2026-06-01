public class Employee extends Person{
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public Employee (String nombre, double salario){
        super.calculaterID();
        super.setName(nombre);
        this.salary = salario;
    }
    public void displayInformation(){
        System.out.println("------- Employee Information--------");
        System.out.println("Employee ID: "+super.getIdperson() );
        System.out.println("      Name: "+super.getName() );
        System.out.println("   salary: $"+this.salary);
        System.out.println("------------------------------------");
    }
}
