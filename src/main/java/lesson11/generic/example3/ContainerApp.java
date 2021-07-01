package lesson11.generic.example3;

public class ContainerApp {
    public static void main(String[] args) {
        Container rawContainer = new Container("Raw");
        rawContainer.setItem(10);


        Integer item = (Integer) rawContainer.getItem();
        System.out.println(item);

        Container<Integer> integerContainer = new Container<>("Integer");
        integerContainer.setItem(110);

        Integer integer = integerContainer.getItem();
    }
}
