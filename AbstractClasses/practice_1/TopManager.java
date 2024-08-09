public class TopManager extends Employee {
    public TopManager(double salary, Company company){
        super(company);
        if(getIncome() > 10000000)
            this.salary =  salary + 1.5*salary;
        else
            this.salary = salary;
    }
    public String toString() {
        return "TopManager with salary " + String.valueOf(salary);
    }
}
