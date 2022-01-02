//55. Jump Game
class Solution {
    public boolean canJump(int[] nums) {
        boolean [] d = new boolean[nums.length+1];
        
        d[nums.length-1] = true;
        
        for(int i=nums.length-2; i>=0; i--){
            d[i] = false;
            for(int j=0; j<=nums[i]; j++){
                if(i + j <= nums.length-1 && d[i+j] == true){
                    d[i] = true;
                    break;
                }
            }
            
        }
        return d[0];
    }
}
