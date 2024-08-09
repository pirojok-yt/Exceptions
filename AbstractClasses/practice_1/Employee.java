public abstract class Employee extends Company implements Comparable{
    public double salary;
    private Company company;
    public Employee(Company company) {
        this.company = company;
    }
    public double getMonthSalary(){
        return salary;
    }
    public void setCompany(Company company) {
        this.company = company;
    }

    public Company getCompany() {
        return company;
    }

    public int compareTo(Object o){
        Employee employee = (Employee) o;
        return Integer.compare((int) salary, (int) employee.salary);
    }
}
