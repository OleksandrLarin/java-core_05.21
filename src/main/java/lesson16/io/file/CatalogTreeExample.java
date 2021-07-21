package lesson16.io.file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CatalogTreeExample {
    public static void main(String[] args) {
        CatalogTreeExample catalogTree = new CatalogTreeExample();
        List<String> allFiles = catalogTree.getAllFiles(new File("src/main/java"));
        for (String path : allFiles){
            System.out.println(path);
        }
    }

    public List<String> getAllFiles(File path) {
        List<String> files = new ArrayList<>();
        if (path.exists()){
            for (File file : path.listFiles()) {
                files.add(file.getAbsolutePath());
            }
        }
        return files;
    }
}
