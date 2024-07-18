package com.bl.helper;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayHelper {
    private Logger logger = LogManager.getLogger(ArrayHelper.class);

    public int[] sort(int[] inArray) {
        int[] sortedArray = null;
        int swap = 0;

        logger.debug("cloning original array: {}", inArray);
        sortedArray = inArray.clone();

        for (int i = 0; i < sortedArray.length; i++) {
            logger.debug("-----------------iteration : {}---------------------------", i);

            for (int j = 0; j < sortedArray.length - i - 1; j++) {
                logger.debug("array[j]:{} > array[j+1]:{}", sortedArray[j], sortedArray[j + 1]);
                if (sortedArray[j] > sortedArray[j + 1]) {
                    swap = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = swap;
                }
            }
            logger.debug("----------------------------end of iteration: {}------------------", i);
        }
        logger.debug("sorted array :{} ", sortedArray);
        return sortedArray;
    }
}
