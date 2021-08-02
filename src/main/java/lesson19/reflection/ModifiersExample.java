package lesson19.reflection;

import java.lang.reflect.Modifier;

public class ModifiersExample {
    public static void main(String[] args) {
        Model model = new Model();
        Class<? extends Model> modelClass = model.getClass();
        int modifiers = modelClass.getModifiers();

        System.out.println(Modifier.isAbstract(modifiers));
        System.out.println(Modifier.isFinal(modifiers));

        int modifiers1 = AbstractModel.class.getModifiers();
        System.out.println(Modifier.isAbstract(modifiers1));
    }
}
