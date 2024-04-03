const longestCommonPrefix = function(strs) {
    if (strs.length === 0) return "";

    let answer = strs[0];
    for (let i = 1; i < strs.length; i++) {
        console.log(strs[i].indexOf(answer));
        while (strs[i].indexOf(answer) !== 0) {
            answer = answer.substring(0, answer.length - 1);
            if (answer === "") {
                return "";
            }
        }
    }
    return answer;
};

const strs = ["flower", "flower", "good"];
const answer = longestCommonPrefix(strs);
console.log(answer);