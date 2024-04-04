var dic = new Object();
dic = {
    '(': ')',
    '{': '}',
    '[': ']',
};

var isValid = function(str) {
    if (str.length === 0) return "";

    stringToArray = str.split('');
    console.log(stringToArray)
    for(let i = 0; i < stringToArray.length; i++){
        let currentChar = stringToArray[i];
        console.log(dic[currentChar])
        if(!stringToArray.includes(dic[currentChar])){
            return false
        }
        let index = stringToArray.indexOf(dic[currentChar])
        stringToArray.splice(index,1)
        stringToArray.splice(i,1)  
        i--  
    }
    return true
};


let s = '()[{}]['
console.log(isValid(s))