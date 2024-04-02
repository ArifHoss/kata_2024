var romanToInt = function (s) {
    var dic = new Object();
    dic = {
        "I": 1,
        "V": 5,
        "X": 10,
        "L": 50,
        "C": 100,
        "D": 500,
        "M": 1000,
    };
    const stringToArray = s.split('');
    console.log(stringToArray)
    let result = [];
    for (let i = 0; i < stringToArray.length; i++) {
        let currentIndex = stringToArray[i];
        //i++
        let nextElement = stringToArray[++i]

        if (dic[currentIndex] < dic[nextElement]) {

            let subStract = dic[nextElement] - dic[currentIndex]
            result.push(subStract);
            i++
        }
        else {

            result.push(dic[currentIndex])
        }
        i--
    }
    return result.reduce((accumulator, currentValue) => accumulator + currentValue, 0,);;
};

console.log(romanToInt("LVIII"))