package MKR2;
public abstract class Character {
    protected String name;
    protected int health;
    protected int attackPower;
    protected int x;
    protected int y;

    public Character(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.x = 0;
        this.y = 0;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
        System.out.println(name + " moved to (" + x + ", " + y + ")");
    }

    public void attack(Character target) {
        System.out.println(name + " attacks " + target.getName() + " with power " + attackPower);
        target.setHealth(target.getHealth() - this.attackPower);
        System.out.println(target.getName() + " now has " + target.getHealth() + " health.");
    }
}