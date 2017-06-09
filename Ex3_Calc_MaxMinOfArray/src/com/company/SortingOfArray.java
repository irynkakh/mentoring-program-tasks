package com.company;

public class SortingOfArray {

    public double[] sortingOfArray(double[] array)
    {
        double temp; int j = 0;
        boolean swapped = true;
        while (swapped) {

            swapped = false;
            j++;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
        }

        return array;

    }

    public double maxValueOfArray (double[] array)
    {
        double maximum;
        sortingOfArray(array);
        maximum = array[array.length-1];
        return maximum;
    }

    public double minValueOfArray (double[] array)
    {
        double minimum;
        sortingOfArray(array);
        minimum = array[0];
        return minimum;
    }

    public void printArray(double[] array)
    {
        for (int i=0; i<array.length; i++)
            System.out.print(array[i]+ "  ");
        System.out.println("\n");
    }
}
