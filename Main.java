import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.interfaces.Messenger;
import company.implementations.EmailMessenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("Alice", 30);
            System.out.println("Osoba: " + person.getName() + ", Wiek: " + person.getAge());

            int sum = MathUtils.add(5, 10);
            System.out.println("Suma liczb: 5 + 10 = " + sum);

            Messenger messenger = new EmailMessenger();
            messenger.sendMessage("Pozdrowienia od " + person.getName() + "! Suma liczb to " + sum);
        } catch (InvalidAgeException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
