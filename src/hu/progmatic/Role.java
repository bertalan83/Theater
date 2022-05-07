package hu.progmatic;

public class Role {

    private Play play;
    private String name;
    private ActRole actRole;

    public Role() {
    }

    public Role(Play play, String name) {
        this.play = play;
        this.name = name;
    }

    public Role(String name, ActRole actRole) {
        this.name = name;
        this.actRole = actRole;
    }

    public Role(Play play, String name, ActRole actRole) {
        this.play = play;
        this.name = name;
        this.actRole = actRole;
    }

    public Play getPlay() {
        return play;
    }

    public void setPlay(Play play) {
        this.play = play;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ActRole getActRole() {
        return actRole;
    }

    public void setActRole(ActRole actRole) {
        this.actRole = actRole;
    }

    @Override
    public String toString() {
        return "\n============================\n" +
                "\nRole " +
                "\nname = " + name + '\'' +
                "\nactRole = " + actRole +
                '\n';
    }


}
