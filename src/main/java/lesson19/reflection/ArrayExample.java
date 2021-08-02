package lesson19.reflection;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int[] ints = new int[]{22, 33, 55, 11};
        int o = (int) Array.get(ints, 2);
        System.out.println(o);

        Array.set(ints, 1, 99);
        System.out.println(ints[1]);

        String[] strings = (String[]) Array.newInstance(String.class, 9);

        strings[0] = "Zero";
        System.out.println(Arrays.toString(strings));

        System.out.println(strings.getClass().getName());
        System.out.println(ints.getClass().getName());
        System.out.println(new double[]{}.getClass().getName());
        System.out.println(new short[]{}.getClass().getName());
        System.out.println(new long[]{}.getClass().getName());
        System.out.println(new boolean[]{}.getClass().getName());

        String str = "123";
        Object[] objects = createNewArray(str, 19);

        System.out.println(Arrays.toString(objects));
    }

    private static Object[] createNewArray(Object o, int length) {
        Object[] objects = (Object[]) Array.newInstance(o.getClass(), length);
        objects[0] = o;
        return objects;
    }
}
