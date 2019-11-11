//package invadem;
import movingsquare.squares.Tank;
import org.junit.Test;
import static org.junit.Assert.*;

public class TankTest {

//    @Test
    public void testTankConstruction() {
        Tank tank = new Tank(null, 309, 464, 22, 16, new int[] {2, 1});

        assertNotNull(tank);
    }

//    @Test
//    public void testTankProjectile() {
//        Tank tank = new Tank(null, 0, 0);
//        assertNotNull(tank.fire());
//    }

//    @Test
//    public void testTankIsNotDead() {
//        Tank tank = new Tank(null, 0, 0);
//        assertEquals(true, tank.isDead());
//    }

}
