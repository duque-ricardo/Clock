public class Clock implements Runnable {
    private Hand seconds;
    private Hand minutes;
    private Hand hours;
    private String lateOrNight;

    public Clock() {
        seconds = new Hand(60);
        minutes = new Hand(60);
        hours = new Hand(12);
        lateOrNight = "AM";
    }

    @Override
    public void run() {
        seconds.advance();

        if (seconds.getValue() == 0) {
            minutes.advance();
            if (minutes.getValue() == 0) {
                hours.advance();
                if (hours.getValue() == 0 && lateOrNight.equals("AM")) {
                    lateOrNight = "PM";
                } else {
                    lateOrNight = "AM";
                }
            }
        }
    }

//    public void advance() {
//
//    }

    @Override
    public String toString() {
        return hours + ":" + minutes + ":" + seconds + "  " + lateOrNight;
    }


}
