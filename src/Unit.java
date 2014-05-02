
public class Unit
{
    private String name;
    private int damage, defense, hp, mp, as, stamina, ms, kills;
    private double evasion;

    public Unit(String name, int damage, int defense, int hp, int stamina, int mp, int as, int ms, double evasion)
    {
        this.name = name;
        this.damage = damage;
        this.defense = defense;
        this.hp = hp;
        this.stamina = stamina;
        this.mp = mp;
        this.as = as;
        this.ms = ms;
        this.evasion = evasion;
        this.kills = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public double getEvasion() {
        return evasion;
    }

    public void setEvasion(double evasion) {
        this.evasion = evasion;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getAs() {
        return as;
    }

    public void setAs(int as) {
        this.as = as;
    }

    public int getMs() {
        return ms;
    }

    public void setMs(int ms) {
        this.ms = ms;
    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }
}
