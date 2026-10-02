package org.example.stringPrograms;

public class DuplicateFind {
    public static void main(String[] args) {
        String s = "hello aravindh hello udhaya";
        String[] str = s.split(" ");
        boolean[] verfied = new boolean[str.length];
        for (int i = 0; i < str.length; i++) {

            if (verfied[i]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].equals(str[j])) {
                    count++;
                    verfied[j] = true;
                }
            }
            if (count > 1) {
                System.out.println(str[i] + ":" + count);
            }
        }
    }
}
