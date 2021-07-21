package lesson16.io.json;

import java.io.File;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        File json = new File("src/main/resources/test.json");
        JsonCreator jsonCreator = new JsonCreator(json);
        DataProvider dataProvider = new DataProvider();

        Map<String, Object> data = dataProvider.getData();

        jsonCreator.createJson(data);
    }
}
