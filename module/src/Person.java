import java.util.Calendar;

/**
 * Данный класс содержит описание объекта Person.
 */

public class Person {
    private String name;
    private String middleName;
    private String familyName;
    private int age;

    public Person(String name, String middleName, String familyName, int age) {
        this.familyName = familyName;
        this.middleName = middleName;
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        if (name.length() >= 2) {
            this.name = name;
        }
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public int getAge() {
        return age;
    }

    public void printName() {
        System.out.println("Имя: " + this.name);
    }

    @Override
    public String toString() {
        return "Объект класса Person {" + " Имя: " + name +
                ", Отчество: " + middleName +
                ", Фамилия: " + familyName +
                ", Возраст: " + age + '}';
    }

    /**
     * Данный метод позволяет получить год рождения объекта класса Person.
     */
    public void getYear() {
        Calendar calendar = Calendar.getInstance();
        System.out.println("Год рождения человека: " + (calendar.get(Calendar.YEAR) - this.age));
    }
}
