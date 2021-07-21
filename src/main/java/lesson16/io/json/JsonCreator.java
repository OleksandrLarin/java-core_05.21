package lesson16.io.json;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class JsonCreator {

    private static final String QUOTED_STRING = "\"%s\"";

    private final File json;

    public JsonCreator(File json) {
        this.json = json;
    }

    public void createJson(Map<String, Object> data) {
        try (FileWriter fileWriter = new FileWriter(json)) {
            fileWriter.write(transformToJson(data));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private String transformToJson(Map<String, Object> data) {
        StringBuilder stringBuilder = new StringBuilder("{ ");

        convert(data, stringBuilder);

        stringBuilder.append(" }");
        return stringBuilder.toString();
    }

    private void convert(Map<String, Object> data, StringBuilder stringBuilder) {
        int counter = data.size();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            counter--;
            stringBuilder.append(String.format(QUOTED_STRING, entry.getKey()))
                    .append(" : ")
                    .append(getValue(entry.getValue()));
            if (counter > 0) {
                stringBuilder.append(", ");
            }
        }
    }

    private String getValue(Object value) {
        if (value instanceof Integer) {
            return String.valueOf(value);
        }
        return String.format(QUOTED_STRING, value);
    }
}
