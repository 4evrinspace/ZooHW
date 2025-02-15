


import hm.animals.Monkey;
import hm.animals.Rabbit;
import hm.animals.Tiger;
import hm.animals.Wolf;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class AnimalsTest {

    @Test
    public void testWolf() {
        Wolf wlf = new Wolf("Wolf", 3);
        Assertions.assertThrows(IllegalArgumentException.class, () -> wlf.setNumber(-1));
        wlf.setNumber(12);
        Assertions.assertEquals("Wolf", wlf.getName());
        Assertions.assertEquals(3, wlf.getFood());
        Assertions.assertEquals(12, wlf.getNumber());


        Assertions.assertThrows(UnsupportedOperationException.class, () -> wlf.setName("2"));
        Assertions.assertThrows(UnsupportedOperationException.class, () -> wlf.setNumber(1));
        wlf.setFood(1);
        Assertions.assertEquals(1, wlf.getFood());

    }

    @Test
    public void testTiger() {
        Tiger tgr = new Tiger("Tgr", 3);
        Assertions.assertThrows(IllegalArgumentException.class, () -> tgr.setNumber(-1));
        tgr.setNumber(12);
        Assertions.assertEquals("Tgr", tgr.getName());
        Assertions.assertEquals(3, tgr.getFood());
        Assertions.assertEquals(12, tgr.getNumber());


        Assertions.assertThrows(UnsupportedOperationException.class, () -> tgr.setName("2"));
        Assertions.assertThrows(UnsupportedOperationException.class, () -> tgr.setNumber(1));
        tgr.setFood(1);
        Assertions.assertEquals(1, tgr.getFood());
    }

    @Test
    public void testRabbit() {
        Rabbit rbt = new Rabbit("Rbt", 3, 2);
        Assertions.assertThrows(IllegalArgumentException.class, () -> rbt.setNumber(-1));
        rbt.setNumber(12);
        Assertions.assertEquals("Rbt", rbt.getName());
        Assertions.assertEquals(3, rbt.getFood());
        Assertions.assertEquals(12, rbt.getNumber());
        Assertions.assertEquals(2, rbt.getKindness());
        Assertions.assertEquals(false, rbt.isInteractable());
        rbt.setKindness(7);
        Assertions.assertEquals(7, rbt.getKindness());
        Assertions.assertEquals(true, rbt.isInteractable());
        Assertions.assertThrows(UnsupportedOperationException.class, () -> rbt.setName("2"));
        Assertions.assertThrows(UnsupportedOperationException.class, () -> rbt.setNumber(1));
        Assertions.assertThrows(IllegalArgumentException.class, () -> rbt.setKindness(-1));
    }

    @Test
    public void testMonkey() {
        Monkey mnk = new Monkey("Mnk", 3, 2);
        Assertions.assertThrows(IllegalArgumentException.class, () -> mnk.setNumber(-1));
        mnk.setNumber(12);
        Assertions.assertEquals("Mnk", mnk.getName());
        Assertions.assertEquals(3, mnk.getFood());
        Assertions.assertEquals(12, mnk.getNumber());
        Assertions.assertEquals(2, mnk.getKindness());
        mnk.setKindness(2);
        Assertions.assertEquals(2, mnk.getKindness());
        Assertions.assertThrows(UnsupportedOperationException.class, () -> mnk.setName("2"));
        Assertions.assertThrows(UnsupportedOperationException.class, () -> mnk.setNumber(1));
        Assertions.assertThrows(IllegalArgumentException.class, () -> mnk.setKindness(-1));
    }
}