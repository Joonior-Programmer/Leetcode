class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> ret = new ArrayList<>();
        for (int i = 1; i < n + 1; ++i){
            if (i % 5 == 0 && i % 3 == 0) ret.add("FizzBuzz");
            else if (i % 3 == 0) ret.add("Fizz");
            else if (i % 5 == 0) ret.add("Buzz");
            else ret.add(String.valueOf(i));
        }
        return ret;
    }
}