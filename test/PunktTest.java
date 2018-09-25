import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PunktTest {

    public static final double DELTA = 0.001;

    @Test
    void testNytPunkt1() {
        double expectedX = 3;
        double expectedY = 0;
        Punkt punkt = new Punkt(expectedX, expectedY);

        double x = punkt.getX();
        double y = punkt.getY();

        assertEquals(expectedX,x,DELTA);
        assertEquals(expectedY,y, DELTA);
    }
    @Test
    void testNytPunkt2() {
        double expectedX = 0;
        double expectedY = 4;
        Punkt punkt = new Punkt(expectedX, expectedY);

        double x = punkt.getX();
        double y = punkt.getY();

        assertEquals(expectedX,x,DELTA);
        assertEquals(expectedY,y, DELTA);
    }
    @Test
    void testLength() {

        Punkt a = new Punkt(0,3);
        Punkt b = new Punkt(0,4);

        Linje linje = new Linje(a,b);

        double length = linje.calculateLength ();


        int expectedLength = 1;
        assertEquals(expectedLength,length,DELTA);

    }
}