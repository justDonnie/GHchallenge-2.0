package footballTeam;

import java.time.LocalDate;
import java.time.Period;

public class Coach extends FootballTeam {

    public Coach(String firstName, String lastName, LocalDate age, double height, int weight) {
        super(firstName, lastName, age, height, weight);
    }

    @Override
    public void positionFunction() {
        System.out.println(getLastName()+" is confidently requires to play on TIKI-TAKA!");
    }

    @Override
    public void getAges() {
        Period period = Period.between(getAge(),LocalDate.now());
        System.out.println(getFirstName()+" "+getLastName()+" "+period.getYears()+" years old");
    }


}
