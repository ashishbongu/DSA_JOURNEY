# Bubble Sort 

#### brute force
```
class Solution {
    public int[] bubbleSort(int[] nums) {
        for(int j=nums.length-1;j>0;j--){
            for(int i =0;i<j;i++){
            if(nums[i]>nums[i+1]){
                int temp = nums[i];
                nums[i]=nums[i+1];
                nums[i+1]=temp;
            }
        }
        }
        return nums;
    }
}

```