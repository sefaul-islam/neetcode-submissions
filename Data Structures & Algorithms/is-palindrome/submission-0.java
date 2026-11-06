class Solution {
    public boolean isPalindrome(String s) {
        int first=0;
        int second=s.length()-1;
        s=s.toLowerCase();

        while(first<second){
             
             if(!Character.isLetterOrDigit(s.charAt(first))){
                first++;
                continue;
             }
             if(!Character.isLetterOrDigit(s.charAt(second))){
                second--;
                continue;
             }
             if(s.charAt(first) != s.charAt(second)){
                return false;
             }
             first++;
             second--;
        }

        return true;
    }
}
