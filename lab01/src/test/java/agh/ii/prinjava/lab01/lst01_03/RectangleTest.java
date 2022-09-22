package agh.ii.prinjava.lab01.lst01_03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class RectangleTest {
    @Test
    public void testArea() {
        Rectangle rectangle = new Rectangle(4, 4);
        Assertions.assertEquals(16,rectangle.area());
    }

}