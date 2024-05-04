import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.interfaces.Messenger;
import company.implementations.EmailMessenger;

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("Dylan", 30);
            System.out.println("Osoba: " + person.getName() + "\nWiek: " + person.getAge());

            Messenger messenger = new EmailMessenger();
            messenger.sendMessage("Pozdrowienia od " + person.getName() + "!");
        } catch (InvalidAgeException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
