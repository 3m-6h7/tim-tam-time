public class DateWithTime {
    private Date date;
    private Time time;

    public DateWithTime(Date date, Time time) {
        this.date = date;
        this.time = time;
    }

    public DateWithTime(boolean random) {
        if (random) {
            this.date = new Date(true);
            this.time = new Time(true);
        } else {
            this.date = new Date(false);
            this.time = new Time(false);
        }
    }

    public Date getDate() {
        return date;
    }

    public Time getTime() {
        return time;
    }

    @Override
    public String toString() {
        return String.format("%s %s", date.toString(), time.toString());
    }
}
