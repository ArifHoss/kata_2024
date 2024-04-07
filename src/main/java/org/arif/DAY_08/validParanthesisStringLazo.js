var checkValidString = function(s) {
    var dec = new Object;
    dec = {
        '(' : ')',
        ')' : '(',
        '*' : ['(', ')', '']
    }
    let arr = s.split('')
    let index = 0;
    for(let i = 0; i < arr.length; i++){
        let currentChar = arr[i];
        if(currentChar != '*'  && !arr.includes(dec[currentChar])){
            if(arr.includes('*')){
                index = arr.indexOf('*')
                arr.splice(i,1)
                arr.splice(index, 1)
                
                console.log(arr)
            }
        }else if(currentChar == '*'){
            console.log("skip")
        }else{
            index = arr.indexOf(dec[currentChar])
            arr.splice(index, 1)
            arr.splice(i,1)
            console.log(arr)
            i--
        }
    }
    if(arr.length > 0 && arr[0] == '*' || arr.length == 0){
        arr = []
        return true
    }else{
        return false
    }
   
    
};

console.log(checkValidString("(*))()"))