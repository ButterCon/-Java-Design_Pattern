package com.maizer2.Creational_Pattern.Singleton.Prac02;

import java.util.HashMap;

public class index {
    HashMap<String, String> map = new HashMap<String, String>(){{
        put("name", "Hyeonwoo");
        put("version", "1.0");
    }};

    public HashMap conf() {
        return map;
    }
}
