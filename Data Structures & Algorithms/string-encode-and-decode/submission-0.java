class Solution {

    public String encode(List<String> strs) {

        String encodedString="";
        for(String str: strs){
            encodedString+=str.length() + "#" + str;
        }
        return encodedString;

    }

    public List<String> decode(String str) {
          
          List<String> decodedList = new ArrayList<>();
          int index=0;

          while(index<str.length()){
            int start = index;

            while(str.charAt(index)!='#'){
                index++;
            }
            int length = Integer.parseInt(str.substring(start,index));
            index++;
            decodedList.add(str.substring(index,index+length));
            index+=length;

          }
          return decodedList;
          
    }
}
