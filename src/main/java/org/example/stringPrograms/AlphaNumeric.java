package org.example.stringPrograms;

public class AlphaNumeric {
    public static void main(String[] args) {
        String s="12Abc3k4ll5";
        char[] ch=s.toCharArray();
        int sum=0;
        for (int i=0;i<ch.length;i++){
            if (ch[i]>='0'&& ch[i]<='9'){
                sum+=ch[i]-48;//-48 is bcoz the char store the value by ascci not by int so we use this to get the correct int --> ascci value of 0 is 48
            }
        }
        System.out.println(sum);
    }
}
