import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void computeArea() {
        Square square = new Square(2);
        assertEquals(4.0, square.computeArea(), 0.1);
    }

    @Test
    public void getterSetter() {
        Square square = new Square(1);
        assertEquals(1.0, square.getEdge(), 0.1);

        square.setEdge(5);
        assertEquals(25.0, square.computeArea(), 0.1);
    }
}