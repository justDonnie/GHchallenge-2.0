package footballTeam;


import java.time.LocalDate;

public abstract class FootballTeam implements playOnPosition{
    private String firstName;
    private String lastName;
    private LocalDate age;
    private double height;
    private int weight;

    public FootballTeam(String firstName, String lastName, LocalDate age, double height, int weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    public FootballTeam(){

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public LocalDate getAge() {
        return age;
    }

    public void setAge(LocalDate age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "FootballTeam: FC Barcelona " +
                "firstName- " + firstName + '\'' +
                " lastName- " + lastName + '\'' +
                " age- " + age +
                " height- " + height +
                " weight- " + weight;
    }
}
