public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Time(boolean random) {
        if (random) {
            this.hours = (int) (Math.random() * 24);
            this.minutes = (int) (Math.random() * 60);
            this.seconds = (int) (Math.random() * 60);
        } else {
            this.hours = 0;
            this.minutes = 0;
            this.seconds = 0;
        }
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    @Override
    public String toString() {
        return String.format("%d:%d:%d", hours, minutes, seconds);
    }
}