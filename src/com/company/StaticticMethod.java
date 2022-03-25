package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StaticticMethod {

    public static String statisticMethod() {

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        String s = "Философия – одна из древнейших наук.";

        char[] chars = s.toCharArray();
        for (char a : chars) {
            if (map.containsKey(a)) {
                int value = map.get(a);
                map.put(a, value + 1);
            } else {
                map.put(a, 1);
            }
        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pairs = (Map.Entry) it.next();
            System.out.println(pairs.getKey() + " = " + pairs.getValue());
        }
        return s;
    }
}

