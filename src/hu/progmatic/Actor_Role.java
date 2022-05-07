package hu.progmatic;

public class Actor_Role {

    Actor actor;
    Role role;

    public Actor_Role() {
    }

    public Actor_Role(Actor actor, Role role) {
        this.actor = actor;
        this.role = role;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "\n============================\n" +
                "\nActor_Role " +
                "\nactor = " + actor +
                "\nrole = " + role +
                '\n';
    }
}
