package com.spaghetticodejungle;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Whale> whaleList = Arrays.asList(
                                        new Whale("Sperm Whale",16,41),
                                        new Whale("Blue Whale", 30, 100),
                                        new Whale("Humpback Whale", 14, 30),
                                        new Whale("Southern Right Whale", 15,47)
                                        );
        HashMap<String, Whale> answer = whaleList.stream().collect(
            Collectors.teeing(
                Collectors.maxBy(Comparator.comparing(Whale::getWeight)),
                Collectors.minBy(Comparator.comparing(Whale::getWeight)),
                (result1, result2) -> {
                    HashMap<String, Whale> map = new HashMap<>();
                    map.put("MAX", result1.get());
                    map.put("MIN", result2.get());
                    return map;
                }
            ));
      System.out.println(answer);
    }
}
