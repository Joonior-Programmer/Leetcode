class Solution {
public:
    vector<int> asteroidCollision(vector<int>& asteroids) {
        vector<int> stack;
        
        for (int v : asteroids){
            bool condition = true;
            while (!stack.empty() && v < 0 && stack.back() > 0){
                if (-v > stack.back()){
                    stack.pop_back();
                    continue;
                } else if (-v == stack.back()) stack.pop_back();
                condition = false;
                break;
            }
            if (condition) stack.push_back(v);
        }
        
        return stack;
    }
};