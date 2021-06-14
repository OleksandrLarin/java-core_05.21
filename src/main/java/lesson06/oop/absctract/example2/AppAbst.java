package lesson06.oop.absctract.example2;

public class AppAbst {
    public static void main(String[] args) {
        AbstractClass abstractClass = new NonAbstractClass();

        abstractClass.info();
        System.out.println(abstractClass.getName());
    }
}
