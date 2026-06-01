public class Empleado202560112 extends Persona202560112{
    private int clave=10000;
    private String departamento="Tesorería";
    private String puesto="Cajera";
    private char estatus='A';
    
    public void displayEmployeeInformation(){
        System.out.println("----------Información del Empleado---------");
        System.out.println("            ID: "+super.getID());
        System.out.println("          Name: "+super.getNombre());
        System.out.println("         clave: "+this.clave);
        System.out.println("  Departamento: "+this.departamento );
        System.out.println("        Puesto: "+this.puesto);
        System.out.println("--------------------------------------------");
    }
    public Empleado202560112(String nom,String cut,int cla,String dep,String pue,char est){
        super.calculateID(cla);
        super.setNombre(nom);
        super.setCurp(cut);
        clave = cla;
        departamento = dep;
        puesto = pue;
        estatus = est;
    }
}

