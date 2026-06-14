import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++){
             for (int j = i + 1; j < nums.length; j++){
                  int sum =nums[i]+nums[j];
                  if(sum==target){
                      return new int[]{i, j};
            }
        }
        }
        return null;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Size:");
        int size=sc.nextInt();
        System.out.println("Target:");
        int target=sc.nextInt();
        int nums[]=new int[size];
        for(int i=0;i<size;i++){
            nums[i]=sc.nextInt();
        }
        Arrays.sort(nums);
        Solution sol =new Solution();
        int[] result= sol.twoSum(nums,target);
        if(result==null){
            System.out.println("No pair");
        }else{
            System.out.println("[" + result[0] + ", " + result[1] + "]");
        }
        sc.close();
    }

}
