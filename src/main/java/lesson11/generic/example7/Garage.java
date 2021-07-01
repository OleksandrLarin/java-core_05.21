package lesson11.generic.example7;

import java.util.ArrayList;
import java.util.List;

public class Garage<T extends Vehicle> {
    private List<T> vehicles = new ArrayList<>();

    public void add(T vehicle) {
        vehicles.add(vehicle);
    }

    public T get(int index) {
        return vehicles.get(index);
    }

    public List<T> getByType(Class<T> type) {
        List<T> newList = new ArrayList<>();
        for (T vehicle : vehicles) {
            if (type.isInstance(vehicle)) {
                newList.add(vehicle);
            }
        }
        return newList;
    }
}
