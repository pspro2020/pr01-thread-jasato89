package pr1;

public class Pow extends Thread {

    private final double number;

    Pow(double number) {
        this.number = number;
    }

    public void run() {
        for (double i = 1; i <=10; i++) {
            System.out.printf("%s: %.0f ^ %.0f = %.0f\n", getName(), number, i, Math.pow(number, i));
        }
    }

}
