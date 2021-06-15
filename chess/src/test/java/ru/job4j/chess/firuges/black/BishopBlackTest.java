package ru.job4j.chess.firuges.black;

import junit.framework.TestCase;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class BishopBlackTest  {

    @Test
    public void Position() {
        BishopBlack bishopBlack = new BishopBlack(Cell.D1);
        assertThat(bishopBlack.position(), is(Cell.D1));
    }

    @Test
    public void Copy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.B1);
        assertThat(bishopBlack.copy(Cell.F5).position(), is(Cell.F5));
    }

    @Test
    public void Way() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertThat(bishopBlack.way(Cell.D2), is(new Cell[] {Cell.D2, Cell.E3, Cell.F4, Cell.G5}));
    }

    @Test
    public void Diagonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
       bishopBlack.isDiagonal(Cell.A1, Cell.H8);
    }
}