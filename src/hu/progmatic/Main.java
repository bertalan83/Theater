package hu.progmatic;

public class Main {

    public static void main(String[] args) {


        Director director = new Director("Bart",1000, 8, 17);

        String[] propsFred = {"weapons", "flashlights", "candles"};
        String[] propsDonald = {"phones", "lighters", "pens"};

        Propman[] propmen = {

                new Propman("Fred", 350, propsFred),
                new Propman("Donald", 350, propsDonald)
        };

        TheatricalGroupMember[] theatricalGroupMembers = {
                director,
                propmen[0],
                propmen[1]
        };

        Actor[] actors = {

            new Actor("Tom", 600, ActRole.ADULT_MAN, ActingTalent.VERY_TALENTED),
            new Actor("Jerry", 450, ActRole.CHILD, ActingTalent.TALENTED),
            new Actor("Ed", 450, ActRole.YOUNG, ActingTalent.AVARAGE),
            new Actor("Edd", 750, ActRole.ELDERLY, ActingTalent.VERY_TALENTED),
            new Actor("Eddy", 550, ActRole.ADULT_MAN, ActingTalent.AVARAGE),
            new Actor("Arnold", 550, ActRole.ADULT_WOMAN, ActingTalent.POOR),
            new Actor("Herold", 475, ActRole.YOUNG, ActingTalent.VERY_TALENTED),
            new Actor("Helga", 600, ActRole.ADULT_WOMAN, ActingTalent.TALENTED),
        };

        TheatricalGroup theatricalGroup =
                new TheatricalGroup(actors,theatricalGroupMembers, "Bugs Bunny and friends");

        Role[] roles = {

                new Role("The Man", ActRole.ADULT_MAN),
                new Role("The Woman", ActRole.ADULT_WOMAN),
                new Role("The Kid", ActRole.CHILD),
                new Role("The Teenager", ActRole.YOUNG),
                new Role("The Old Guy", ActRole.ELDERLY)
        };

        Play play = new Play("Pista Acs", "TV", 4, roles,
                PlayDifficulty.NORMAL,PlayGenre.TRAGICOMEDY);

        Show show = new Show(play, theatricalGroup);

        System.out.println(show);




        //-------------------------







        // show.prepare(theatricalGroupMembers);


        /*Role[] roles = {

                new Role(play, "The Man", ActRole.ADULT_MAN),
                new Role(play, "The Woman", ActRole.ADULT_WOMAN),
                new Role(play, "The Kid", ActRole.CHILD),
                new Role(play, "The Teenager", ActRole.YOUNG),
                new Role(play, "The Old Guy", ActRole.ADULT_UNISEX)
        };*/

        /*String[] actors = {"Tom", "Jerry", "Ed", "Edd", "Eddy", "Arnold", "Herold", "Helga"};*/





       // System.out.println(Arrays.toString(director.setActors(actors, roles)));

        /*System.out.println(Arrays.toString(show.getActors()));

        play.setRoles(new Role[] {
                roles[0],
                roles[1],
                roles[2],
                roles[3],
                roles[4],
            }
        );

        Actor_Role[] actor_roles = {

                new Actor_Role(actors[0], roles[0]),
                new Actor_Role(actors[1], roles[2]),
                new Actor_Role(actors[2], roles[3]),
                new Actor_Role(actors[3], roles[4]),
                new Actor_Role(actors[7], roles[1])
        };

        System.out.println(play);

        System.out.println(play.getNumberOfRoles());

        System.out.println(
                Arrays.toString(roles)
        );*/




       /* System.out.println(theatricalGroup.getNumberOfActors());
        System.out.println(play.getNumberOfRoles());

        System.out.println("\n" + Arrays.toString(show.getActors()));

        System.out.println("\n" + Arrays.toString(play.getRoles()));   // THIS FIELD IS NULL
                                                                       // DUNNO Y
                                                                       // :(

                                                                       */




    }
}
