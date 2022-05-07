package hu.progmatic;

public class Actor extends TheatricalGroupMember{

    private ActRole actRole;
    private ActingTalent actingTalent;

    public Actor() {
    }

    public Actor(String name, int salary, ActRole actRole) {
        this.name = name;
        this.salary = salary;
        this.actRole = actRole;
    }

    public Actor(String name, int salary, ActRole actRole, ActingTalent actingTalent) {
        super(name, salary);
        this.actRole = actRole;
        this.actingTalent = actingTalent;
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

    public ActRole getActRole() {
        return actRole;
    }

    public void setActRole(ActRole actRole) {
        this.actRole = actRole;
    }

    public ActingTalent getActingTalent() {
        return actingTalent;
    }

    public void setActingTalent(ActingTalent actingTalent) {
        this.actingTalent = actingTalent;
    }

    @Override
    public String toString() {
        return "\n============================\n" +
                "\nActor " +
                "\nactRole = " + actRole +
                "\nactingTalent = " + actingTalent +
                "\nname = " + name + '\'' +
                "\nsalary = " + salary;
    }
}
