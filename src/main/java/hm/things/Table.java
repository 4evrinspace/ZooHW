package hm.things;

import lombok.ToString;

@ToString(callSuper = true)
public class Table extends Thing {
    public Table() {
        super("Table");
    }
}