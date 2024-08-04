public abstract class Employee extends Company implements Comparable{
    public double salary;
    public double getMonthSalary(){
        return salary;
    }

    public int compareTo(Object o){
        Employee employee = (Employee) o;
        return Integer.compare((int) salary, (int) employee.salary);
    }
}
