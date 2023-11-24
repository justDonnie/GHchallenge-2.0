package footballTeam;

import java.time.LocalDate;
import java.time.Period;

public class Midfielders extends FootballTeam{

    public Midfielders(String firstName, String lastName, LocalDate age, double height, int weight) {
        super(firstName, lastName, age, height, weight);
    }

    @Override
    public void positionFunction() {
        System.out.println(getLastName()+" is got require to play on middle line");
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
