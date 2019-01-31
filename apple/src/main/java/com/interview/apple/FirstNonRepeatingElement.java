package com.interview.apple;

import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FirstNonRepeatingElement {

    public static void main(String[] args) {
        Integer[] array = {0, 1, 3, 2, 0, 1, -3, 3, 2, 4, 5, 1, 2};
        System.out.println("First Non Repeating Element : " + getFirstNonRepeatingElement(array));
    }

    private static Integer getFirstNonRepeatingElement(Integer[] array) {
        Integer firstNonRepeatingNumber = 0;
        // create a map of numbers
        Map<Integer, Integer> numberCountMap = new HashMap();

        for(Integer i = 0 ; i < array.length ; i++) {
            Integer value = 0;
            if (numberCountMap.containsKey(array[i])) {
                value = numberCountMap.get(array[i]);
                numberCountMap.put(array[i],++value);
            } else {
                numberCountMap.put(array[i],++value);
            }
        }
        System.out.println("Initial Map: " + numberCountMap);

        try {
            Iterator<Map.Entry<Integer, Integer>> iterator = numberCountMap.entrySet().iterator();

            while(iterator.hasNext()) {
                Map.Entry<Integer, Integer> entry = iterator.next();
                if(entry.getValue() > 1) {
                    iterator.remove();
                }
            }
        }catch (ConcurrentModificationException e) {
            e.printStackTrace();
        }

        System.out.println("After removal Map: " + numberCountMap);

        for( Integer i = 0 ; i < array.length ; i++ ) {
            if (numberCountMap.containsKey(array[i]) ) {
                firstNonRepeatingNumber = array[i];
                break;
            }
        }
        return firstNonRepeatingNumber;
    }
}


