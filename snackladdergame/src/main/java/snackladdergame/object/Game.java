package snackladdergame.object;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
    Board board;
    Dice dice;
    Deque<Player> playersList = new LinkedList<>();
    Player winner;

    public Game() {
        initialiseGame();

    }

    private void initialiseGame() {
        board = new Board(10,5, 3);
        dice = new Dice(1);
        winner = null;
        addPlayer();

    }

    private void addPlayer() {
        Player player1 = new Player("player1", 0);
        Player player2 = new Player("player2", 0);
        playersList.add(player1);
        playersList.add(player2);
    }

    public void startGame() {
        while(winner == null) {
            Player playerTurn  =findPlayerTurn();
            System.out.println("player turn is:" + playerTurn.id + " current position is: " + playerTurn.currentPosition);
            int diceNumbers = dice.rollDice();
            int playerNewPosition = playerTurn.currentPosition + diceNumbers;
            playerNewPosition = jumpCheck(playerNewPosition);
            playerTurn.currentPosition = playerNewPosition;
            System.out.println("player turn is:" + playerTurn.id + " new Position is: " + playerNewPosition);
            if(playerNewPosition >= board.cells.length * board.cells.length-1){

                winner = playerTurn;
                System.out.println("WINNER IS:" + winner.id);
            }

        }

    }

    private Player findPlayerTurn() {
        Player playerTurns = playersList.removeFirst();
        playersList.addLast(playerTurns);
        return playerTurns;
    }

    private int jumpCheck (int playerNewPosition) {

        if(playerNewPosition > board.cells.length * board.cells.length-1 ){
            return playerNewPosition;
        }

        Cell cell = board.getCell(playerNewPosition);
        if(cell.jump != null && cell.jump.startPosition == playerNewPosition) {
            String jumpBy = (cell.jump.startPosition < cell.jump.endPosition)? "ladder" : "snake";
            System.out.println("jump done by: " + jumpBy);
            return cell.jump.endPosition;
        }
        return playerNewPosition;
    }


}

