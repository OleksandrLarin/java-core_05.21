package lesson19.reflection;

public class Model extends AbstractModel{
    private int number;
    private String name;
    public String publicName;

    public Model(int number, String name) {
        this.number = number;
        this.name = name;
    }

    private Model(String name) {
        this.name = name;
    }

    public Model() {

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Setter is Used");
        this.name = name;
    }

    private void getSecretInfo() {
        System.out.println("Secret info");
    }
}
