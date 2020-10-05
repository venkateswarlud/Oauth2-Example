package com.example.SpringMongoExample;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OddNumbersOfElement {
    public int solution(int[] arr) {
        int n= arr.length;
        for (int i = 0; i < n; i++) {
            int j;
            for (j = 0; j < n; j++)
                if (i != j && arr[i] == arr[j])
                    break;
            if (j == n)
                return arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        OddNumbersOfElement numbers = new OddNumbersOfElement();
        int[] a = {3, 8, 9, 8, 3, 7, 9, 7, 6};
        System.out.println(numbers.solution(a));
    }
}
