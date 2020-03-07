public class AlarmClock extends Clock {

    private boolean alarm;
    private int alarmSecondsSinceMidnight;

    public AlarmClock(int hour, int minute, int second, int alarmHour, int alarmMin, int alarmSec) {
        super(hour, minute, second);
        alarm = false;
        this.alarmSecondsSinceMidnight = twentyFourHourToSeconds(alarmHour, alarmMin, alarmSec);
    }

    public AlarmClock(int secondsSinceMidnight, int alarmSecondsSinceMidnight) {
        super(secondsSinceMidnight);
        alarm = false;
        this.alarmSecondsSinceMidnight = alarmSecondsSinceMidnight;
    }

    @Override
    public void tick() {
        super.tick();
        if (alarm) {
            assert secondsSinceMidnight != alarmSecondsSinceMidnight;

            int oneMinuteAgo = secondsSinceMidnight - 60;
            if (oneMinuteAgo < 0) {
                oneMinuteAgo += 60 * 60 * 24;
            }

            if (oneMinuteAgo == alarmSecondsSinceMidnight) {
                alarm = false;
            }
        } else if (secondsSinceMidnight == alarmSecondsSinceMidnight) {
            alarm = true;
        }
    }

    @Override
    public String toString() {
        return super.toString() + (alarm ? beep() : " ");
    }

    public String beep() {
        return "BEEP!";
    }
}
