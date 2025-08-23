package heranca_e_polimorfismo.exercicios.ex001;

public sealed abstract class Ticket permits HalfPrice, TicketFamily {

    protected float value;

    protected String NameofMovie;

    protected String LegOrDub;

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public String getNameofMovie() {
        return NameofMovie;
    }

    public void setNameofMovie(String nameofMovie) {
        NameofMovie = nameofMovie;
    }

    public String getLegOrDub() {
        return LegOrDub;
    }

    public void setLegOrDub(String legOrDub) {
        LegOrDub = legOrDub;
    }

    abstract Ticket selection(Ticket ticket);
}
