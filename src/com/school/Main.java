package com.school;

import java.math.BigInteger;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {10, 15, 3, 7};
        anyMembersAddUpTo(numbers, 17);
	// write your code here
    }


    public static void anyMembersAddUpTo(int[] numberList, int k) {
        // get a list of numbers
        // get a number "k"
        ArrayList<String> possibleCombinationsForK = new ArrayList<String>();
        for (int index = 0; index < numberList.length; index++) {
            int secondSummandIndex = 0;
            do {
                if (secondSummandIndex != index) {
                    int result = numberList[index] + numberList[secondSummandIndex];
                    //return whether any two numbers from the list when added return k

                    if (result == k) {
                        possibleCombinationsForK.add("" + numberList[index] +"+" + numberList[secondSummandIndex]);
                    }
                    secondSummandIndex++;
                } else {
                    secondSummandIndex++;
                }
            } while (secondSummandIndex < numberList.length);
        }
        System.out.println(possibleCombinationsForK);



    }


}
