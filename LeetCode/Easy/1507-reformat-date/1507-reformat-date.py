class Solution:
    def reformatDate(self, date: str) -> str:
        months = {
            "Jan": "01", 
            "Feb": "02", 
            "Mar": "03", 
            "Apr": "04", 
            "May": "05", 
            "Jun": "06", 
            "Jul": "07",
            "Aug": "08",
            "Sep": "09",
            "Oct": "10",
            "Nov": "11",
            "Dec": "12"
        }

        ret = ["","-","","-",""]

        if len(date) == 12:
            ret[0] = date[8:]
            ret[2] = months[date[4:7]]
            ret[4] = "0" + date[0]
        else:
            ret[0] = date[9:]
            ret[2] = months[date[5:8]]
            ret[4] = date[0:2]

        return "".join(ret)