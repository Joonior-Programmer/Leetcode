class Solution {
public:
    string convertDateToBinary(string date) {
        int year = stoi(date.substr(0, 4));
        int month = stoi(date.substr(5, 2));
        int day = stoi(date.substr(8, 2));
        
        return bitset<32>(year).to_string().substr(bitset<32>(year).to_string().find('1')) + "-" +
            bitset<32>(month).to_string().substr(bitset<32>(month).to_string().find('1')) + "-" +
            bitset<32>(day).to_string().substr(bitset<32>(day).to_string().find('1'));
    }
};