public class Entity {

    // instance variables
    private String name;
    private int age;
    protected int hitpoints;
    private String gift;

    // constructor
    public Entity(String name, int age, String gift) {
        this.name = name;
        this.age = age;
        this.hitpoints = 100;
        this.gift = gift;
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

    public String gift() {
        return this.gift;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // methods
    public String talk() {
        String phrase = "Hello my name is " + this.name + ". I'm " + this.age + " years old!";
        System.out.println(phrase);
        return phrase;

    }

    public void heal() {
        System.out.println("Healing in some way");
        this.hitpoints = 100;
    }

    public void giveGift() {
        System.out.println("I want to give you this important thing, the " + this.gift + ". Do you accept it?");
    }

    public void attack(Entity entityToAttack) {
        entityToAttack.hitpoints -= 20;
    }

}
