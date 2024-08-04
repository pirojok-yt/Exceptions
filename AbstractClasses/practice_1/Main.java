import java.util.ArrayList;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Company company = new Company();
        ArrayList<Employee> employees = new ArrayList<>();
        for(int i=0; i<180;i++){
            company.hire(new Operator(Math.random()*100000 + 100000));
        }
        for(int i=0; i<80;i++){
            company.hire(new Manager(Math.random()*100000 + 150000,Math.random()*10000000 + 30000));
        }
        for(int i=0; i<10;i++){
            company.hire(new TopManager(Math.random()*100000 + 150000));
        }
        employees.addAll(company.getTopSalaryStaff(15));
        for(Employee employee : employees){
            System.out.println(employee);
        }
        employees.clear();
        employees.addAll(company.getLowestSalaryStaff(30));
        for(Employee employee : employees){
            System.out.println(employee);
        }
        int count = (int) company.employees.stream().count();
        for(int i=0;i<count/2;i++){
            Employee loser = company.employees.get((int)Math.random() * company.employees.size());
            company.hire(loser);
        }
        employees.clear();
        employees.addAll(company.getTopSalaryStaff(15));
        for(Employee employee : employees){
            System.out.println(employee);
        }
        employees.clear();
        employees.addAll(company.getLowestSalaryStaff(30));
        for(Employee employee : employees){
            System.out.println(employee);
        }
    }
}
