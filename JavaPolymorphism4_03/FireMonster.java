package JavaPolymorphism4_03;

public class FireMonster extends Monster {

    public FireMonster(String name) {
        super(name);
    }
    @Override
    public String attack() {
        return "Attack with fire!";
    }
}
