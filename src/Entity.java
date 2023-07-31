
import java.util.Random;

public class Entity {

    // instance variables
    private String name;
    private int age;
    protected int hitpoints;
    private String gift;
    private int position;

    // constructor
    public Entity(String name, int age, String gift) {
        this.name = name;
        this.age = age;
        this.hitpoints = 100;
        this.gift = gift;
        Random rand = new Random();
        this.position = rand.nextInt(12);
    }

    // getters
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getHitpoints() {
        return this.hitpoints;
    }

    public String getGift() {
        return this.gift;
    }

    public int getPosition() {
        return this.position;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGift(String gift) {
        this.gift = gift;
    }

    // methods
    public boolean checkPosition(Entity entityToCheck) {
        return this.getPosition() >= (entityToCheck.getPosition() - 5)
                || this.getPosition() <= (entityToCheck.getPosition() + 5);
    }

    public String talk(Entity entityToCheck) {
        String phrase = "Distance to big to do this";
        if (this.checkPosition(entityToCheck)) {
            phrase = "Hello my name is " + this.getName() + ". I'm " + this.getAge() + " years old!";
            System.out.println(phrase);
            return phrase;
        }
        System.out.println(phrase);
        return phrase;
    }

    public void heal() {
        System.out.println("Healing in some way");
        this.hitpoints = 100;
    }

    public void giveGift(Entity entityToSwapGift) {
        if (this.checkPosition(entityToSwapGift)) {
            String givenGift = this.getGift();
            String receivedGift = entityToSwapGift.getGift();
            System.out.println("I want to give you this important thing, the " + givenGift);
            entityToSwapGift.setGift(givenGift);
            this.setGift(receivedGift);
        } else {
            System.out.println("Distance to big to do swap gift");
        }

    }

    public void attack(Entity entityToAttack) {
        if (this.checkPosition(entityToAttack)) {
            System.out.println("the entity is attacking");
            entityToAttack.hitpoints -= 20;
            System.out.println("damage inflicted 20");
        } else {
            System.out.println("Attack missed, distance is to big");
        }

    }

}
