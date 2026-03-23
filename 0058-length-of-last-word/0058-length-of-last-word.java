/*class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length()-1;
        while(s.charAt(i) == ' '){
            i--;
        }
        int length = 0;
        for(int j = i;j>= 0; j--){
           if(s.charAt(j) != ' '){
                length++;
           }else{
            return length;
           }
        }
        return length;
    }
}*/

class Solution {
public int lengthOfLastWord(String s) {
    String[] words = s.split(" ");
    if (words.length == 0 ) { 
      return 0;
    }
    
    return words[words.length - 1].length();
  }
}