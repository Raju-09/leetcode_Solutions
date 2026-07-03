class Solution {
    public boolean isPalindrome(String s) {
        /*StringBuilder cleaned=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isLetterOrDigit(ch))
            cleaned.append(Character.toLowerCase(ch));
        }

        String original=cleaned.toString();
        String reversed=cleaned.reverse().toString();
        return original.equals(reversed);*/

        int left=0;int right=s.length()-1;
        while(left<right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;;
            }

       char lef=Character.toLowerCase(s.charAt(left));
       char rig=Character.toLowerCase(s.charAt(right));

       if(lef!=rig) return false;
       left++;
       right--;     
            
        }
        return true;
    }
}