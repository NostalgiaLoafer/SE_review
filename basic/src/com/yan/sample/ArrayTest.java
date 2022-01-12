package com.yan.sample;

public class ArrayTest {

    public static void main(String[] args) {
        int[] a1 = {2, 0, 1, 5};
        for (int i = 0; i < a1.length; i++){
            System.out.println(a1[i]);
        }

        String[] s1 = {"长亭外，古道边，芳草碧连天。晚风拂柳笛声残，夕阳山外山", "天之涯，地之角，知交半零落。一壶浊酒尽余欢，今宵别梦寒",
        "长亭外，古道边，芳草碧连天。问君此去几时来，来时莫徘徊", "天之涯，地之角，知交半零落。人生难得是欢聚，惟有别离多"};
        for (int i = 0; i < s1.length; i++) {
            System.out.println(s1[i]);
        }

        int[][] a2 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        for (int i = 0; i < a2.length; i++) {
            for (int j = 0; j < a2[i].length; j++){
                System.out.print(a2[i][j]);
            }
        }

    }
}
