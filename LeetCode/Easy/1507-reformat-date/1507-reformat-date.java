class Solution {
    public String reformatDate(String date) {
        HashMap<String, String> months = new HashMap();
        
        months.put("Jan", "01");
        months.put("Feb", "02");
        months.put("Mar", "03");
        months.put("Apr", "04");
        months.put("May", "05");
        months.put("Jun", "06");
        months.put("Jul", "07");
        months.put("Aug", "08");
        months.put("Sep", "09");
        months.put("Oct", "10");
        months.put("Nov", "11");
        months.put("Dec", "12");
        
        StringBuilder ret = new StringBuilder();

        ret.append(date.substring(date.length() - 4));
        ret.append("-");

        String month = date.substring(date.length() - 8, date.length() - 5);
        ret.append(months.get(month));
        ret.append("-");

        if (Character.isDigit(date.charAt(1))) {
            ret.append(date, 0, 2);
        } else {
            ret.append("0").append(date.charAt(0));
        }

        return ret.toString();
    }
}