package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void whenTheSamePosition() {
        BishopBlack elephant = new BishopBlack(Cell.F8);
        Cell elephantPosition = elephant.position();
        assertEquals(Cell.F8, elephantPosition);
    }

    @Test
    public void whenCopyCorrect() {
        BishopBlack elephant = new BishopBlack(Cell.F8);
        Figure copyElephant = elephant.copy(Cell.H6);
        assertEquals(Cell.H6, copyElephant.position());
    }

    @Test
    public void whenWayD2E3F4G5() {
        BishopBlack elephant = new BishopBlack(Cell.C1);
        Cell[] positions = elephant.way(Cell.G5);
        Cell[] expected = new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertArrayEquals(expected, positions);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void whenNotRightWay() {
        BishopBlack elephant = new BishopBlack(Cell.C1);
        Cell[] positions = elephant.way(Cell.G6);
    }
}