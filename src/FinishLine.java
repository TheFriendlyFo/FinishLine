public class FinishLine {
    public static int rollDice(){
        return (int) (Math.random() * 6) + 1;
    }

    public static void play() {
        boolean gameOver = false;
        Player[] players = new Player[]{new Player(31), new Player(32), new Player(33)};
        while (!gameOver) {
            for (Player player : players) {
                if (player.playTurn()) gameOver = true;
                player.display();
            }
            System.out.println("\n\n}---------------------------------------------------------------------------{\n\n");
        }
        System.out.println("Game over!");
    }
    /*At the game's start, each player has a peg on index 1 (1 based) of their track:
    Red track:
    +---+ +---+ +---+ +---+ +---+ +---+ +---+ +---+ +---+ +---+
    | o | |   | |   | |   | |   | |   | |   | |   | |   | |   |
    +---+ +---+ +---+ +---+ +---+ +---+ +---+ +---+ +---+ +---+
    Blue track
    +---+ +---+ +---+ +---+ +---+ +---+ +---+ +---+ +---+ +---+
    | o | |   | |   | |   | |   | |   | |   | |   | |   | |   |
    +---+ +---+ +---+ +---+ +---+ +---+ +---+ +---+ +---+ +---+

    Each turn, each player rolls 2 dice.
    If one of the dice or the combination of the dice is equal to the index in front of the peg, the player may move their peg forward.
    The first to make it to the end wins.
    */
}
