package com.example.daniloenriquediazrios.academia;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;



/**
 * Created by daniloenriquediazrios on 22/08/17.
 */

public class Singleton {

    public Map<String, Object> memoria;

    private static Singleton instance = null;

    private Singleton() {
        memoria = new HashMap<String,Object>();
    }

    public static Singleton getInstance()
    {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }


}
