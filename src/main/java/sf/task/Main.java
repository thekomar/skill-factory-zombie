package sf.task;

public class Main {
    public static void main(String[] args) {
        Money[] monies = new Money[5];
        monies[0] = new Money(10, 5);
        monies[1] = new Money(5, 10);
        monies[2] = new Money(100, 1);
        monies[3] = new Money(50, 2);
        monies[4] = new Money(1, 50);

        CountingMachine blueBank = new BlueBank();
        CountingMachine greenBank = new GreenBank();
        int result = greenBank.result(monies);
        System.out.println("result :" + result);
        int result2 = blueBank.result(monies);
        System.out.println("result2 :" + result2);
    }
}
