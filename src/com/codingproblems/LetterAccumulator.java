package com.codingproblems;

import java.util.HashMap;
import java.util.Map;

    public class LetterAccumulator {
        public static Map<Character, Integer> accumulate(String input){
            String res = input.replace(" ", "");
          Map<Character, Integer> map = new HashMap<>();
          for (char c : res.toCharArray()) {
              map.put(Character.toLowerCase(c), map.getOrDefault(c, 0) + 1);
          }
          for (Map.Entry<Character, Integer> entry : map.entrySet()){
              System.out.println(entry.getKey() + ":" + entry.getValue());
          }
          return map;
        }
    }
