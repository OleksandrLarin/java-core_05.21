package lesson19.reflection.annotation;

import java.lang.reflect.Field;

public class ValueHandler implements Handler {
    @Override
    public void handle(Object o) {
        Field[] declaredFields = o.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            Value annotation = field.getAnnotation(Value.class);
            if (annotation != null) {
                String value = getValue(annotation);
                field.setAccessible(true);
                try {
                    if (field.get(o) == null) {
                        field.set(o, value);
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } finally {
                    field.setAccessible(false);
                }
            }
        }
    }

    private String getValue(Value annotation) {
        String value = annotation.value();
        if (value.startsWith("${") && value.endsWith("}")) {
            String propertyName = value.substring(2, value.length() - 1);
            return System.getProperty(propertyName);
        }
        return value;
    }
}
