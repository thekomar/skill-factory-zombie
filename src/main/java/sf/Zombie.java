package sf;

public class Zombie extends Monster {
    public static String scream = "Raaaauuughhhh ";
    public Zombie(String name) {
        super(name + " the Zombie", 5);
    }
    @Override
    public void attack() {
        super.attack();
        growl();
    }
    @Override
    public void growl() {
        System.out.print(scream);
        super.growl();
    }
    public void growl(boolean status) {
        if (status) {
            System.out.print(scream.toUpperCase());
            super.growl();
        }
        else {
            growl();
        }
    }
}
