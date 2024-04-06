/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
 */

/**
 * @param {number[]} nums
 * @return {number}
 */
const removeDuplicates = function(nums) {
    let unique = 1;

    for(let i = 1; i < nums.length; i++){
        if(nums[i] !== nums[i-1]){
            nums[unique] = nums[i];
            unique++;
        }
    }
    console.log(nums)
    return unique;
};


const nums = [0,0,1,1,1,1,2,3,4];
const result = removeDuplicates(nums);
console.log(result);
