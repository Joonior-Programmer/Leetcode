class Solution:
    def convertDateToBinary(self, date: str) -> str:
        date = date.split("-")
        return "-".join([bin(int(v))[2:] for v in date])