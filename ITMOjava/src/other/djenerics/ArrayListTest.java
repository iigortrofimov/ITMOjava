package other.djenerics;

import java.io.IOException;
import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) throws IOException{
        int[]a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
      //  ArrayList<Integer> list = new ArrayList<Integer>();

        ArrayList<Integer> evenList = new ArrayList<Integer>();
        ArrayList<Integer> oddList = new ArrayList<Integer>();

        for(int i = 0; i <a.length; i++){
            if (a[i] % 2 == 0){
                if (a[i] == 0){
                }
                else evenList.add(a[i]);
            }
           else oddList.add(a[i]);
        }
        System.out.println(evenList + " " + oddList);

        ArrayList<Integer> resault = new ArrayList<Integer>();
        resault.addAll(evenList);
        resault.addAll(oddList);
        System.out.println(resault);
        System.out.println("---------------------");

        for (Integer x: resault){
            System.out.println(x);
        }
        //evenList.addAll(oddList);
        //System.out.println(evenList);

    }
}
