package com.bl.main;

import com.bl.helper.ArrayHelper;
import java.util.Arrays;

public class BLApplication {
    public static void main(String[] args) {
        ArrayHelper helper = new ArrayHelper();

        int[] sortedArray = helper.sort(new int[]{23, 12, 56, 9, 39, 11});
        Arrays.stream(sortedArray).forEach(e -> System.out.println(e));
    }
}
