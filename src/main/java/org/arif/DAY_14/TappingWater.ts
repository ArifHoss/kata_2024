/**
 * @param {number[]} height
 * @return{number}
 */
function trap(height: number[]): number {
    const n = height.length;
    let left:number[] = [n];
    left[0] = height[0];
    let right:number[] = [n];
    right[n - 1] = height[n - 1];

    for (let i = 1; i < n; i++) {
        left[i] = Math.max(left[i - 1], height[i]);
    }

    for (let i = n-2; i >= 0; i--) {
        right[i] = Math.max(right[i + 1], height[i]);
    }

    let counter = 0;
    for (let i = 0; i < n; i++) {
        counter += Math.min(left[i], right[i]) - height[i];
    }
    return counter;
}

const height = [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1];
console.log(trap(height))
