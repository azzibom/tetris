package by.azzibom.tetris.view.swing;

import by.azzibom.tetris.model.TetrisGame;

import java.awt.*;

/**
 * панель для отображения следующей фигуры
 *
 * @author Ihar Misevich
 */
public class NextShapeField extends TetrisGamePanel {

    private final int countPoints = 5;//

    private final int shapePos = (countPoints / 2);

    NextShapeField(TetrisGame game, DrawSquareStyle drawSquareStyleStrategy) {
        super(game, drawSquareStyleStrategy, 16);
        super.setPreferredSize(new Dimension(countPoints * pointSize, countPoints * pointSize));
    }

    @Override
    public void paint(Graphics g) {
        for (int i = 0; i < countPoints; i++) {
            for (int j = 0; j < countPoints; j++) {
                drawSquare(g, i, j, null);
            }
        }

        drawShape(g, shapePos, shapePos, game.getNextShape());
    }
}
