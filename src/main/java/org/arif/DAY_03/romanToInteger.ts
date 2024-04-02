
// @ts-ignore
function romanToInteger(s: string): number {
    // @ts-ignore
    const map: Map<string, number> = new Map([
        ['I',1],
        ['V',5],
        ['X',10],
        ['L',50],
        ['C',100],
        ['D',500],
        ['M',1000]
    ]);
    const n = s.length;
    let result = 0;
    for (let i = 0; i < n; i++) {
        const roman = s.charAt(i);
        const value = map.get(roman);
        if (i < n - 1 && value < map.get(s.charAt(i + 1))) {
            result -= value;
        } else {
            result += value;
        }
    }
    return result;

}

console.log(romanToInteger("III"));