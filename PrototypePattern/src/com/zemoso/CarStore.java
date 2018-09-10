package com.zemoso;

import java.util.HashMap;
import java.util.Map;


public class CarStore {
    private static Map<String, CarPrototype> carMapping = new HashMap<String, CarPrototype>();

    static
    {
        carMapping.put("Swift", new Swift());
        carMapping.put("Scorpio", new Scorpio());
    }

    public static CarPrototype getCar(String carName)
    {
        return (CarPrototype) carMapping.get(carName).clone();
    }
}
