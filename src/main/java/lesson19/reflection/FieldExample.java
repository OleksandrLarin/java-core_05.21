package lesson19.reflection;

import java.lang.reflect.Field;

public class FieldExample {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Field[] fields = Model.class.getFields();
        Field[] declaredFields = Model.class.getDeclaredFields();

        System.out.println("Fields: " + fields.length);
        System.out.println("Declared fields: " + declaredFields.length);
        for (Field field: declaredFields) {
            System.out.println("Field name: " + field.getName());
            System.out.println("Field type: " + field.getType().getSimpleName());
        }

        Model model = new Model();
        Field publicNameField = model.getClass().getField("publicName");
        Object o = publicNameField.get(model);
        System.out.println(o);
        publicNameField.set(model, "Public Name");
        System.out.println(publicNameField.get(model));

    }
}
