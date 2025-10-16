package ua.opnu;

public class TimeSpan {

    private int hours;
    private int minutes;

    public TimeSpan() {

        this(0, 0);
    }

    public TimeSpan(int minutes) {
        if (minutes < 0) {
            this.hours = 0;
            this.minutes = 0;
        } else {
            this.hours = minutes / 60;
            this.minutes = minutes % 60;
        }
    }

    public TimeSpan(int hours, int minutes) {
        int totalMinutes = hours * 60 * minutes;
        if (totalMinutes <0) {
            this.hours = 0;
            this.minutes = 0;
        } else {
            this.hours = totalMinutes / 60;
            this.minutes = totalMinutes % 60;
        }
    }

    public TimeSpan(TimeSpan other) {
        this.hours = other.hours;
        this.minutes = other.minutes;
    }

    public int getHours() {
        return this.hours;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public void add(int hours, int minutes) {
        int totalMinutesToAdd = hours * 60 + minutes;
        if (totalMinutesToAdd < 0) {
            return;
        }
        int currentTotalMinutes = this.getTotalMinutes();
        int newTotalMinutes = currentTotalMinutes + totalMinutesToAdd;
        this.hours = newTotalMinutes / 60;
        this.minutes = newTotalMinutes % 60;
    }

    public void add(int minutes) {
        this.add(0, minutes);
    }

    public void add(TimeSpan timespan) {
        this.add(timespan.getHours(), timespan.getMinutes());
    }

    public void subtract(int hours, int minutes) {
        int totalMinutesToSubtract = hours * 60 + minutes;
        if (totalMinutesToSubtract < 0) {
            return;
        }
        int currentTotalMinutes = this.getTotalMinutes();
        int newTotalMinutes = currentTotalMinutes - totalMinutesToSubtract;

        if (newTotalMinutes < 0) {
            this.hours = 0;
            this.minutes = 0;
        } else {
            this.hours = newTotalMinutes / 60;
            this.minutes = newTotalMinutes % 60;
        }
    }

    public void subtract(int minutes) {
        this.subtract(0, minutes);
    }

    public void subtract(TimeSpan span) {
        this.subtract(span.getHours(), span.getMinutes());
    }

    public int getTotalMinutes() {
        return this.hours * 60 + this.minutes;
    }

    @Override
    public String toString() {
        return String.format("%d год, %d хв", hours, minutes);
    }
}
