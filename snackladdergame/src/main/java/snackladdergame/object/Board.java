package snackladdergame.object;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
    Cell[][] cells;

    public Board(int boardSize, int numberOfSnake, int numberOfLadder) {
        initializeBoard(boardSize);
        addSnakesLadder(cells,numberOfSnake,numberOfLadder);

    }

    private  void   initializeBoard(int boardSize){
        cells = new Cell[boardSize][boardSize];
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                cells[i][j] = new Cell();
            }
        }

    }

    private  void addSnakesLadder(Cell[][] cells, int numberSnakes, int numberOfLadders){
        for (int i = 0; i < numberSnakes; i++) {
            int snakeHead = ThreadLocalRandom.current().nextInt(1, cells.length*cells.length-1);
            int snakeTail = ThreadLocalRandom.current().nextInt(1, cells.length*cells.length-1);
            if(snakeTail>=snakeHead) continue;
            Jump snakeObj = new Jump();
            snakeObj.startPosition = snakeHead;
            snakeObj.endPosition = snakeTail;
            Cell cell = getCell(snakeHead) ;
            cell.jump = snakeObj;
        }

        for (int i = 0; i < numberSnakes; i++) {
            int ladderHead= ThreadLocalRandom.current().nextInt(1, cells.length*cells.length-1);
            int ladderTail = ThreadLocalRandom.current().nextInt(1, cells.length*cells.length-1);
            if(ladderHead<=ladderTail) continue;
            Jump ladderObj = new Jump();
            ladderObj.startPosition = ladderHead;
            ladderObj.endPosition = ladderTail;
            Cell cell = getCell(ladderHead);
            cell.jump = ladderObj;

        }

    }

    Cell getCell(int playerPosition) {
        int boardRow = playerPosition / cells.length;
        int boardColumn = (playerPosition % cells.length);
        return cells[boardRow][boardColumn];
    }
}
