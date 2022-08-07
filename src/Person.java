public class Person implements Comparable<Person> {

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

    @Override
    public int compareTo(Person other) {

        if (other == null) {
            return -1; // this < other
        }
        
        int delta = this.tickets - other.tickets;

        if (delta != 0) {
            return delta; // знак + сортировка по возрастанию, — по убыванию
        }
        return this.fio.compareTo(other.fio);
    }
}
