package lesson19.reflection.annotation;

public class MyAnnotationHandler {
    public void handle(Object o) {
        MyAnnotation annotation = o.getClass().getAnnotation(MyAnnotation.class);
        if (annotation != null) {
            System.out.println("Object annotated by MyAnnotation.class " + o);
        }
    }
}
