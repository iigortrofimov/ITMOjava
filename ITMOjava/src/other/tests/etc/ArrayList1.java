package other.tests.etc;

import java.util.ArrayList;

public class ArrayList1 {


    public static void main(String[] args) {
        String uuid1 = "123";
        String uuid2 = "1234";
        String uuid3 = "1235";
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(uuid1);
        arrayList.add(uuid2);
        arrayList.add(uuid3);
        arrayList.add(uuid3);
        System.out.println(arrayList);
        System.out.println(arrayList.indexOf(uuid1));

    }

}
