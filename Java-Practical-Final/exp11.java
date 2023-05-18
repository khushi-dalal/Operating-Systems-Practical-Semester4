// You have been given an array of positive integers A1, A2,…,An with length N and you have to print an array of same length (N) where the values in the new array are the sum of every number in the array, except the number at that index.
// i/p 1 2 3 4
// For the 0th index, the result will be 2+3+4= 9, similarly for the second, third and fourth index the corresponding results will be 8, 7 and 6 respectively.
// i/p 4 5 6
o/p 11 10 9

import java.util.Arrays;

public class exp11 {
    public static void main(String[] args) {
    int inputArray[] = {1,2,3,4};
    int n = inputArray.length;
    int sumArray[] = new int[n];
    for(int i=0;i<n;i++){
        int sum=0;
        for(int j=0;j<n;j++){
            if(i!=j){
                sum += inputArray[j];
            }
        }
        sumArray[i] = sum;
    }
        System.out.println("Input array: " + Arrays.toString(inputArray));
        System.out.println("Output array: " + Arrays.toString(sumArray));
}
}
