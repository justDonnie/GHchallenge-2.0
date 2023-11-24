package footballTeam;

import java.time.LocalDate;
import java.time.Period;

public class Forwards extends FootballTeam  {
    public Forwards(String firstName, String lastName, LocalDate age, double height, int weight) {
        super(firstName, lastName, age, height, weight);
    }

    @Override
    public void positionFunction() {
        System.out.println(" Mainly purpose of forwards to score a goal!");
    }

    @Override
    public void getAges() {
        Period period = Period.between(getAge(),LocalDate.now());
        System.out.println(getFirstName()+" "+getLastName()+" "+period.getYears()+" years old");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
