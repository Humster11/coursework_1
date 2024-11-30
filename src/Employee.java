import java.sql.Struct;

public class Employee {
    private int id = 0;
    private String surname;
    private String name;
    private String patronymic;
    private int department;
    private int salary;

    public Employee(String surname, String name, String patronymic, int department, int salary) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
        this.id++;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getPatronymic() {
        return this.patronymic;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getId(){
        return this.id;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPatronymic(String patronymic){
        this.patronymic = patronymic;
    }

    public void setDepartment(int department){
        this.department = department;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public String toString() {
        return "Фамилия:"+surname + " Имя:" + name + " Отчество:" + patronymic+" Отдел:"+department+" Зарплата:"+salary;
    }

    public boolean equals(String surname, String name, String patronymic) {
        return this.getSurname() ==surname && this.getName() == name && this.getPatronymic() == patronymic;
    }

    public  int hashCode() {
        return this.id*31+this.department;
    }


}
