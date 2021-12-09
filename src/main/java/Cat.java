public class Cat extends Predator {
    private String name;

    public String getName() {
        return name;
    }

    private String species;

    public String getSpecies() {
        return species;
    }

    public Cat(Color color, int weight, String species, String name) {
        super(color, weight);
        this.species = species;
        this.name = name;

    }

    public void sleeping() {
        System.out.println("ZZzzz-Zzzz");
    }

    public void hunting() {
        System.out.println("Christmas tree hunting");
    }

    public void tyGyDyking() {
        System.out.println("I want to jump on the master's face");
    }

    public void lickBalls() {
        System.out.println("my balls will sparkle like the master's bald head");
    }




    public void doThisDay(Day doThisDay) {
        switch (doThisDay) {
            case MONDAY, WEDNESDAY, FRIDAY:
                sleeping();
                break;
            case TUESDAY, THURSDAY, SATURDAY:
                hunting();
                break;
            case SUNDAY:
                tyGyDyking();
                break;
            default:
                lickBalls();
        }
    }

}
