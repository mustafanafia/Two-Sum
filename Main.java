import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] nums = {3,2,3};
        int target = 6;

        Main o = new Main();

        System.out.println((o.twoSum(nums, target)));
    }

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> hm = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {

            int res = target - nums[i];

            if (!hm.containsKey(res)) {
                hm.put(nums[i], i);
            } else {
                return new int[]{hm.get(res), i};
            }

        }
        return nums;
    }


}


// Brute Force Solution (Not efficient)
/*
    public int[] twoSum(int[] nums, int target) {

        int first_index = 0;
        int second_index = 1;

        int[] res = new int [2];

        for(int i=0; i< nums.length-1; i++){
            int pt_1 = nums[first_index];
            int pt_2 = nums[second_index];
            if(pt_1 + pt_2 != target){
                first_index++;
                second_index++;
            }
            else{
                 res[0] = first_index;
                 res[1] = second_index;
            }
        }

        return res;


    }
 */