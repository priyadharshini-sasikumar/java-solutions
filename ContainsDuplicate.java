class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> count=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            count.put(temp,count.getOrDefault(temp,0)+1);
        }
        int flag=0;
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            if(count.get(temp)>1){
                flag=1;
            }
        }
        if(flag==1){
            return true;
        }else{
            return false;

        }
        
    }
}
