package lesson11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CE {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(8);
        for (int i = 0; i < 8; i++) {
            set.add(i * 10);
        }
        System.out.println(set);
        Iterator<Integer> iterator = set.iterator();

        /*while (iterator.hasNext()){
            if (iterator.next() >= 50){
                iterator.remove();
            }
        }*/

        for (Integer s : set) {
            if (s < 50) {
                System.out.println(s);
            }
        }

        // System.out.println(set);
    }


}
