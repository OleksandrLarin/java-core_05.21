package lesson19.reflection.name;

import lesson19.reflection.Model;

public class AppExample {
    public static void main(String[] args) {
        Model model = new Model();
        Class<? extends Model> modelClass = model.getClass();

        System.out.println(modelClass.getName());
        System.out.println(modelClass.getSimpleName());
    }
}
