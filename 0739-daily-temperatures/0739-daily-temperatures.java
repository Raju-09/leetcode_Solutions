class Solution {
    public int[] dailyTemperatures(int[] temp) {
       /* int n=temp.length;
        int[] a=new int[n];
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<n;i++){
            while(!st.isEmpty() && temp[i]>temp[st.peek()]){
                int index=st.pop();
                a[index]=i-index;
            }
            st.push(i);

        }
        return a;
        
    }
}

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stk = new ArrayDeque<>();
        int[] result = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++){
            while(!stk.isEmpty() && temperatures[i] > temperatures[stk.peek()]){
                int curr = stk.pop();
                result[curr] = i - curr;
            }
            stk.push(i);
        }
        return result;*/

        int n=temp.length;
        int[] ans=new int[n];
        Deque<Integer> deq=new ArrayDeque<>();

        for(int i=n-1;i>=0;i--){
            while(!deq.isEmpty() && temp[i]>=temp[deq.peek()]){
                deq.pop();
            }
            ans[i]=deq.isEmpty() ? 0 : deq.peek()-i;
            deq.push(i);
        }

        return ans;
    }
}
