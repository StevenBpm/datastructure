package esctructura_de_datos;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] rNumbers = {5,89,12,4,3};
        Bubble bubble = new Bubble();
        // print messy array
        System.out.println(Arrays.toString(rNumbers));
        // print sort array
        System.out.println(Arrays.toString(bubble.toSort(rNumbers)));
    }
}
