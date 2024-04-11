var strStr = function(haystack, needle) {
    // haystack.toLowerCase();
    // needle.toLowerCase();
    let haystackArr = haystack.toLowerCase().split('');
    let needleArr = needle.toLowerCase().split('');
    
    console.log(haystackArr)
    let firstIndex = needleArr[0];
    
    let currentChar= haystackArr.find((char) => char === firstIndex)
    let returnedIndex = haystackArr.indexOf(currentChar)

    if(currentChar){
        let i = 1;
        let j = haystackArr.indexOf(currentChar) +1
        console.log(i + ",,,," + j)
        while(i < needleArr.length && j < haystackArr.length){
            if(needleArr[i] !== haystackArr[j]){
                //haystackArr.splice(...haystackArr[j],1);
                j++
                console.log(haystackArr[j])
            }
            else{
                if(haystackArr[j] === firstIndex) {
                    returnedIndex = haystackArr.indexOf(haystackArr[j])
                }
                i++;
                j++;
            }
            // if(needleArr[i] === haystackArr[j]){
            //     if(needleArr[i++] !== haystackArr[j++]){
            //         haystackArr.splice(haystackArr[j], 1)
            //         console.log("after splice" + haystackArr)
            //     }
            //     i++;
            //     j++;
            // }else{
            //     return -1;
            // }
        }
        return haystackArr.indexOf(currentChar)
    }
};


let haystackStr = "Sdbutsad";
let needleStr = "sad";

console.log(strStr(haystackStr, needleStr))