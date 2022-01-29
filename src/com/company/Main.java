package com.company;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.company.collections.IdComparator;
import com.company.enums.PlaneTypes;

public class Main {

    public static void main(String[] args) {

        Plane plane = new Plane(1, 21, "first", PlaneTypes.BOING_747);
        Plane plane1 = new Plane(2, 20, "second", PlaneTypes.BOING_747);
        Plane plane2 = new Plane(1, 25, "third", PlaneTypes.BOING_999);
        Plane plane3 = new Plane(3, 24, "four", PlaneTypes.BOING_747);
        Plane plane4 = new Plane(4, 23, "five", PlaneTypes.BOING_747);
        Plane plane5 = new Plane(5, 22, "six", PlaneTypes.BOING_747);
        Plane plane6 = new Plane(5, 22, "seven", PlaneTypes.BOING_747);

        //arrayList from planes
        List<Plane> planes = new ArrayList<>();
        planes.add(plane5);
        planes.add(plane6);
        planes.add(plane);
        planes.add(plane1);
        planes.add(plane2);
        planes.add(plane3);
        planes.add(plane4);
        System.out.println(planes);

        TreeSet<Plane> planesSorted = new TreeSet<>(new IdComparator());
        planesSorted.add(plane);
        planesSorted.add(plane1);
        planesSorted.add(plane2);
        planesSorted.add(plane3);
        planesSorted.add(plane4);
        planesSorted.add(plane5);
        planesSorted.add(plane6);
        System.out.println("sorted: " + planesSorted);

        //hashSet from planes
        Set<Plane> noDuplicatesPlanes = new HashSet<>(planes);
        System.out.println(noDuplicatesPlanes);

        //treeMap
        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "MONDAY");
        map.put(2, "TUESDAY");
        map.put(3, "WEDNESDAY");
        map.put(4, "NULL");
        System.out.println(map);

        //treeSet without duplicates and sorted
        Set<String> stringsSet = new TreeSet<>();
        stringsSet.add("one");
        stringsSet.add("two");
        stringsSet.add("one");
        stringsSet.add("three");
        System.out.println(stringsSet);


    }
}
