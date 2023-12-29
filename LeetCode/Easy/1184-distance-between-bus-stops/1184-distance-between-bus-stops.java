class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int temp = 0;
        int temp2 = 0;
        
        if (start < destination){
            for (int i = start; i < destination; ++i) temp += distance[i];
            for (int i = 0; i < start; ++i) temp2 += distance[i];
            for (int i = destination; i < distance.length; ++i) temp2 += distance[i];
        } else {
            for (int i = destination; i < start; ++i) temp += distance[i];
            for (int i = 0; i < destination; ++i) temp2 += distance[i];
            for (int i = start; i < distance.length; ++i) temp2 += distance[i];
        }
        
        return Math.min(temp, temp2);
    }
}