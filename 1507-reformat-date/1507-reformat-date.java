class Solution {
    private static final Map<String, String> monthMap = new HashMap<>();
    
    static {
        monthMap.put("Jan", "01");
        monthMap.put("Feb", "02");
        monthMap.put("Mar", "03");
        monthMap.put("Apr", "04");
        monthMap.put("May", "05");
        monthMap.put("Jun", "06");
        monthMap.put("Jul", "07");
        monthMap.put("Aug", "08");
        monthMap.put("Sep", "09");
        monthMap.put("Oct", "10");
        monthMap.put("Nov", "11");
        monthMap.put("Dec", "12");
    }
    public String reformatDate(String date) {
        String[] parts = date.split(" ");
        String day = parts[0];
        String month = parts[1];
        String year = parts[2];

        String numericDay = day.substring(0, day.length() - 2);
        numericDay = numericDay.length()==1? "0"+numericDay : numericDay;

        String numericMonth = monthMap.get(month);

        String formattedDate = String.format("%s-%s-%s", year, numericMonth, numericDay);

        return formattedDate;
    }
}