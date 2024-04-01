/**
 * @param {number} x
 * @return {boolean}
 */
const isPalindrome = function (x) {
    const s = x.toString();
    const reversedS = s.split("").reverse().join("");
    return s === reversedS;
}
//
// const isPalindrome = function (x) {
//
//     if (x < 0) return false;
//
//     let reversed = 0;
//     let temp = x;
//     while (temp > 0) {
//         const digit = temp % 10;
//         reversed = reversed * 10 + digit;
//         temp = parseInt(temp / 10);
//     }
//     return reversed === x;
//
// }
//

const x = 121;
const check = isPalindrome(x);
console.log(check);
/**
 * 9. Palindrome Number
 * Given an integer x, return true if x is a
 * palindrome
 * , and false otherwise.
 *
 *
 *
 * Example 1:
 *
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 * Example 2:
 *
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 *
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 */