public class Manager extends Employee {
    double revenue;
    public Manager(double salary, double revenue){
        this.salary = salary + revenue*0.05;
    }

    public String toString() {
        return "Manager with salary " + String.valueOf(salary);
    }
}
