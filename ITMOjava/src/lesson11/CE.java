package lesson11;

import java.util.*;

public class CE {
    public static void main(String[] args) {
        /*Set<Integer> set = new HashSet<>(8);
        //        for (int i = 0; i < 8; i++) {
        //            set.add(i * 10);
        //        }
        //        System.out.println(set);
        //        Iterator<Integer> iterator = set.iterator();
        //
        //        *//*while (iterator.hasNext()){
        //            if (iterator.next() >= 50){
        //                iterator.remove();
        //            }
        //        }*//*
        //
        //        for (Integer s : set) {
        //            if (s < 50) {
        //                System.out.println(s);
        //            }
        //        }
        //        // System.out.println(set);*/


        LinkedList<Integer> nums = new LinkedList<>();
        // adding objects to the end of the list
        nums.add(2);
        nums.add(4);
        nums.add(5);
        nums.add(7);

        // adding objects to the middle of the list
        nums.add(3, 8);
        nums.add(3, 8);
        nums.add(3, 8);
        //System.out.println(nums);
        System.out.println(nums.toString());

        for (int i : nums) { // possible to use Integer instead of int
            System.out.print(i + " ");
        }

        System.out.println();
        List<String> list2 = new ArrayList<>();
        //adding objects to the end of the list
        list2.add("Bob");
        list2.add("Bol");
        list2.add("Dol");
        list2.add("Kol");
        for (String str : list2) {
            System.out.print(str + " ");
        }

        System.out.println();
        // adding objects to the middle of the list
        list2.add(2, "NEW");
        list2.add(2, "NEW");
        list2.add(2, "NEW");

        for (String str : list2) {
            System.out.print(str + " ");
        }

        System.out.println();

        // Iterator #№1 for LinkedList
        /*Iterator<Integer> iterator = nums.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() > 1) {
                iterator.remove();
            }
        }

        System.out.println(nums);*/

        for (int i : nums) { // possible to use Integer instead of int
            System.out.print(i + " ");
        }
        System.out.println();
        // to ArrayList from LinkedList

        List<Integer> list3 = new ArrayList<>(nums);
        System.out.println(list3);

        System.out.println();

        Integer[] arrayList = list3.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arrayList));
        String[] arraySTRlist = list2.toArray(new String[0]);
        System.out.println(Arrays.toString(arraySTRlist));

        // Set
        // HashSet
        HashSet<Object> hashSet = new HashSet<>();
        hashSet.add("Hello");
        //hashSet.add("Hello"); !!! not adding a similar element to the HashSet
        hashSet.add(123);
        //hashSet.add(123);
        hashSet.add(false);
        //hashSet.add(false);
        System.out.println(hashSet);

        // TreeSet

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Fdfsd");
        treeSet.add("Bye");
        treeSet.add("Bye");
        treeSet.add("true");
        System.out.println(treeSet);


    }


}
