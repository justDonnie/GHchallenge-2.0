import footballTeam.*;

import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        FootballTeam coach = new Coach("Ernandes", "Xavi", LocalDate.of(1980, 3, 6), 1.70, 78);
        FootballTeam goalkeeper = new Goalkeepers("Mark Andre", "Ter Stegen", LocalDate.of(1988, 6, 23), 1.95, 82);
        FootballTeam rightDef = new Defenders("Jules", "Kounde", LocalDate.of(1995, 2, 13), 1.88, 80);
        FootballTeam centerDef1 = new Defenders("Ronald", "Araujo", LocalDate.of(1998, 3, 3), 1.99, 88);
        FootballTeam centerDef2 = new Defenders("Andres", "Christensen", LocalDate.of(1997, 10, 13), 1.98, 92);
        FootballTeam leftDef = new Defenders("Alejandro", "Balde", LocalDate.of(2004, 9, 20), 1.70, 69);
        FootballTeam midfielder1 = new Midfielders("Gonzalez", "Pedri", LocalDate.of(2002, 3, 28), 1.70, 70);
        FootballTeam midfielder2 = new Midfielders("Frenkie", "De Jong", LocalDate.of(1996, 4, 25), 1.79, 80);
        FootballTeam midfielder3 = new Midfielders("Pablo", "Gavi", LocalDate.of(2004, 12, 23), 1.70, 70);
        FootballTeam rightWinger = new Forwards("Ousman", "Dembele", LocalDate.of(1998, 3, 3), 1.83, 79);
        FootballTeam forward1 = new Forwards("Robert", "Lewandowski", LocalDate.of(1992, 4, 23), 1.90, 90);
        FootballTeam leftWinger = new Forwards("Don", "Raphina", LocalDate.of(2000, 3, 3), 1.80, 80);

        FootballTeam[] footballTeams = {coach, goalkeeper, rightDef, centerDef1, centerDef2, leftDef, midfielder1, midfielder2, midfielder3, rightWinger, forward1, leftWinger};
        System.out.println("------------------------------------INFORMATION OF ALL MEMBERS OF TEAM------------------------------------------");
        for (FootballTeam f : footballTeams) {
            System.out.println(f);

        }
        System.out.println("---------------------------------------AGE DIAPASON OF MEMBERS ----------------------------------------");
        for (FootballTeam d : footballTeams) {
            d.getAges();
        }
        System.out.println("------------------------------------------REQUIRES OF COACH--------------------------------------------------------------------");
        for (FootballTeam c : footballTeams) {
            c.positionFunction();
        }
    }
}




