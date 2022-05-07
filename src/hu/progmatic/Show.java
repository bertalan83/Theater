package hu.progmatic;

import java.util.Arrays;
import java.util.Random;

public class Show  {

    private Play play;
    private TheatricalGroup theatricalGroup;
    private Actor_Role[] actors;
    private boolean isSuccessful;
    private Director director;

    public Show() {
    }

    public Show(Play play, TheatricalGroup theatricalGroup) {
        this.play = play;
        this.theatricalGroup = theatricalGroup;

        prepare(theatricalGroup.getTheatricalGroupMembers());
    }

    public boolean randomNumber() {

        Random random = new Random();
        int intRandom = random.nextInt(10);

        if (intRandom > 5) {
            this.isSuccessful = true;
        } else {
            this.isSuccessful = false;
        }
        return isSuccessful;
    }

    public void prepare(TheatricalGroupMember[] theatricalGroupMembers) {

        for (TheatricalGroupMember theatricalGroupMember : theatricalGroup.getTheatricalGroupMembers()) {
            if (theatricalGroupMember instanceof Director) {
                this.director = (Director) theatricalGroupMember;
                break;
            }
        }
        System.out.println(director);

        setActors(getTheatricalGroup().getNameOfActors(), play.getRoles());


    }

    public Play getPlay() {
        return play;
    }

    public void setPlay(Play play) {
        this.play = play;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public TheatricalGroup getTheatricalGroup() {
        return theatricalGroup;
    }

    public void setTheatricalGroup(TheatricalGroup theatricalGroup) {
        this.theatricalGroup = theatricalGroup;
    }

    public Actor_Role[] getActors() {
        return actors;
    }

    public void setActors(Actor[] actors, Role[] roles) {
                Director.setActors(actors, roles);
    }

    public boolean isSuccessful() {

        isSuccessful = randomNumber();

        if (!isSuccessful) {
            director.setPlaysDirected(director.getPlaysDirected() + 1);
        } else {
            if (play.getPlayDifficulty().equals(PlayDifficulty.EASY)) {
                director.setPlaysDirected(director.getPlaysDirected() + 1);
                director.setExperience(director.getExperience() + 10);
            } else if (play.getPlayDifficulty().equals(PlayDifficulty.NORMAL)) {
                director.setPlaysDirected(director.getPlaysDirected() + 1);
                director.setExperience(director.getExperience() + 50);
            } else {
                director.setPlaysDirected(director.getPlaysDirected() + 1);
                director.setExperience(director.getExperience() + 100);
            }
        }
        return isSuccessful;
    }

    public void setSuccessful(boolean successful) {
        isSuccessful = successful;
    }



    @Override
    public String toString() {

        return "\n\n============================\n" +
                "\nShow " +
                "\n  " + play +
                "\n" + Arrays.toString(Director.setActors(theatricalGroup.getNameOfActors(), play.getRoles())) +
                "\n  " + theatricalGroup +
                "\n" +
                "\nWas it successful? -> " +
                isSuccessful() +
                '\n';

    }
}
