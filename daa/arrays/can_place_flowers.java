// You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.

// Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.

 

// Example 1:

// Input: flowerbed = [1,0,0,0,1], n = 1
// Output: true
// Example 2:

// Input: flowerbed = [1,0,0,0,1], n = 2
// Output: false


class Solution {
    public boolean canPlaceFlowers(int[] x, int n) {
        if(n==0)return true;
        for(int i=0;i<x.length; i++){

            if(x[i]!=1 && (i==x.length-1 || x[i+1]==0) && (i==0 || x[i-1]==0 )  ){
                x[i]=1;
                n--;
                if(n==0)return true;
            }
        }
        return false;
    }
}
