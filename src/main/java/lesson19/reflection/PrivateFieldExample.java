package lesson19.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class PrivateFieldExample {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Model model = new Model();
        Field publicNameField = model.getClass().getDeclaredField("name");
        if (!Modifier.isPublic(publicNameField.getModifiers())) {
            publicNameField.setAccessible(true);
            publicNameField.set(model, "Private Name");
            publicNameField.setAccessible(false);
        } else {
            publicNameField.set(model, "Private Name");
        }
        System.out.println(model.getName());

        model.setName("New name");
    }
}
