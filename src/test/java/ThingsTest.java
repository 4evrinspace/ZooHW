


import hm.animals.Wolf;
import hm.things.Thing;
import hm.things.Table;
import hm.things.Computer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class ThingsTest {

    @Test
    public void testTable() {
        Table tbl = new Table();
        Assertions.assertThrows(IllegalArgumentException.class, () -> tbl.setNumber(-1));
        tbl.setNumber(12);
        Assertions.assertEquals(12, tbl.getNumber());


        Assertions.assertThrows(UnsupportedOperationException.class, () -> tbl.setName("2"));
        Assertions.assertThrows(UnsupportedOperationException.class, () -> tbl.setNumber(1));
    }

    @Test
    public void testComputer() {
        Computer cmp = new Computer();
        Assertions.assertThrows(IllegalArgumentException.class, () -> cmp.setNumber(-1));
        cmp.setNumber(12);
        Assertions.assertEquals(12, cmp.getNumber());


        Assertions.assertThrows(UnsupportedOperationException.class, () -> cmp.setName("2"));
        Assertions.assertThrows(UnsupportedOperationException.class, () -> cmp.setNumber(1));
    }
}