package hm.things;

import lombok.ToString;

@ToString(callSuper = true)
public class Computer extends Thing {
    public Computer() {
        super("Computer");
    }


}
