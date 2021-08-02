package lesson19.reflection;

import java.lang.reflect.Method;

public class PrivateMethodExample {
    public static void main(String[] args) throws Exception {
        Model model = new Model();

        Method getSecretInfo = Model.class.getDeclaredMethod("getSecretInfo");

        getSecretInfo.setAccessible(true);
        getSecretInfo.invoke(model);
        getSecretInfo.setAccessible(false);
    }
}
