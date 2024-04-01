// Test

const twoSum = (nums, target) => {
    const result = []
    for (let i = 0; i < nums.length; i++) {
        let findedElement = target - nums[i];
        if (nums.includes(findedElement)) {
            result.push(nums.indexOf(findedElement));
            result.push(i);
            break;
        } else {
            console.log('error')
        }

    }
    return result;
}

const nums = [3, 2, 4];
const result = twoSum(nums, 6);
console.log(result)