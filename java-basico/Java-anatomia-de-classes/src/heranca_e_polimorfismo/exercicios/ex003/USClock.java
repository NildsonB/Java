package heranca_e_polimorfismo.exercicios.ex003;

public non-sealed class USClock extends Clock{

    private String periodIndicator;

    public void setHour(int hour) {
        setBeforeMidday();
        if ((hour >= 12) && (hour <= 23)) {
            setAfterMidday();
            this.hour = hour - 12;
        } else if (hour >= 24) {
            this.hour = 0;
        } else {
            this.hour = hour;
        }
    }

    @Override
    Clock convert(Clock clock) {
        this.second = clock.getSecond();
        this.minute = clock.getMinute();
        this.periodIndicator = getPeriodIndicator();
        switch (clock) {
            case USClock usClock -> {
                this.hour = usClock.getHour();
            }
            case BRLClock brlClock -> {
                setHour(brlClock.getHour());
            }
        }
        return this;
    }

    public String getPeriodIndicator() {
        return periodIndicator;
    }

    public void setAfterMidday() {
        this.periodIndicator = "PM";
    }

    public void setBeforeMidday() {
        this.periodIndicator = "AM";
    }

    @Override
    public String getTime() {
        return super.getTime() + " " + this.periodIndicator;
    }

}
