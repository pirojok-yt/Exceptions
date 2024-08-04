import java.util.*;

public class Company {
    ArrayList<Employee> employees = new ArrayList<>();
    ArrayList<Employee> TopSalary = new ArrayList<>();
    ArrayList<Employee> LowestSalary = new ArrayList<>();
    public ArrayList<Employee> getTopSalaryStaff(int count){
        Collections.sort(employees, Collections.reverseOrder());
        Iterator<Employee> iterator = employees.iterator();
        int count1 = 0;
        while (iterator.hasNext() && count1 < count) {
            Employee element = iterator.next();
            TopSalary.add(element);
            count1++;
        }
        return TopSalary;
    }

    public ArrayList<Employee> getLowestSalaryStaff(int count){
        Collections.sort(employees);
        Iterator<Employee> iterator = employees.iterator();
        int count1 = 0;
        while (iterator.hasNext() && count1 < count) {
            Employee element = iterator.next();
            LowestSalary.add(element);
            count1++;
        }
        return LowestSalary;
    }
    public void hire(Employee employee){
        employees.add(employee);
    }
    public void hireAll(Collection<Employee> employes){
        employees.addAll(employes);
    }

    public void fire(Employee employee){
        employees.remove(employee);
    }

    public double getIncome(){
        return 10000005;
    }
}
