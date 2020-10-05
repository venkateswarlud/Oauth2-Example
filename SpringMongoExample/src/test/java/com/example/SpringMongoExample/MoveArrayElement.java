package com.example.SpringMongoExample;

import java.util.Arrays;

public class MoveArrayElement {

    public static int[] solution(int[] array, int shift) {
        int[] rotated_array = new int[array.length];
        int k = 3;
        int l = 0;
        int length  = array.length;
        if (length == 0 || length == 1 || k % length == 0) {
            return array;
        }
         else {
            // modify K to avoid wasting processing time
          /**  if (K > N) {
                K = K % N;
            }**/
            // iterate through rotated_A and populated with the rotated values from A
            for (int i = 0; i < array.length; i++) {
                int j = i + k;
                if (j > array.length - 1) {
                    rotated_array[l] = array[i];
                    l++;
                } else {
                    rotated_array[j] = array[i];
                }
            }


         /**   for (int i = 0; i < N; i++) {
                // if the elements are being moved from right to left (Cyclic rotation)
                if (N - K + i < N) {
                    rotated_A[i] = A[N - K + i];
                }
                // if the elements are being moved from left to right (left to right rotation)
                else {
                    rotated_A[i] = A[i - K];
                }
            }**/
            return rotated_array;
        }
    }

    public static void main(String[] args) {
        int[] a = {3, 8, 9, 7, 6}; // 7,6,3,8,9
       /** int[] b = new int[5];
        int k = 3;
        int l = 0;
        int length  = a.length;
        if (length == 0 || length == 1 || k % length == 0) {
            Arrays.stream(a).forEach(System.out::print);
        }
        else {
            for (int i = 0; i < a.length; i++) {
                int j = i + k;
                if (j > a.length - 1) {
                    b[l] = a[i];
                    l++;
                } else {
                    b[j] = a[i];
                }
            }
        }*/
        Arrays.stream(solution(a,2)).forEach(System.out::print);
    }
}
