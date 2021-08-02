package lesson19.reflection;

import java.lang.reflect.Method;

public class MethodExample {
    public static void main(String[] args) throws Exception {
        Model model = new Model();
        Method[] methods = Model.class.getMethods();

        for (Method method: methods) {
            System.out.println(method.getName());
        }

        Method setNameMethod = Model.class.getMethod("setName", String.class);
        setNameMethod.invoke(model, "New Name");

        Method getNameMethod = Model.class.getMethod("getName");
        Object invoke = getNameMethod.invoke(model);
        System.out.println(invoke);
    }
}
