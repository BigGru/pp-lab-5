package company.beans;

import company.exceptions.InvalidAgeException;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) throws InvalidAgeException {
        if (age < 0 || age > 125) {
            throw new InvalidAgeException("Niepoprawny wiek: " + age + ". Wiek musi być pomiędzy 0 a 125.");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 125) {
            throw new InvalidAgeException("Niepoprawny wiek: " + age + ". Wiek musi być pomiędzy 0 a 125.");
        }
        this.age = age;
    }
}
