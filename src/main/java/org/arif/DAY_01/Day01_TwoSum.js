/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
/*const twoSum = function (nums, target) {
    let result = [];
    for (let i = 0; i < nums.length - 1; i++) {
        for (let j = i + 1; j < nums.length; j++) {
            if (nums[i] + nums[j] === target) {
                result.push(i);
                result.push(j);
            }
        }
    }
    return result;
};*/

const nums = [2, 7, 11, 5];
const target = 9;

//const result = twoSum(nums, target);
//console.log(result);

// another approach
/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
const twoSum2 = (nums, target) => {
    const result = []
    const n = nums.length
    const map = new Map();

    for (let i = 0; i < n; i++) {
        let remained = target - nums[i];

        if (map.has(remained)) {
            result.push(map.get(remained));
            result.push(i);
            break;
        }
        map.set(nums[i], i);
    }

            return result;
};

const result2 = twoSum2(nums, target)
console.log(result2)