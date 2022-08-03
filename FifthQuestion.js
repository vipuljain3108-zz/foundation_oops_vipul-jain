// Question 5:
// You are given an array of integers. Your task is to create the largest number possible using those 
// integers.

function formatNumber(number) {
    return number.split("").sort((a, b) => b - a).join("")
}

function fifth(arr) {

    let newArray = [];

    for (const iterator of arr) {
        if (arr <= 11) newArray.push(iterator.toString());
        else {
            newArray.push(formatNumber(iterator.toString()));
        }
    }

    let x = newArray.sort((a, b)=> b-a).join("")
    return parseInt(x);
}

console.log(fifth([2, 30, 56, 129]));