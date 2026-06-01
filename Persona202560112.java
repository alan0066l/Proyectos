public class Persona202560112 {
   private int ID=0;
   private String nombre="Nombre";
   private String curp;

    public int getID() {
        return ID;
    }

    public void calculateID(int ID) {
        this.ID = ID = (int)(Math.random()*10000+1);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }
}
