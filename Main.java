import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.interfaces.Messenger;
import company.implementations.EmailMessenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        try {
            Person[] people = new Person[5];
            people[0] = new Person("Alice", 30);
            people[1] = new Person("Bob", 25);
            people[2] = new Person("Charlie", 35);
            people[3] = new Person("Diana", 45);
            people[4] = new Person("Eve", 55);

            final int b = 10;

            Messenger messenger = new EmailMessenger();
            
            for (Person person : people) {
                int agePlusConstant = MathUtils.add(person.getAge(), b);
                messenger.sendMessage(person.getName() + " ma " + agePlusConstant + " lat.");
            }
        } catch (InvalidAgeException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
