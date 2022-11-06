import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>(generateClients());
        while (!queue.isEmpty()) {
            Person person = queue.poll();
            System.out.println(person.getName() + " " + person.getSurname() + " прокатился на аттракционе");
            person.numberTicket();
            if (person.getTickets() > 0) {
                queue.offer(person);
            }
        }
    }

    public static List<Person> generateClients() {
        List<Person> clients = new LinkedList<>();
        clients.add(new Person("Генри", "Форд", 2));
        clients.add(new Person("Крисс", "Хемсворт", 1));
        clients.add(new Person("Бенедикт", "Кембербетч", 4));
        clients.add(new Person("Владимир", "Белов", 3));
        clients.add(new Person("Мила", "Кунис", 2));
        return clients;
    }
}