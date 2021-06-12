package sf;

public class GiantSnake extends Monster {
    public static String scream = "Ssssss";

    public GiantSnake(String name) {
        super(name + " the GiantSnake", 7);
    }

    @Override
    public void attack() {
        growl();
        super.attack();
        growl();
        System.out.println("     ...and hid in the grass");
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
        } else {
            growl();
        }
    }
}
