/**
 * Вспомогательный класс для работы с классом Person.
 */

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Иван", "Иванович", "Иванов", 15);
        person.setName("И");
        person.printName();
        person.setAge(20);
        person.getYear();
        System.out.println(person);
    }
}