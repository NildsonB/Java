package heranca_e_polimorfismo.exercicios.ex001;

public non-sealed class HalfPrice extends Ticket {

    @Override
    Ticket selection(Ticket ticket) {
        this.NameofMovie = ticket.getNameofMovie();
        this.LegOrDub = ticket.getLegOrDub();
        this.value = (ticket.getValue()/2);
        return this;
    }
}
