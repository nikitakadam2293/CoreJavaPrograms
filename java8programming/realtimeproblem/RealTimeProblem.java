package java8programming.realtimeproblem;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee
{
    int id;
    String name;
    int age;
    String gender;
    String department;
    int yearOfJoining;
    double salary;

    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDepartment() {
        return department;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", yearOfJoining=" + yearOfJoining +
                ", salary=" + salary +
                '}';
    }
}
public class RealTimeProblem {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));


        //1. How many male and female employees are there in the organization?

        long count = employeeList.stream().collect(Collectors.counting());
        System.out.println("Total count of male and female : " + count);  // 17

        // 2. Print the name of all departments in the organization?

        System.out.println("======================================");
        System.out.println("Name of all department in orgnization : ");
        employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

        System.out.println("======================================");

        // 3. What is the average age of male and female employees?

        Map<String, Double> avg = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));

        System.out.println("Average of male and female : " + avg);//Average of male and female : {Male=30.181818181818183, Female=27.166666666666668}

        System.out.println("======================================");

        // 4.  Get the details of highest paid employee in the organization?

        Optional<Employee> highSalary = employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));

        Employee hsalary = highSalary.get();
        System.out.println("Id : " + hsalary.getId());
        System.out.println("Age : " + hsalary.getAge());
        System.out.println("Name : " + hsalary.getName());
        System.out.println("Gender : " + hsalary.getGender());
        System.out.println("Department : " + hsalary.getDepartment());
        System.out.println("YearOfJoining : " + hsalary.getYearOfJoining());
        System.out.println("Salary : " + hsalary.getSalary());

        System.out.println("======================================");

        //  5. Get the names of all employees who have joined after 2015.

        employeeList.stream().filter(e -> e.getYearOfJoining() > 2015).map(Employee::getName).forEach(System.out::println);

        System.out.println("======================================");

        // 6 : Count the number of employees in each department?

        Map<String, Long> map = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(map);   // {Product Development=5, Security And Transport=2, Sales And Marketing=3, Infrastructure=3, HR=2, Account And Finance=2}


        Set<Map.Entry<String, Long>> set = map.entrySet();
        for (Map.Entry<String, Long> e : set) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
        /*
        Product Development : 5
        Security And Transport : 2
        Sales And Marketing : 3
        Infrastructure : 3
        HR : 2
        Account And Finance : 2

        * */

        System.out.println("======================================");

        // 7 : What is the average salary of each department?

        Map<String, Double> avgSalary = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

        System.out.println("Average Salary : " + avgSalary);  // Average Salary : {Product Development=31960.0, Security And Transport=10750.25, Sales And Marketing=11900.166666666666, Infrastructure=15466.666666666666, HR=23850.0, Account And Finance=24150.0}


        Set<Map.Entry<String, Double>> aSal = avgSalary.entrySet();
        for (Map.Entry<String, Double> s : aSal) {
            System.out.println(s.getKey() + " : " + s.getValue());
        }
            /*
            Product Development : 31960.0
            Security And Transport : 10750.25
            Sales And Marketing : 11900.166666666666
            Infrastructure : 15466.666666666666
            HR : 23850.0
            Account And Finance : 24150.0

            * */
        System.out.println("======================================");

        // Get the details of youngest male employee in the product development department?


        Optional<Employee> youngMale = employeeList.stream().filter(e -> e.getGender() == "Male" && e.getDepartment() == "Product Development")
                .min(Comparator.comparingInt(Employee::getAge));

        Employee detailOfYoungMale = youngMale.get();
        System.out.println(" ****  " + detailOfYoungMale);

      /*  System.out.println("Id : " + detailOfYoungMale.getId());
        System.out.println("Age : " + detailOfYoungMale.getAge());
        System.out.println("Name : " + detailOfYoungMale.getName());
        System.out.println("Gender : " + detailOfYoungMale.getGender());
        System.out.println("Department : " + detailOfYoungMale.getDepartment());
        System.out.println("Year Of Joing : " + detailOfYoungMale.getYearOfJoining());
        System.out.println("Salary : " + detailOfYoungMale.getSalary());*/

        System.out.println("======================================");

        // 9 : Who has the most working experience in the organization?

        Optional<Employee> highExperience = employeeList.stream().min(Comparator.comparingDouble(Employee::getYearOfJoining));
        System.out.println(" most working experience employee : " + highExperience);

        System.out.println("----------------------------------------------");

        Optional<Employee> highExperience2 = employeeList.stream().sorted(Comparator.comparingDouble(Employee::getYearOfJoining)).findFirst();

        System.out.println(" most working experience employee : Second way " + highExperience2);

        System.out.println("======================================");

        //  10 : How many male and female employees are there in the sales and marketing team?
        /*
        gender count - department
        * */
        Map<String,Long> count1  = employeeList.stream().filter(e -> e.getDepartment() == "Sales And Marketing").collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println(" Count of male and female in sales and marketing team  " +count1);
        // Count of male and female in sales and marketing team  {Female=1, Male=2}

        System.out.println("----------------------------------------------");
        Set<Map.Entry<String,Long>> cc =count1.entrySet();
        for(Map.Entry<String,Long> s: cc)
        {
            System.out.println(s.getKey()+ " : " + s.getValue());
        }

        /*
        Female : 1
        Male : 2
        */

        System.out.println("======================================");

        // 11 : What is the average salary of male and female employees?

       Map<String,Double> avgSalaryEmployee = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));

        System.out.println("Average Salary : " + avgSalaryEmployee);
        //Average Salary : {Male=21300.090909090908, Female=20850.0}

        System.out.println("----------------------------------------------");

        Set<Map.Entry<String,Double>> aSalary = avgSalaryEmployee.entrySet();
        for(Map.Entry <String,Double> e : aSalary)
        {
            System.out.println(e.getKey()+ " : " +e.getValue());
        }
            /*
            Male : 21300.090909090908
            Female : 20850.0
            */
        System.out.println("======================================");

        // 12 : List down the names of all employees in each department?

       Map<String,List<String>> nameOfAllEmp =  employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName,Collectors.toList()) ));

        System.out.println(nameOfAllEmp);

        //{Product Development=[Murali Gowda, Wang Liu, Nitin Joshi, Sanvi Pandey, Anuj Chettiar],
        // Security And Transport=[Iqbal Hussain, Jaden Dough], Sales And Marketing=[Paul Niksui, Amelia Zoe, Nicolus Den],
        // Infrastructure=[Martin Theron, Jasna Kaur, Ali Baig], HR=[Jiya Brein, Nima Roy], Account And Finance=[Manu Sharma, Jyothi Reddy]}

        System.out.println("----------------------------------------------");

        Set<Map.Entry<String,List<String>>> ss =nameOfAllEmp.entrySet();
        for(Map.Entry<String,List<String>> d : ss)
        {
            System.out.println(d.getKey() + " : " + d.getValue());
        }
        System.out.println("======================================");

        // What is the average salary and total salary of the whole organization?

        DoubleSummaryStatistics salary =  employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));

        System.out.println("Average Salary : " + salary.getAverage());  //  Average Salary : 21141.235294117647

        System.out.println("Total Salary : " + salary.getSum());        //Total Salary : 359401.0

        /*

summarizingDouble(Employee::getSalary) computes:
count
sum
min
average
max
*
*/

        System.out.println("======================================");

        //.14 : Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.

        Map<Boolean,List<Employee>> partiton =  employeeList.stream().collect(Collectors.partitioningBy(e->e.getAge() >=25));

        System.out.println(partiton);

        System.out.println("======================================");

        // 15 : Who is the oldest employee in the organization? What is his age and which department he belongs to?

        Optional<Employee> elist = employeeList.stream().max(Comparator.comparing(Employee::getAge));

        System.out.println(elist);
        int age1 =  elist.get().getAge();
        System.out.println("Age  :  " + age1 );   // Age  :  43


        String dept = elist.get().getDepartment();
        System.out.println("Department : " + dept);    // Department : Security And Transport


    }
}