
var isPalindrome = function(x) {
    let originArr = x.toString().split('')
  
    let reversedArr = [...originArr].reverse();
    
    if(originArr.join('') === reversedArr.join('')){
        return true
    }else{
        return false
    }
};

//isPalindrome(12134)
console.log(isPalindrome(121))