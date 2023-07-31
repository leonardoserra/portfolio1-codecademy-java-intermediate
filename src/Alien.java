public class Alien extends Entity {
    private String race;

    // costructor
    public Alien(String name, int age, String gift, String race) {
        super(name, age, gift);
        this.race = race;
    }

    // getter
    public String getRace() {
        return this.race;
    }

    // setter
    public void setRace(String race) {
        this.race = race;
    }

    // methods
    public void swapRace(Alien alienToSwapRace) {
        String actualRace = this.getRace();
        String newRace = alienToSwapRace.getRace();
        alienToSwapRace.setRace(actualRace);
        this.setRace(newRace);
    }

    @Override
    public String talk(Entity entityToCheck) {
        String phrase = "Distance to big to do this";
        if (this.checkPosition(entityToCheck)) {
            phrase = "SLiii " + this.getName() + ". IHol ````~~~```` " + this.getAge() + " kapol!";
            System.out.println(phrase);
            return phrase;
        }
        System.out.println(phrase);
        return phrase;
    }

    public void heal() {
        System.out.println("absorbing light to regenerate");
        this.hitpoints += 80;
        if (this.getHitpoints() > 100) {
            this.hitpoints = 100;
        }
        System.out.println("Blorp!! Lights here is so slurpy, now your hitpoints are: " + this.getHitpoints());
    }

    public void attack(Entity entityToAttack) {
        if (this.checkPosition(entityToAttack)) {
            System.out.println("Using lasers.. bzzz!");
            entityToAttack.hitpoints -= 30;
            System.out.println("Damage inflicted: 30");
        } else {
            System.out.println("Attack missed, distance is to big");
        }

    }
}
