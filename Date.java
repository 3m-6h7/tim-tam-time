public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date(boolean random) {
        if (random) {
            this.day = (int) (Math.random() * 28) + 1;
            // assuming 28 days in a month
            this.month = (int) (Math.random() * 12) + 1;
            // assuming 12 months in a year
            this.year = (int) (Math.random() * 100) + 1900;
            // assuming years between 1900 and 2100
        } else {
            this.day = 1;
            this.month = 1;
            this.year = 2100;
        }
    }

    public Date(String dateStr) {
        // assuming date is in the format "dd-mm-yyyy"
        String[] parts = dateStr.split("-");
        this.day = Integer.parseInt(parts[0]);
        this.month = Integer.parseInt(parts[1]);
        this.year = Integer.parseInt(parts[2]);
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return String.format("%d-%d-%d", day, month, year);
    }
}

