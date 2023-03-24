import java.util.*;
// 35. Search Insert Position

// Given a sorted array of distinct integers and a target value, return the index 
// if the target is found. If not, return the index where it would be if it were inserted in order.
// You must write an algorithm with O(log n) runtime complexity.


public class Leetcode_35{
    public static void main(String[] args) {
        int nums[] ={2,3,5,6,8,9};
        int target = 4;
        int ans = searchInsert(nums,target);
        System.out.println(ans);
    }
        public static int searchInsert(int[] nums, int target) {
            int start = 0;
            int end = nums.length-1;
    
            while(start<=end){
                int mid = start + (end - start)/2;
                if(nums[mid] == target){
                     return mid;
                }else if(nums[mid]>target){
                     end = mid - 1;
                }else {
                     start = mid + 1;
                }
            }
            return end;
        
    }

    
}
