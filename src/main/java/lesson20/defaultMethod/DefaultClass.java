package lesson20.defaultMethod;

public class DefaultClass implements DefaultMethodExample{
    @Override
    public String getInfo() {
        System.out.println("Abstract method");
        return "null";
    }
}
