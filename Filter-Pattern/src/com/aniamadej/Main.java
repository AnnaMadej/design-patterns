package com.aniamadej;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        ToFilter object1 = new ToFilter("obj1", 1, true);
        ToFilter object2 = new ToFilter("obj2", 2, false);
        ToFilter object3 = new ToFilter("obj3", 2, true);
        ToFilter object4 = new ToFilter("obj4", 2, false);
        ToFilter object5 = new ToFilter("obj5", 2, true);
        ToFilter object6 = new ToFilter("obj6", 2, false);
        ToFilter object7 = new ToFilter("obj7", 4, true);
        ToFilter object8 = new ToFilter("obj8", 4, false);
        ToFilter object9 = new ToFilter("ob9", 4, true);

        Predicate<ToFilter> fil = new ByNameFilter("obj");

        System.out.println(fil.test(object1));
        System.out.println(fil.test(object9));


        List<ToFilter> list = new ArrayList<>();
        list.add(object1);
        list.add(object2);
        list.add(object3);
        list.add(object4);
        list.add(object5);
        list.add(object6);
        list.add(object7);
        list.add(object8);
        list.add(object9);

        System.out.println(list);
        list = list.stream().filter(new ByNameFilter("obj")).collect(Collectors.toList());
        System.out.println(list);
        list = list.stream().filter(new ByNumberFilter(2)).collect(Collectors.toList());
        System.out.println(list);
        list = list.stream().filter(new ByOKFilter()).collect(Collectors.toList());
        System.out.println(list);


        List<ToFilter> list2 = new ArrayList<>();
        list2.add(object1);
        list2.add(object2);
        list2.add(object3);
        list2.add(object4);
        list2.add(object5);
        list2.add(object6);
        list2.add(object7);
        list2.add(object8);
        list2.add(object9);

        list2 = list2.stream()
                .filter(new ByNameFilter("ob")
                        .and(new ByNumberFilter(4))
                        .and(new ByOKFilter()))
                .collect(Collectors.toList());

        System.out.println(list2);
    }
}
