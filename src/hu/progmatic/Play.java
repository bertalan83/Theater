package hu.progmatic;

import java.util.Arrays;

public class Play {

    private String author;
    private String name;
    private int numberOfActs;
    private Role[] roles;
    private PlayDifficulty playDifficulty;
    private PlayGenre playGenre;

    public Play() {
    }

    public Play(String author, String name, int numberOfActs) {
        this.author = author;
        this.name = name;
        this.numberOfActs = numberOfActs;
    }

    public Play(String author, String name, int numberOfActs, Role[] roles) {
        this.author = author;
        this.name = name;
        this.numberOfActs = numberOfActs;
        this.roles = roles;
    }

    public Play(String author, String name, int numberOfActs, Role[] roles, PlayDifficulty playDifficulty, PlayGenre playGenre) {
        this.author = author;
        this.name = name;
        this.numberOfActs = numberOfActs;
        this.roles = roles;
        this.playDifficulty = playDifficulty;
        this.playGenre = playGenre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfActs() {
        return numberOfActs;
    }

    public void setNumberOfActs(int numberOfActs) {
        this.numberOfActs = numberOfActs;
    }

    public Role[] getRoles() {
        return roles;
    }

    public void setRoles(Role[] roles) {

        /*for (int i = 0; i < roles.length - 1; i++) {
            this.roles[i] = roles[i];
        }*/

        this.roles = roles;
    }

    public int getNumberOfRoles() {
        return getRoles().length;
    }

    public PlayDifficulty getPlayDifficulty() {
        return playDifficulty;
    }

    public void setPlayDifficulty(PlayDifficulty playDifficulty) {
        this.playDifficulty = playDifficulty;
    }

    public PlayGenre getPlayGenre() {
        return playGenre;
    }

    public void setPlayGenre(PlayGenre playGenre) {
        this.playGenre = playGenre;
    }

    @Override
    public String toString() {
        return "\n============================\n" +
                "\nPlay\n " +
                "\nauthor = '" + author + '\'' +
                "\nname = " + name + '\'' +
                "\nnumberOfActs = " + numberOfActs +
                "\nroles = " + Arrays.toString(roles) +
                "\n\nplayDifficulty = " + playDifficulty +
                "\nplayGenre = " + playGenre +
                '\n';
    }
}
