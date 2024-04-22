// var searchInsert = function (nums, target) {
//     let sortedArr = nums.sort()
//     let insertedArr = [];
//     if (sortedArr.includes(target)) {
//         return nums.indexOf(target)
//     } else {
//         sortedArr.map((num) => {
//             if (num < target) {
//                 insertedArr.push(num)
//             } else{
//                 if(!insertedArr.includes(target)){
//                     insertedArr.push(target)
//                 }   
//                 insertedArr.push(num)
//             }
//         })
//     }

//     return insertedArr

// };

// let arr = [1, 4, 3, 5]; // 1 ,3 ,4 ,5

// console.log(searchInsert(arr, 2))

var searchInsert = function (nums, target) {
    let sortedArr = nums.sort()
    let index = 0;
    if (sortedArr.includes(target)) {
        return nums.indexOf(target)
    } else {
        for(let num of nums){
            if (num < target) {
                // console.log("nothing1..")
            } else{
              index = sortedArr.indexOf(num);
             break
            }
        }
    }
    return index;

};

let arr = [1, 4,2, 3, 5]; // 1 ,3 ,4 ,5

console.log(searchInsert(arr, 5))
