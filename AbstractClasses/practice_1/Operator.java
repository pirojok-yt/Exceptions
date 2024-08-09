public class Operator extends Employee {
    public Operator(double salary, Company company){
        super(company);
        this.salary = salary;
    }
    public String toString() {
        return "Operator with salary " + String.valueOf(salary);
    }
}
