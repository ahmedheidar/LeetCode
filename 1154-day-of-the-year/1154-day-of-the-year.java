class Solution {
    public int dayOfYear(String date) {
                // Split the date string into year, month, and day parts
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        
        // Array to hold the number of days in each month (considering leap year)
        int[] daysInMonth = {31, 28 + (isLeapYear(year) ? 1 : 0), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        // Calculate the day of year
        int dayOfYear = day;
        for (int i = 1; i < month; i++) {
            dayOfYear += daysInMonth[i - 1];
        }
        
        return dayOfYear;
    }
    
    private boolean isLeapYear(int year) {
        // Check if the given year is a leap year
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}