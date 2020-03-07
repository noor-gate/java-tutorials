public class RadioAlarmClock extends AlarmClock {
    private String station;

    public RadioAlarmClock(int hour, int minute, int second, int alarmHour, int alarmMin, int alarmSec, String station) {
        super(hour, minute, second, alarmHour, alarmMin, alarmSec);
        this.station = station;
    }

    public RadioAlarmClock(int secondsSinceMidnight, int alarmSecondsSinceMidnight, String station) {
        super(secondsSinceMidnight, alarmSecondsSinceMidnight);
        this.station = station;
    }

    @Override
    public String beep() {
        if (station.equals("None")) {
            return super.beep();
        } else {
            return "Radio noise";
        }

    }
}
