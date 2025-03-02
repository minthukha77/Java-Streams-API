package mtk;

import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5};

        int max = Arrays.stream(a).peek(System.out::println).max().orElseThrow();
        System.out.println(max);
    }
}
