package ua.opnu;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[4];

        people[0] = new Student("Салтикова", "Руслана", 18, "AI-245", "KR11111");
        people[1] = new Lecturer("Іванов", "Іван", 48 , "Комп'ютерних наук", 20000.00);
        people[2] = new Student("Петров", "Петро",19, "AI-244", "kk11323");
        people[3] = new Person("Бондаренко", "Віталій", 44);

        System.out.println("Інформація про людей:");

        for (Person person : people) {

            System.out.println(person.toString());
        }
    }
}