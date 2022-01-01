//128. Longest Consecutive Sequence

class Solution {
    public int longestConsecutive(int[] nums) {
        
        int longestSequence=0;
        Set<Integer> numberSet = new HashSet<Integer>();
        
        for (int num : nums) {
            numberSet.add(num);
        }

        for (int num : numberSet) {
            if (!numberSet.contains(num-1)) {
                int curNum = num;
                int curSequence = 1;
                while (numberSet.contains(curNum+1)) {
                    curNum += 1;
                    curSequence += 1;
                }
                longestSequence = Math.max(longestSequence, curSequence);
            }
        }
        return longestSequence;
    }
}
