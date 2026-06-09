#SELECTION SORT

```
class Solution {
    public int[] selectionSort(int[] nums) {
        int min;
        int index;
        for(int i=0;i<nums.length;i++){
            min= nums[i];
            index=i;
            for(int j=i;j<nums.length;j++){
               if(min>nums[j]){
                min=nums[j];
                index=j;
               }
            }
            int temp=nums[i];
            nums[i]=min;
            nums[index]=temp;
        }
        return nums;
    }
}
```