package company;
public class Main {
    public static void main(String[] args){
        Employee[] employee= new Employee[5];
        employee [0] = new Employee(
                "Ivanov Ivan Ivanovich",
                "Programmer",
                "sampleOne@mail.ru",
                "+7-999-999-99-99",
                46,
                44000);
        employee[1] = new Employee(
                "Ivanov Nikolyay Alexanlrovic",
                "Java-Fullstack",
                "sampletwo@mail.ru",
                "+7-959-900-19-59",
                55 ,
                99000);
        employee[2] = new Employee(
                "Sergeev Victor Ivanovich",
                "Programmer",
                "sampleThree@mail.ru",
                "+7-988-282-58-99",
                35,
                40000);
        employee[4] = new Employee(
                "Rubenstein Moiha Rabinovic",
                "Finansist",
                "samplefour@mail.ru",
                "+7-900-100-00-01",
                21,
                22);
        for (int i = 0; i < employee.length; i++){
            if(employee[i].getAge() > 40){
                employee[i].printInfo(); } } }
}