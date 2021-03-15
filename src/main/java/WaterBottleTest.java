import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;
    @Before
    public void before() {
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void hasVolume() {
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void canReduceVolumeBy10() {
        waterBottle.drink();
        assertEquals(90, waterBottle.getVolume());

    }

    @Test
    public void canReduceVolumeBy30() {
        waterBottle.drink();
        waterBottle.drink();
        waterBottle.drink();
        assertEquals(70, waterBottle.getVolume());
    }
}
