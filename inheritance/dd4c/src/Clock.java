public class Clock {

    protected int hour;
    protected int minute;
    protected int second;
    protected int secondsSinceMidnight;
    protected boolean secondsFormat;

    public Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.secondsFormat = false;
    }

    public Clock(int secondsSinceMidnight) {
        this.secondsSinceMidnight = secondsSinceMidnight;
        this.secondsFormat = true;
    }

    public void tick() {
        second ++;
        secondsSinceMidnight ++;
    }

    public int twentyFourHourToSeconds(int hour, int minute, int second){
        return hour * 3600 + minute * 60 + second;
    }

    @Override
    public String toString() {
        if (secondsFormat) {
            return secondsSinceMidnight + " seconds since midnight. ";
        } else {
            return hour + ":" + minute + ":" + second + " ";
        }
    }
}
