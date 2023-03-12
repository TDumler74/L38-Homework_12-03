package Main1;
////Создать класс Employee , содержащий следующие поля и методы:
////
////поле имя,
////поле зарплата,
////поле количество рабочих часов в день,
////конструктор
////метод addSalary(), добавляющий 10 евро к
//// зарплате если зарплата сотрудника меньше 500
////метод addForWork(), добавляющий 5 евро к зарплате
//// сотрудника если количество рабочих часов в день больше 6.
public class Employee {
    String name;
    int salary;
    int bonusSalary;
    int workHours;

    public Employee(String name, int salary, int workHours) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
    }
    public int getSalary(){
      // if(salary<500 && workHours>6){
     //    salary = salary + 15;
     //  }
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setWorkHours(int workHours){
       this.workHours=workHours;
    }
    public int getWorkHours(){
        return workHours;
    }

    public int addSalary() {

        if (salary < 500) {
            bonusSalary = bonusSalary + 10;
        }
        return bonusSalary;
    }

    public int addForWork() {

        if (workHours > 6) {
            bonusSalary = bonusSalary + 5;
        }
        return bonusSalary;
    }
    public int totalSalary(){
        bonusSalary=salary;
        addForWork();
        addSalary();
        return bonusSalary;
    }
}