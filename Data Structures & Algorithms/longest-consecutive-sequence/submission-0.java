class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int num:nums){
            set.add(num);
        }
        if(set.isEmpty()){
            return 0;
        }
        int maxseqNumber=0;
        int currentNum;
        int currentLength;

        for(int num:set){
            if(set.contains(num-1)){
                 continue;
            }else{
                currentNum=num;
                currentLength=1;
                while(set.contains(currentNum+1)){
                     currentLength+=1;
                     currentNum+=1;
                }
                if(currentLength>maxseqNumber){
                    maxseqNumber=currentLength;
                }
            }
        }
      return maxseqNumber;

    }
}
