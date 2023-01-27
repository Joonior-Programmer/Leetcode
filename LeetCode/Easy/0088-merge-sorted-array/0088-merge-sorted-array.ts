/**
 Do not return anything, modify nums1 in-place instead.
 */
function merge(nums1: number[], m: number, nums2: number[], n: number): void {
    m--;
    n--;
    for (let i = n + m + 1; i > -1; i--){
        if (n < 0) return;
        if (m > -1 && nums1[m] > nums2[n]){
            nums1[i] = nums1[m];
            m--;
        } else {
            nums1[i] = nums2[n];
            n--;
        }
    }
};