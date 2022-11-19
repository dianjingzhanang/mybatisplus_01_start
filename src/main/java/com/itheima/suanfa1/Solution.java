package com.itheima.suanfa1;

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int max;
        int k=nums.length;
        for(int j=0;j<nums.length;j++){
            for(int i=0;i+1<k;i++){
                if(nums[i]>nums[i+1]){
                    max=nums[i];

                    nums[i]=nums[i+1];

                    nums[i+1]=max;
                }
            }
            k--;//循环完一次内循环就减少一次
        }
        int a=nums.length-1,count=1,b=nums[a];
        while(a>0){
            if(b>=target){
                return count;
            }else{
                a--;
                b+=nums[a];
                count++;
            }

            if(b>=target){
                return count;
            }
        }
        return 0;

    }
}