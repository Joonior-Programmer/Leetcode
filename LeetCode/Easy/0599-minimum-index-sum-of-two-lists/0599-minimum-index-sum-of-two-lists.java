class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> exist = new HashMap<>();

        ArrayList<String> ret = new ArrayList<>();
        int minVal = Integer.MAX_VALUE;
        Integer j;
        for (int i = 0; i < list1.length; ++i) exist.put(list1[i], i);

        for (int i = 0; i < list2.length; ++i){
            j = exist.get(list2[i]);
            if (j == null) continue;
            if (j + i < minVal){
                ret = new ArrayList<>();
                ret.add(list2[i]);
                minVal = j + i;
            } else if (j + i == minVal){
                ret.add(list2[i]);
            }
        }

        return ret.toArray(new String[0]);
    }
}