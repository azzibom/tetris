package by.azzibom.tetris.controller;

import by.azzibom.tetris.model.TetrisGame;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * класс реагирующий на нажатия кнопок на клавиатуре и изменяющий модель
 *
 * @author Ihar Misevich
 */
public class GameKeyController extends KeyAdapter {

    private final TetrisGame game;

    public GameKeyController(TetrisGame game) {
        this.game = game;
    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (game.isGameOver()) return;

        if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            game.setPause(!game.isPause());
        }

        if (game.isPause()) return;

        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP: {
                game.rotate();
                break;
            }
            case KeyEvent.VK_DOWN: {
                game.oneLineDown();
                break;
            }
            case KeyEvent.VK_LEFT: {
                game.oneLineLeft();
                break;
            }
            case KeyEvent.VK_RIGHT: {
                game.oneLineRight();
                break;
            }
            case KeyEvent.VK_SPACE: {
                game.dropDown();
                break;
            }
        }
    }
}
