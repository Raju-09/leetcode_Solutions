/*class Solution {
    public boolean isValid(String s) {
    boolean changed = true;

    while (changed) {
        int len = s.length();
        s = s.replace("()", "")
             .replace("{}", "")
             .replace("[]", "");
        changed = (len != s.length());
    }

    return s.isEmpty();
}
}*/



class Solution {
    public boolean isValid(String s) {
        //Stack<Character> stack = new Stack<>();
    Deque<Character> st=new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {
      
                if (st.isEmpty()) return false;
                char top = st.pop();
          
                if (c == ')' && top != '(') return false;
                if (c == '}' && top != '{') return false;
                if (c == ']' && top != '[') return false;
            }
        }
        
      
        return st.isEmpty();
    }
}