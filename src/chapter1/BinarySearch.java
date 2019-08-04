package chapter1;

import java.io.*;
import java.util.StringTokenizer;

public class BinarySearch {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src/chapter1/resources/searchIn.txt"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("src/chapter1/resources/searchOut.txt")));

        int len = Integer.parseInt(br.readLine());
        int[] lst = new int[len];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < len; i++) {
            lst[i] = Integer.parseInt(st.nextToken());
        }
        int target = Integer.parseInt(br.readLine());
        int lo = 0;
        int hi = len;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (target == lst[mid]) {
                lo = mid;
                hi = mid;
            } else if (target > lst[mid]) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        pw.println(lo);
        pw.close();
    }
}
