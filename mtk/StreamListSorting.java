package mtk;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListSorting{
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<String>();
        fruits.add("ZOrange");
        fruits.add("GBanana");
        fruits.add("Yineapple");
        fruits.add("Agrape");

        List<String> sortedList = fruits.stream()
                    .sorted(Comparator.naturalOrder())
                    .collect(Collectors.toList());

        System.out.println("Sorted List Natural Order " + sortedList);

        System.out.println("*********************************");


        List<String> sortedList1 = fruits.stream()
                    .sorted((o1,o2) -> o1.compareTo(o2))
                    .collect(Collectors.toList());

        System.out.println("Sorted List Compare Order " + sortedList1);


        System.out.println("*********************************");

        //descending order
        List<String> sortedList2 = fruits.stream()
                    .sorted(Comparator.reverseOrder())
                    .collect(Collectors.toList());

        System.out.println("Sorted List Descending Order" + sortedList2);

        System.out.println("*********************************");


        List<String> sortedList3 = fruits.stream()
                    .sorted((o1,o2) -> o2.compareTo(o1))
                    .collect(Collectors.toList());

        System.out.println("Sorted List Descending Order" + sortedList3);


        System.out.println("*********************************");

        // sort employee by salary in ascending order

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(10, "David", 32, 400000));
        employees.add(new Employee(11, "Musa", 30, 300000));
        employees.add(new Employee(20, "Kelvin", 22, 200000));
        employees.add(new Employee(14, "Melvin", 28, 100000));


        List<Employee> sortedList4 = employees.stream()
                        .sorted(new Comparator<Employee>() {

                            @Override
                            public int compare(Employee o1, Employee o2) {
                                
                                return (int) (o1.getSalary() - o2.getSalary());
                            }
                            
                        }).collect(Collectors.toList());
        System.out.println("Comparator Ascending Sorted List " + sortedList4);


        System.out.println("*************************************************");
        // sort employee by salary in descending order

        List<Employee> sortedList5 = employees.stream()
        .sorted(new Comparator<Employee>() {

            @Override
            public int compare(Employee o1, Employee o2) {
                
                return (int) (o2.getSalary() - o1.getSalary());
            }
            
        }).collect(Collectors.toList());
        System.out.println("Comparator Descending Sorted List" + sortedList5);

        System.out.println("*************************************************");

        //Ascending Order

        List<Employee> sortedList6 = employees.stream()
        .sorted(Comparator.comparingLong(Employee::getSalary)).collect(Collectors.toList()); 
        System.out.println("Comparator comparingLong Aescending Sorted List" + sortedList6);

        System.out.println("*************************************************");


        List<Employee> sortedList7 = employees.stream()
        .sorted(Comparator.comparingInt(Employee::getAge)).collect(Collectors.toList()); 
        System.out.println("Comparator comparingInt Aescending Sorted List" + sortedList7);


        System.out.println("*************************************************");


        List<Employee> sortedList8 = employees.stream()
                             .sorted(Comparator.comparingInt(Employee::getAge).reversed())
                             .collect(Collectors.toList()); 
        System.out.println(sortedList8);

        System.out.println("Comparator comparingInt Reversed Sorted List" + sortedList8);

        System.out.println("*********************************");


        List<Employee> sortedList9 = employees.stream()
        .sorted(Comparator.comparing(Employee::getName).reversed()).collect(Collectors.toList()); 
        System.out.println("Comparator comparing Reversed Sorted List" + sortedList9);



    }
}

    class Employee{
        private int EmpId;
        private String name;
        private int age;
        private long salary;
        public Employee(int empId, String name, int age, long salary) {
            EmpId = empId;
            this.name = name;
            this.age = age;
            this.salary = salary;
        }
        public int getEmpId() {
            return EmpId;
        }
        public void setEmpId(int empId) {
            EmpId = empId;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public long getSalary() {
            return salary;
        }
        public void setSalary(long salary) {
            this.salary = salary;
        }
        @Override
        public String toString() {
            return "Employee [EmpId=" + EmpId + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
        }

        
        
    }
