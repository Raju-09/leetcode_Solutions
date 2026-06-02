class Solution {
    public int findNumbers(int[] nums) {
     /*   int count = 0;
        for (int i : nums) {
            if (countDigits(i) % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    private int countDigits(int x) {
        int cnt = 0;
        while (x > 0) {
            x /= 10;
            cnt++;
        }
        return cnt;
    }*/

  
      /*  int count = 0;
        for (int i : nums) {
            int digits = (int)(Math.log10(i)) + 1;
            if (digits % 2 == 0) {
                count++;
            }
        }
        return count;
    }*/


int even=0;
for(int i =0;i<nums.length;i++){
            if((((int)Math.log10(nums[i]) + 1 ) & 1 ) == 0){
                even++;
            }
        }
        return even;
    }

    
}