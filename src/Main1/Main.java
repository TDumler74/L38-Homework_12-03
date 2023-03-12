package Main1;
//Задача2
//Создать класс Employee , содержащий следующие поля и методы:
//
//поле имя,
//поле зарплата,
//поле количество рабочих часов в день,
//конструктор
//метод addSalary(), добавляющий 10 евро к
// зарплате если зарплата сотрудника меньше 500
//метод addForWork(), добавляющий 5 евро к зарплате
// сотрудника если количество рабочих часов в день больше 6.
//Создать несколько экземпляров класса с различными параметрами и
// вывести на экран результат работы методов
public class Main {
    public static void main(String[] args) {
        Employee p1 = new Employee("Dieter Bohlen",5800,5);
        Employee p2 = new Employee("Thomas Anders",5090,7);
        Employee helfer = new Employee("Helfer",400,5);

        System.out.println(p1.name+" "+p1.totalSalary()+" "+p1.getWorkHours()+" hours");
        //Dieter Bohlen 5800 5 hours

        System.out.println(p2.name+" "+p2.totalSalary()+" "+p2.getWorkHours()+" hours");
        //Thomas Anders 5095.0 7 hours

        System.out.println(helfer.name+" "+helfer.totalSalary()+" "+" for "+helfer.getWorkHours()+" hours");
        //Helfer 410.0  for 5 hours

    }
}
