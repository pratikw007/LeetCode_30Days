public class Leetcode_167{
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;

        while(left<right){
            int sum = numbers[left] + numbers[right];
            if(sum == target){
                return new int[]{left+1,right+1};
            }
             if(sum < target){
                left++;
            }else{
                right--;
            }
        }
        return new int[] {};
}
public static void main(String[] args) {
    // int numbers[] = {2,7,11,15};
    // int target = 9;
    int ans = twoSum({2,7,11,15},9);
    System.out.println(ans);
}
}