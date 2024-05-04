import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.interfaces.Messenger;
import company.implementations.EmailMessenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        try {
            Person[] people = new Person[5];
            people[0] = new Person("Dylan", 24);
            people[1] = new Person("Bob", 28);
            people[2] = new Person("Jack", 32);
            people[3] = new Person("Caitlyn", 35);
            people[4] = new Person("Anna", 30);

            final int b = 10;

            Messenger messenger = new EmailMessenger();
            
            for (Person person : people) {
                int agePlusConstant = MathUtils.add(person.getAge(), b);
                messenger.sendMessage(""+person.getName() + " ma " + agePlusConstant + " lat.");
            }
        } catch (InvalidAgeException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
