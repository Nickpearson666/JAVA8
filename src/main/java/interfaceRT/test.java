package interfaceRT;

import java.util.*;

public class test {
//    TC & ST
//Question
//Given an integer array nums,
// return true if any value appears at least twice in the array, and return false if every element is distinct.
//Example 1:
//Input: nums = [1,2,3,1]
//Output: true
//Example 2:
//Input: nums = [1,2,3,4]
//Output: false
//Example 3:
//Input: nums = [1,1,1,3,3,4,3,2,4,2]
//Output: true
    //TC -> O(n)
    //SC -> O(n) ->0(1)

    public static boolean isDuplicated(int[] arr){
        //pipe line 分支优化
        if(arr == null || arr.length <= 1){
            return true;
        }
        Set<Integer> set = new HashSet<>();
        for(int num: arr){
            if(!set.add(num)){
                return true;
            }
        }
        return false;
    }


//
//    Given an integer array nums and an integer k, return true if there are two distinct
//    indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
//            Example 1:
//    Input: nums = [1,2,3,1], k = 3
//    Output: true
//    Example 2:
//    Input: nums = [1,0,1,1], k = 1
//    Output: true
//    Example 3:
//    Input: nums = [1,2,3,1,2,3], k = 2
//    Output: false


    //Input: nums = [1,2,3,1], k = 3
    //1 -> 0, 1
    //1- >
//    public static boolean isSame(int[] arrs, int k){
//        Map<Integer, Set<Integer>> indexMap = new HashMap<>();
//        for(int i = 0; i < arrs.length; i++){
//            indexMap.putIfAbsent(arrs[i], new HashSet<>());
//            indexMap.get(arrs[i]).add(i);
//        }
//        for(int key: indexMap.keySet()){
//            Set<Integer> set = indexMap.get(key);
//            for(int num: set){
//                // 3 - 0 3
//                int tmp = Math.max(num - k, 0);
//                //System.out.println(tmp);
//                for(int i = 0; i <= tmp; i++){
//                    if(set.contains(i) && i != num
//                            && Math.abs(num - i) <= k){
//                        //System.out.println(i+"   "+num);
//                        return true;
//                    }
//                }
//            }
//        }
//        return false;
//    }

    public static boolean isSame(int[] arrs, int k){
        if(arrs != null && arrs.length >= 2){
            Map<Integer, Integer> indexMap = new HashMap<>();
            for(int i = 0; i < arrs.length; i++){
                if(indexMap.containsKey(arrs[i])){
                    int prevIdx = i - indexMap.get(arrs[i]);
                    if(prevIdx <= k){
                        return true;
                    }
                }
                indexMap.put(arrs[i], i);

            }
        }
        return false;
    }

    public static void main(String[] args) {
        //int[] arrs = new int[]{1,2,3,1};
        //int[] arrs = new int[]{1,2,3,1,2,3};
        int[] arrs = new int[]{1,0,1,1};
        System.out.println(isSame(arrs, 1));
    }
}
