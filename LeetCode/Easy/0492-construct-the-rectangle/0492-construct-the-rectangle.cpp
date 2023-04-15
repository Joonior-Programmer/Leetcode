class Solution {
public:
    vector<int> constructRectangle(int area) {
        int w = sqrt(area);
        while (area % w != 0) w--;
        vector<int> ret;
        ret.push_back(area/w);
        ret.push_back(w);
        return ret;
    }
};