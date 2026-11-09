class Solution {
    public int maxArea(int[] heights) {
        
        int maxResult=0;

        int i=0;
        int j=heights.length-1;

        while(i<j){
             
            int tempRes= (j-i)*Math.min(heights[i],heights[j]);
            if(tempRes > maxResult){
                maxResult = tempRes;
            }
            if(heights[i] < heights[j]){
                i++;
            }else{
                j--;
            }
            
        }
        return maxResult;
    }
}
