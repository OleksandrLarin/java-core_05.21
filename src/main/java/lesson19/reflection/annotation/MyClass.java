package lesson19.reflection.annotation;

@MyAnnotation
public class MyClass {

    @Value(value = "${name}", override = false)
    private String name;

    @Value("${secondName}")
    private String secondName;

    public MyClass(String name) {
        this.name = name;
    }

    public MyClass() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
