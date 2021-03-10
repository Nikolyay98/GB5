package company;


public class Employee {
    // Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;

    private String FIO;
    private String pozition;
    private String email;
    private String PhoneNumber;
    private int age;
    private float salary;

    // Конструктор класса должен заполнять эти поля при создании объекта;

    public Employee(String FIO, String pozition, String email, String PhoneNumber, int age, float salary ){
        this.FIO = FIO;
        this.pozition = pozition;
        this.email = email;
        this.PhoneNumber = PhoneNumber;
        this.age = age;
        this.salary = salary;
    }
    public void printInfo(){
        System.out.println("Ф.И.О" + FIO);
        System.out.println("Должность" + pozition);
        System.out.println("Email" + email);
        System.out.println("Телефон" + PhoneNumber);
        System.out.println("Возраст" + age);
        System.out.println("ЗП" + salary);
    }
    public int getAge() {
        return age;
    }
}