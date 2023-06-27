class Solution {
public:
    long long maxScore(vector<int>& nums1, vector<int>& nums2, int k) {
        int n = nums2.size();
        int idxs[n];

        for (int i = 0; i < n; ++i) idxs[i] = i;

        sort(idxs, idxs+n, 
        [&](int i1, int i2) -> bool
        {
            return nums2[i1] > nums2[i2];
        });

        long long n1Sum = 0;
        priority_queue<int,vector<int>, greater<int>> pq;

        for (int i = 0; i < k; ++i){
            n1Sum += nums1[idxs[i]];
            pq.push(nums1[idxs[i]]);
        }

        long long ret = n1Sum * nums2[idxs[k-1]];

        for (int i = k; i < n; ++i){
            n1Sum += nums1[idxs[i]] - pq.top();
            ret = max(ret, n1Sum * nums2[idxs[i]]);
            pq.pop();
            pq.push(nums1[idxs[i]]);
        }

        return ret;
    }

};