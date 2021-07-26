package lesson17.io.serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializator {
    public void serialize(Object object, File target) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(target))){
            outputStream.writeObject(object);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
