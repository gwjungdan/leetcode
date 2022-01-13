//198. House Robber
// dp문제
// 갈 수 있는 곳을 뒤에서부터 계산

class Solution {
    public int rob(int[] nums) {
        int d[][]= new int[nums.length][2];
        
        d[nums.length-1][0]= 0;
        d[nums.length-1][1]= nums[nums.length-1];
        
        for(int i = nums.length-2; i>=0; i--){
            d[i][0] = Math.max( d[i+1][0] , d[i+1][1] );            
            d[i][1] = nums[i] + d[i+1][0];
        }
        return Math.max(d[0][0],d[0][1]);
    }
        
}
