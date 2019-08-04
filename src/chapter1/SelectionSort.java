package chapter1;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SelectionSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src/chapter1/resources/sortIn.txt"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("src/chapter1/resources/sortOut.txt")));

        int numCount = Integer.parseInt(br.readLine());
        int[] numbers = new int[numCount];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < numCount; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < numCount; i++) {
            int min = findMin(numbers, i);
            int temp = numbers[i];
            numbers[i] = numbers[min];
            numbers[min] = temp;
        }

        pw.println(Arrays.toString(numbers));
        pw.close();

    }
    private static int findMin(int[] lst, int start) { // returns index
        int min = lst[start];
        int index = start;
        for (int i = start + 1; i < lst.length; i++) {
            if (lst[i] < min) {
                index = i;
                min = lst[i];
            }
        }
        return index;
    }
}
