class Solution {
public:
    bool canVisitAllRooms(vector<vector<int>>& rooms) {
        vector<bool> visited(rooms.size(), false);
        
        dfs(0, rooms, visited);

        for (int i = 1; i < rooms.size(); ++i) if (!visited[i]) return false;
        
        return true;
    }

    void dfs(int room, vector<vector<int>>& rooms, vector<bool>& visited){
        visited[room] = true;

        for (int key: rooms[room]) if (!visited[key]) {dfs(key, rooms, visited);}
    }
};