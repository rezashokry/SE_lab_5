import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {


    @Test
    public void computeArea() {
        Rectangle rectangle = new Rectangle(3, 7);
        assertEquals(21.0, rectangle.computeArea(), 0.1);
    }

    @Test
    public void getterSetter() {
        Rectangle rectangle = new Rectangle(2, 3);
        assertEquals(2.0, rectangle.getHeight(), 0.1);
        assertEquals(3.0, rectangle.getWidth(), 0.1);

        rectangle.setWidth(5);
        rectangle.setHeight(8);
        assertEquals(8.0, rectangle.getHeight(), 0.1);
        assertEquals(5.0, rectangle.getWidth(), 0.1);
    }
}