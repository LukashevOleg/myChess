package com.mychess;

import com.mychess.board.Board;
import com.mychess.board.BoardFactory;

public class Application {
    public static void main(String[] args) {
        Board board = (new BoardFactory()).fromFEN("rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1");

        Game game = new Game(board);
        game.gameLoop();
    }
}