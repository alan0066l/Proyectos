public class Person {
    private int idperson;
    private String name;

    public int getIdperson() {
        return idperson;
    }

    public void calculaterID() {
        this.idperson = (int)(Math.random()*1000);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
