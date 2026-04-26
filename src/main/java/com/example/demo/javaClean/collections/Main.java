package com.example.demo.javaClean.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // ArrayList - динамический массив который перестраивается
        List<String> list = new ArrayList<>();

        list.add("Str1");
        list.add("Str2");
        list.add("Str3");
        list.add("Str4");
        list.add("Str5");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(i);
        }

        for (String s : list) {
            System.out.println(s);
        }

        list.forEach(System.out::println);

        // hashCode - цифры элемент его код

        // LinkedList [ [prev] [1] [next]] [[prev] [2] [next]] [[prev] [3] [next]]]
        // 1 элемента нет prev и так по цепочке, элемент добавляется в конец списка
        List<Integer> linkedList = new LinkedList<>();

        // Когда лучше использовать?
        // ArrayList - элемент достается в одно действие, LinkedList - будет проходится
        // по всему листу // 95% ArrayList

        // HashSet - хранит только уникальные значения - в хаотичном порядке
        // str3,str1,str2
        Set<String> ourSet = new HashSet<>();

        // Что б был порядок по добавлению в каком мы добавили - str1,str2,str3
        Set<String> ourSetLinked = new LinkedHashSet<>();

        // хранит в упорядочном виде по возрастанию
        Set<String> ourSetTree = new TreeSet<>();

        ourSet.add("str1");
        ourSet.add("str2");
        ourSet.add("str3");

        ourSet.contains("str1");

        // через stream преобразовано в лист или ArrayList(принимает колекцию) - дальше
        // работаем как с ArrayList
        List<String> liststream = ourSet.stream().toList(); //
        List<String> liststreamList = new ArrayList<>(ourSet); //

        // Map - ключ | значение , key - уникальный - одинаковые перезапишуться
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> mapTree = new TreeMap<>();
        Map<String, Integer> mapLinked = new LinkedHashMap<>();

        // если hashCode !== hashCode2 - обьекты разные
        // если hashCode == hashCode2 - то это еще не говорит о том что они одинаковые,
        // equals - вступает в работу

        map.put("Иван", 20);
        map.put("Сергей", 30);

        checkAge(map.get("Иван")); // 20 > 18 - Ok

        System.out.println(map); // Иван - 20, Сергей - 30
    }

    public static void checkAge(Integer age) {
        if (age >= 18) {
            System.out.println("oke");
        } else {
            System.out.println("young");
        }
    }

}
