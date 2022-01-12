package com.yan.sample;

import org.junit.Test;

public class Block {



/*    {
        System.out.println("1");
    }

    static {
        System.out.println("s1");
    }

    static {
        System.out.println("s2");
    }

    {
        System.out.println("2");
    }*/

    int id = 3;
    {
        id = 4;
    }
    @Test
    public void t(){
/*        Block block = new Block();
        System.out.println(block);*/
        System.out.println(new Block().id);
    }
}
