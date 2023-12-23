class Solution {
    public boolean isPathCrossing(String path) {
        HashSet<Point> visited = new HashSet();    
        Point curr = new Point(10000, 10000);
        visited.add(new Point(curr));
        
        for (char v : path.toCharArray()){
            if (v == 'N') ++curr.x;
            else if (v == 'S') curr.x--;
            else if (v == 'E') ++curr.y;
            else curr.y--;
            
            if (visited.contains(curr)) return true;
            
            visited.add(new Point(curr));
        }
        
        return false;
    }
}

class Point {
    public int x;
    public int y;

    @Override
    public int hashCode(){
        return 31 * x + 17 * y;
    }

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    Point(Point original){
        this.x = original.x;
        this.y = original.y;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point v){
            return (this.x == v.x && this.y == v.y);
        }
        return false;
    }
}