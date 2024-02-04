
// Remove Duplicates from Sorted Array
import java.util.HashMap;

class question_3 {
    public static int removeDuplicates(int[] nums) {

        int k = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " " + hashMap.containsValue(nums[i]));
            if (!hashMap.containsKey(nums[i])) {
                hashMap.put(nums[i], 1);
                nums[k] = nums[i];
                k++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        return k;

    }

    public static void main(String args[]) {
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int result = removeDuplicates(nums);
        System.out.println(result);
    }
}



// class Solution {
//     public int removeDuplicates(int[] nums) {
//         int prev = nums[0];
//         int k = 1;

//         for(int i = 1; i < nums.length; i++) {
//             int cur = nums[i];

//             if(prev != cur) {
//                 nums[k] = cur;
//                 k++;
//             }

//             prev = cur;
//         }

//         return k;
//     }
// }