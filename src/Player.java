public class Player {
    int pegIdx;
    int colorValue;

    Player(int colorValue) {
        pegIdx = 0;
        this.colorValue = colorValue;
    }

    public void display() {
        System.out.println("+---+ ".repeat(10));
        for (int i = 0; i < 10; i++) {
            System.out.print("| " + (i == pegIdx ? "\033[0;" + colorValue + "mo\033[0m" : " ") + " | ");
        }
        System.out.println("\n" + "+---+ ".repeat(10));
    }

    public boolean playTurn() {
        int dice1 = FinishLine.rollDice(), dice2 = FinishLine.rollDice();
        if (dice1 == pegIdx + 1 || dice2 == pegIdx + 1 || dice1 + dice2 == pegIdx + 1) {
            pegIdx++;
            System.out.println("\033[0;" + colorValue + "mSuccessful move!" + "\033[0m");
        } else {
            System.out.println("\033[0;" + colorValue + "mNo luck this turn!" + "\033[0m");
        }
        return pegIdx == 9;
    }
}
