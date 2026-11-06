class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int first =0;
        int second= numbers.length -1;
        int []result= new int[2];

        while(first < second){
            if(numbers[first] + numbers[second] < target){
                first++;
            }else if(numbers[first] + numbers[second]> target){
                second--;
            }else {
                 result[0]=first+1;
                 result[1]=second+1;
                 return result;
            }
            
        }
        return result;
    }
}
