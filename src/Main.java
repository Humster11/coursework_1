public class Main {

    public static void informationEmployees(Employee[] Employees) {
        for (int i = 0; i <= Employees.length - 1; i++) {
            System.out.println(Employees[i].toString());
        }
    }

    public static int allSalaryMonth(Employee[] Employees) {
        int allSalary = 0;
        for (int i = 0; i <= Employees.length - 1; i++) {
            allSalary = allSalary + Employees[i].getSalary();
        }
        return allSalary;
    }

    public static void minSalary(Employee[] Employees) {
        int minSalary = Employees[0].getSalary();
        String nameEmployeeMinSalary = " ";

        for (int i = 0; i <= Employees.length - 1; i++) {
            if (Employees[i].getSalary() < minSalary) {
                minSalary = Employees[i].getSalary();
                nameEmployeeMinSalary = Employees[i].getSurname() + " " + Employees[i].getName() + " " + Employees[i].getPatronymic();
            }
        }
        System.out.println("Самая минимальная зарплата у сотрудника: " + nameEmployeeMinSalary);

    }

    public static void maxSalary(Employee[] Employees) {
        int maxSalary = 0;
        String nameEmployeeMaxSalary = " ";
        for (int i = 0; i <= Employees.length - 1; i++) {
            if (Employees[i].getSalary() > maxSalary) {
                maxSalary = Employees[i].getSalary();
                nameEmployeeMaxSalary = Employees[i].getSurname() + " " + Employees[i].getName() + " " + Employees[i].getPatronymic();
            }
        }
        System.out.println("Самая максимальная зарплата у сотрудника: " + nameEmployeeMaxSalary);

    }

    public static int avgSalary(Employee[] Employees) {
        return allSalaryMonth(Employees) / Employees.length;
    }

    public static void allEmployeeFIO(Employee[] Employees){
        System.out.println("ФИО всех сотрудников: ");
        for (int i = 0; i <= Employees.length - 1; i++) {
            System.out.println(Employees[i].getSurname() + " "+Employees[i].getName()+" "+Employees[i].getPatronymic());
        }
    }



    public static void main(String[] args) {
        Employee[] Employees = new Employee[10];

        Employees[0] = new Employee("Иванов", "Иван", "Иванович", 2, 50000);
        Employees[1] = new Employee("Петров", "Пётр", "Петрович", 2, 45000);
        Employees[2] = new Employee("Сидоров", "Матвей", "Алексеевич", 5, 37600);
        Employees[3] = new Employee("Лёшкин", "Андрей", "Петрович", 1, 100000);
        Employees[4] = new Employee("Булкин", "Борис", "Алекссевич", 1, 150000);
        Employees[5] = new Employee("Короткий", "Роман", "Андреевич", 3, 5000);
        Employees[6] = new Employee("Дубов", "Александр", "Андреевич", 4, 25000);
        Employees[7] = new Employee("Сергеева", "Анастасия", "Михайловна", 4, 25000);
        Employees[8] = new Employee("Малышева", "Августина", "Борисовна", 1, 125000);
        Employees[9] = new Employee("Снигерева", "Алефтина", "Аркадьевна", 3, 10000);

        informationEmployees(Employees);
        System.out.println(" ");
        System.out.println("Сумма всех затрат на ЗП в месяц: " + allSalaryMonth(Employees));
        System.out.println(" ");
        minSalary(Employees);
        System.out.println(" ");
        maxSalary(Employees);
        System.out.println(" ");
        System.out.println("Среднее значение зарплат "+avgSalary(Employees));
        System.out.println(" ");
        allEmployeeFIO(Employees);



    }
}