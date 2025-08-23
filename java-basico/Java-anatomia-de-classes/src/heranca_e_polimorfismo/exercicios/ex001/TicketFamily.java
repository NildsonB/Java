package heranca_e_polimorfismo.exercicios.ex001;

public non-sealed class TicketFamily extends Ticket {

    private int numberOfPeople = 1;

    @Override
    Ticket selection (Ticket ticket) {
        this.NameofMovie = ticket.getNameofMovie();
        this.LegOrDub = ticket.getNameofMovie();
        if (numberOfPeople < 4) {
            this.value = (ticket.getValue() * getNumberOfPeople());
        } else {
            this.value = (( (ticket.getValue() * getNumberOfPeople()) ) * 500) / 100;
        }
        return this;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }
}
