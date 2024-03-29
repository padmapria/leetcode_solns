/*
Given two positive integers a and b, return the number of common factors of a and b.

An integer x is a common factor of a and b if x divides both a and b.

Example 1:

Input: a = 12, b = 6
Output: 4
Explanation: The common factors of 12 and 6 are 1, 2, 3, 6.
Example 2:

Input: a = 25, b = 30
Output: 2
Explanation: The common factors of 25 and 30 are 1, 5.
 
*/

class Solution {
    public int commonFactors(int a, int b) {
        int num = a;
        if(a>b){
            num = b;
        }

        int sum=0;
        for(int i=1; i<=num;i++){
            if(a%i==0 && b%i==0){
                sum+=1;
            }
        }

        return sum;

    }
}

/*
Power of Two
Given an integer n, return true if it is a power of two. Otherwise, return false.

An integer n is a power of two, if there exists an integer x such that n == 2x.

Example 1:

Input: n = 1
Output: true
Explanation: 20 = 1
Example 2:

Input: n = 16
Output: true
Explanation: 24 = 16
Example 3:

Input: n = 3
Output: false
 
Constraints:

-231 <= n <= 231 - 1

*/

class Solution {
    public boolean isPowerOfTwo(int n) {
        boolean is_power_ofTwo= false;
        long power_val = 0;
        int i=0;
        while(n>power_val){
            power_val= (long) Math.pow(2, i);

            if(power_val==n){
                return true;
            }
            i+=1;
        }
        return is_power_ofTwo;
    }
}

/*
Majority Element
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
*/
import java.util.HashMap;
class Solution {
    public int majorityElement(int[] nums) {

        HashMap<Integer,Integer> hm = new HashMap<>();

        int rep_no = 0;
        int max_count =0;
        for(int i=0;i<nums.length;i++){
            
            int value =  1;

            if (hm.containsKey(nums[i])) {
                value+= hm.get(nums[i]);
                hm.put(nums[i], value);
            } else {
                hm.put(nums[i], value);  
            }


            if(max_count<value){
                max_count= value;
                rep_no = nums[i];
            }
        }
        return rep_no;
    }
}