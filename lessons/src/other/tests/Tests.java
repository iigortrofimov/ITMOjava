package other.tests;

import java.util.Arrays;

public class Tests {
    static int[] nums = new int[10];

    public static void main(String[] args) {

//        for (int i=0; i< nums.length-1; i++){
//            nums[i] = "FULL" + i;
//        }
        nums[0] = 2;
        nums[1] = 4;
        nums[2] = 6;
        nums[3] = 8;
        nums[4] = 10;
        nums[5] = 12;
        nums[6] = 14;
        nums[7] = 16;
        nums[8] = 18;
        nums[9] = 20;
        System.out.println(Arrays.toString(nums));
        System.out.println("------------------");
        System.out.println(Math.abs(Arrays.binarySearch(nums, 7)) - 1);
        System.out.println();
        int index = Math.abs(Arrays.binarySearch(nums, 7)) - 1;
//        for (int i = 7; i >= index; i--){  // size = 7
//            nums[i+ 1] = nums[i];
//        } nums[index] = 7;
        System.arraycopy(nums, index + 1, nums, index, 7 - 1);
        nums[9] = 0;
        //nums[index] = 7;

//System.arraycopy(storage, index + 1, storage, index, size - index);
        System.out.println(Arrays.toString(nums));


    }

}
