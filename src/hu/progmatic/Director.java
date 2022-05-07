package hu.progmatic;

public class Director extends TheatricalGroupMember {

    private int experience;
    private int playsDirected;

    public Director() {
    }

    public Director(int experience, int playsDirected) {
        this.experience = experience;
        this.playsDirected = playsDirected;
    }

    public Director(String name, int salary, int experience, int playsDirected) {
        super(name, salary);
        this.experience = experience;
        this.playsDirected = playsDirected;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getPlaysDirected() {
        return playsDirected;
    }

    public void setPlaysDirected(int playsDirected) {
        this.playsDirected = playsDirected;
    }

    public double getDirectorsTalent() {
        return (double) experience / (double) playsDirected;
    }

    public static Actor_Role[] setActors(Actor[] actors, Role[] roles) {

        Actor_Role[] newActors = new Actor_Role[roles.length];

        for (int i = 0; i < roles.length ; i++) {
            for (int j = 0; j < actors.length; j++) {

                if (actors[j].getActRole().equals(roles[i].getActRole())) {
                    newActors[i] = new Actor_Role(actors[j], roles[i]);
                    break;
                }
            }
        } return newActors;
    }

    @Override
    public String toString() {
        return "\n============================\n" +
                "\nDirector " +
                "\nexperience = " + experience +
                "\nplaysDirected = " + playsDirected +
                " name = " + name + '\'' +
                " salary = " + salary +
                '\n';
    }
}
