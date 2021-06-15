package ru.job4j.chess;

import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;
import ru.job4j.chess.firuges.black.RookBlack;

public class LogicTest {

    @Ignore
    @Test
    public void move() {
    }

    @Test(expected = OccupiedCellException.class) //ячейка занята.
    public void OccupiedCell() throws FigureNotFoundException, OccupiedCellException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.A1));
        logic.add(new RookBlack(Cell.D4));
        logic.move(Cell.A1, Cell.D4);
    }

    @Test(expected = FigureNotFoundException.class) //фигуры нет на клетке.
    public void FigureNotFound() throws FigureNotFoundException, OccupiedCellException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.D2, Cell.H6);
    }

    @Test(expected = ImpossibleMoveException.class) //пользователь двигает фигуру не по правилам шахмат.
    public void ImpossibleMove() throws FigureNotFoundException, OccupiedCellException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.A1));
        logic.move(Cell.A1, Cell.A5);
    }
}