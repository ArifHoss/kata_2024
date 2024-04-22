var strStr = function(haystack, needle) {
    let haystackArr = haystack.split('');
    let needleArr = needle.split('');
    
    let firstIndex = needleArr[0];
    
    let currentChar =haystackArr.find((char) => char === firstIndex)

    if(currentChar){
        let i = 1;
        let j = haystackArr.indexOf(currentChar) +1
        console.log(i + ",,,," + j)
        while(i < needleArr.length && j < haystackArr.length){
            if(needleArr[i] === haystackArr[j]){
                i++;
                j++
            }else{
                return -1;  
            }
        }
        return haystackArr.indexOf(currentChar)
    }

};


let haystackStr = "sadbutsad";
let needleStr = "sadg";

console.log(strStr(haystackStr, needleStr))