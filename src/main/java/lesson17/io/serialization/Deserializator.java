package lesson17.io.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializator {
    public Object deserialize(File source) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(source))) {
            return inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new Object();
    }
}
