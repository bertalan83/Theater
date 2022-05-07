package hu.progmatic;

import java.util.Arrays;

public class TheatricalGroup {

    private String name;
    private Actor[] nameOfActors;
    private TheatricalGroupMember[] theatricalGroupMembers;

    public TheatricalGroup() {
    }

    public TheatricalGroup(Actor[] name) {
        this.nameOfActors = name;
    }

    public TheatricalGroup(Actor[] nameOfActors, TheatricalGroupMember[] theatricalGroupMembers, String name) {
        this.nameOfActors = nameOfActors;
        this.theatricalGroupMembers = theatricalGroupMembers;
        this.name = name;
    }

    public Actor[] getNameOfActors() {
        return nameOfActors;
    }

    public void setNameOfActors(Actor[] nameOfActors) {
        this.nameOfActors = nameOfActors;
    }

    public TheatricalGroupMember[] getTheatricalGroupMembers() {
        return theatricalGroupMembers;
    }

    public void setTheatricalGroupMembers(TheatricalGroupMember[] theatricalGroupMembers) {
        this.theatricalGroupMembers = theatricalGroupMembers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfActors() {
        return getNameOfActors().length;
    }

    @Override
    public String toString() {
        return "\n============================\n" +
                "\nTheatricalGroup " +
                "\nnameOfActors = " + Arrays.toString(nameOfActors) +
                "\ntheatricalGroupMembers = " + Arrays.toString(getTheatricalGroupMembers()) +
                "\n\ntheatricalGroupsName = " + name + '\'' +
                '\n';
    }
}
