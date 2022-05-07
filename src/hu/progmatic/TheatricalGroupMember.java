package hu.progmatic;

public class TheatricalGroupMember {

    protected String name;
    protected int salary;

    public TheatricalGroupMember() {
    }

    public TheatricalGroupMember(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
