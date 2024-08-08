class Solution {
public:
    string reformatDate(string date) {
        unordered_map<string, string> months = {
            {"Jan", "01"}, {"Feb", "02"}, {"Mar", "03"}, {"Apr", "04"},
            {"May", "05"}, {"Jun", "06"}, {"Jul", "07"}, {"Aug", "08"},
            {"Sep", "09"}, {"Oct", "10"}, {"Nov", "11"}, {"Dec", "12"}
        };
        
        string ret;
        int len = date.length();

        ret += date.substr(len - 4, 4);
        ret += "-";

        string month = date.substr(len - 8, 3);
        ret += months.at(month);
        ret += "-";

        if (isdigit(date[1])) {
            ret += date.substr(0, 2);
        } else {
            ret += "0";
            ret += date[0];
        }

        return ret;
    }
};