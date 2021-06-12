package sf;

public class Battle {
    private final int MAX = 5;
    private int n = 0;
    private Monster[] monsters;

    public Battle() {
        monsters = new Monster[MAX];
    }

    public void add(Monster monster) {
        if (n < MAX) {
            monsters[n++] = monster;
        } else {
            System.out.println("No more monsters!");
        }
    }

    public void start() {
        run();
    }

    public void run() {
        for (int i = 0; i < n; i++) {
            if (monsters[i] != null) {
                monsters[i].attack();
            }
        }
    }
}
