public class Person {

    private final String fio;

    private int tickets;

    public Person(String fio, int tickets) {
        this.fio = fio;
        this.tickets = tickets;
    }

    public boolean spendTicket() {
        if (tickets > 0) {
            tickets--;
            return true;
        } else {
            return false;
        }
    }

    public String getFio() {
        return fio;
    }

    public int getTickets() {
        return tickets;
    }

    @Override
    public String toString() {
        return fio + ", в кармане билетов: " + tickets;
    }
}
