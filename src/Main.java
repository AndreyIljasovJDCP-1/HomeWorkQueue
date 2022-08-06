import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>(generateClients());

        System.out.println("\nПарк аттракционов в Цветочном городе.\n");

        while (!queue.isEmpty()) {
            Person currentPerson = queue.poll();

            if (currentPerson.spendTicket()) {
                System.out.println(currentPerson.getFio() + " покатался на карусели!");

                if (currentPerson.getTickets() > 0) {
                    queue.offer(currentPerson);
                }

            } else {
                System.out.println(currentPerson.getFio() + " - безбилетник! Ловите зайца!");
            }
        }

        System.out.println("\nПора по домам! У всех закончились билеты.\n");
    }

    public static List<Person> generateClients() {
        List<Person> clientList = new LinkedList<>();
        clientList.add(new Person("Незнайка", 3));
        clientList.add(new Person("Пончик", 2));
        clientList.add(new Person("Сиропчик", 2));
        clientList.add(new Person("д-р Пилюлькин", 1));
        clientList.add(new Person("Пачкуля Пестренький", 0));
        clientList.add(new Person("Винтик", 1));
        clientList.add(new Person("Шпунтик", 1));
        return clientList;
    }
}