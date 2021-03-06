package by.azzibom.tetris;

import by.azzibom.tetris.model.TetrisGame;
import by.azzibom.tetris.view.swing.DefaultDrawSquareStyle;
import by.azzibom.tetris.view.swing.GameFrame;

import javax.swing.*;

/**
 * Класс с методом main для запуска приложения.
 *
 * @author Ihar Misevich
 */
public class Main {

    public static void main(String[] args) {
        // начальные параметры игры
        String gameName = "Classic Tetris"; // имя игры
        int fieldWidth = 10; // ширина поля
        int fieldHeight = 20; // высота толя
        int speed = 1; // начальная скорость
        // создаем игру
        TetrisGame game = new TetrisGame(gameName, fieldWidth, fieldHeight, speed);
        // создаем и запускаем фрейм
        SwingUtilities.invokeLater(() -> new GameFrame(game, new DefaultDrawSquareStyle()).setVisible(true));
//        game.start();
    }
}
/*
 * TODO: добавить локализацию
 * TODO: добавить настройки...
 * TODO: сделать меню "Справка", добавить "инструкции", "О программе"
 * TODO: сделать ввод параметров, для конфигурации игры.
 * TODO: сделать очередь следующих фигур.
 * TO: сделать состояния игры (пауза, игра, и тд).
 * TODO: отделить контроллер от action-а...
 * TODO: сделать реализацию на javaFX
 * TODO: сделать что бы можно было играть в двоем на 1ом компе
 * TODO: сделать сетевую игру
 * DO: вынести TertisGameField из TertisGameField (???)
 * DO: сделать ведение очков
 * DO: сделать что бы можно было видеть следующую фигуру
 * DO: сделать сброс фигуры
 * DO: решить вопрос с вращением фигуры (возможное решение: вращать фигуру в разные стороны) (оставил как есть)
 * DO: сделать возможность подключения внешних отображений
 * DO: отображение отличается в linux-е и Windows
 * */
