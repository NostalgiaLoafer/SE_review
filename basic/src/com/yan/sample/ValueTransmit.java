package com.yan.sample;

import org.junit.Test;

public class ValueTransmit {
    public void swap(Object m, Object n){
        Object temp = m;
        m = n;
        n = temp;

    }

    public void swapPlus(Data data){
        int temp = data.m;
        data.m = data.n;
        data.n = temp;

    }

    class Data{
        int m;
        int n;
    }


    @Test
    public void t1(){
        int m = 10, n = 20;
        swap(m, n);
        System.out.println("m = " + m + "，n = " + n); // m = 10，n = 20
    }

    @Test
    public void t2(){
        Data data = new Data();
        data.m = 10;
        data.n = 20;
        swapPlus(data);
        System.out.println("m = " + data.m + "，n = " + data.n); // m = 20，n = 10
    }

    @Test
    public void t3(){
        Data d1 = new Data();
        Data d2 = new Data();
        d1.m = 10;
        d2 = d1;
        System.out.println(d1);// com.yan.sample.ValueTransmit$Data@621be5d1
        System.out.println(d2);// com.yan.sample.ValueTransmit$Data@621be5d1
        System.out.println("d1.m = " + d1.m + "，d2.m = " + d2.m);// d1.m = 10，d2.m = 10
        d2.m = 60;
        System.out.println("d1.m = " + d1.m + "，d2.m = " + d2.m);// d1.m = 60，d2.m = 60


    }

}



