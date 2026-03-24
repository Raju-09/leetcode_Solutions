/*class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length == 1) {
            List<Integer> singleList = new ArrayList<>();
            singleList.add(nums[0]);
            res.add(singleList);
            return res;
        }

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int[] remainingNums = new int[nums.length - 1];
            int index = 0;
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    remainingNums[index] = nums[j];
                    index++;
                }
            }
            
            List<List<Integer>> perms = permute(remainingNums);
            for (List<Integer> p : perms) {
                p.add(n);
            }
            
            res.addAll(perms);
        }
        
        return res;        
    }
}*/

class Solution {
    public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>> res = new ArrayList<>();
       List<Integer> ds = new ArrayList<>();
       boolean[] map = new boolean[nums.length];
       find(res, ds, map, nums);
       return res;
    }
    
    public void find(List<List<Integer>> res, List<Integer> ds, boolean[] map, int[] nums){
        if(ds.size()==nums.length){
            res.add(new ArrayList<>(ds));
            return;
        }

        for(int i = 0; i < nums.length; i++){
            if(!map[i]){
                map[i]= true;
                ds.add(nums[i]);
                find(res, ds, map, nums);
                map[i]=false;
                ds.remove(ds.size()-1);
            }
        }
    }
}