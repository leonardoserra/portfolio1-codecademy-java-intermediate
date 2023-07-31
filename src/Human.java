public class Human extends Entity {
    private String favouriteArt;

    // costructor
    public Human(String name, int age, String gift, String favouriteArt) {
        super(name, age, gift);
        this.favouriteArt = favouriteArt;
    }

    // getter
    public String getFavouriteArt() {
        return this.favouriteArt;
    }

    // setter
    public void setFavouriteArt(String favouriteArt) {
        this.favouriteArt = favouriteArt;
    }

    // methods
    public void teachArt(Human humanToTeach) {
        humanToTeach.setFavouriteArt(this.getFavouriteArt());
    }

    @Override
    public void heal() {
        System.out.println("using bands and medicines");
        this.hitpoints += 40;
        if (this.getHitpoints() > 100) {
            this.hitpoints = 100;
        }
        System.out.println("Healed! now your hitpoints are: " + this.getHitpoints());
    }

    public void attack(Entity entityToAttack) {
        if (this.checkPosition(entityToAttack)) {
            System.out.println("Shotgun... BOOM!");
            entityToAttack.hitpoints -= 25;
            System.out.println("Damage inflicted: 25");
        } else {
            System.out.println("Attack missed, distance is to big");
        }

    }

}
