package lesson17.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class App {
    public static void main(String[] args) {
        String json = "{'brand': 'Tesla', 'model': 'Model S'}";
        Gson gson = new Gson();
        Car car = gson.fromJson(json, Car.class);
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Model: " + car.getModel());


        String carJson = gson.toJson(car);
        System.out.println(carJson);
//
//        try (FileWriter fileWriter = new FileWriter("src/main/resources/lesson17/car.json")){
//            fileWriter.write(carJson);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        Gson gsonWithNulls = new GsonBuilder().serializeNulls().create();

        System.out.println(gsonWithNulls.toJson(car));
    }
}
