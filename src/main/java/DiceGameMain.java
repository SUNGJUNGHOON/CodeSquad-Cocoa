import java.util.Random;

public class DiceGameMain {
    private int rollTheDice;
    private int[] jumpingDistance;

    public DiceGameMain(int name, int rollTheDice) {
        this.rollTheDice = rollTheDice;
        jumpingDistance = new int[name];
    }

    public void person() {
        for (int i = 0; i < jumpingDistance.length; i++) {
            dropDice();
        }
    }

    private void dropDice() {
        for (int j = 0; j < rollTheDice; j++) {
            randomDice();
        }
        System.out.println();
    }

    private void randomDice() {
        Random random = new Random();
        if (random.nextInt(6) >= 4) {
            System.out.print("ㅡ");
        }
    }
}
