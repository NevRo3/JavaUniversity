package Control29102022.Task2;

import java.util.HashMap;
import java.util.Map;

public class Garage {
    private Map<Car,Integer> map = new HashMap<>();
    private final int maxCapacity;
    private int flag;
    public Garage(Map<Car, Integer> map, int maxCapacity){
        this.maxCapacity = maxCapacity;
        int size = 0;
        for(int i: map.values()) {size+=i;}
        if (size <= this.maxCapacity) {this.map = map; this.flag = 1;} else {this.flag = 0;}
    }
    public void cars() {}
    public void carsSortedByValue() {}
    public void carsSortedByPrice() {}
}
