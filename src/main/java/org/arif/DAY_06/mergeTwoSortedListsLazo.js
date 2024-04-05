// var mergeTwoLists = function (list1, list2) {
//     let mergeArr = [];
//     let i = 0;
//     let j = 0;
//     while (i < list1.length && j < list2.length) {
//         if (list1[i] < list2[j]) {
//             mergeArr.push(list1[i]);
//             i++;
//         } else if (list1[i] > list2[j]) {
//             mergeArr.push(list2[j]);
//             j++;
//         } else {
//             mergeArr.push(list1[i]);
//             mergeArr.push(list2[j]);
//             i++;
//             j++;
//         }
//     }
    
//     while (i < list1.length) {
//         mergeArr.push(list1[i]);
//         i++;
//     }
   
//     while (j < list2.length) {
//         mergeArr.push(list2[j]);
//         j++;
//     }
//     return mergeArr;
// };


var mergeTwoLists = function(list1, list2) {
   let mergeArr = list1.concat(list2)
    // console.log(mergeArr.sort())
    return mergeArr.sort()
};

let firstL = [1, 3, 5];
let secondL = [2, 4, 6];

console.log(mergeTwoLists(firstL, secondL))