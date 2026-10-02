package org.example.stringPrograms;

public class PrintOccurence {
    public static void main(String[] args) {
        String s = "MALAYALAM";
        String[] str = s.split("");

        boolean[] verified= new boolean[str.length];
        for (int i=0;i< str.length;i++){
            int count =1;
            if (verified[i]){
                continue;
            }
            for (int j=i+1;j< str.length;j++){
                if (str[i].equals(str[j])){
                    count++;
                    verified[j]=true;
                }
            }
            if(count>=1){
                System.out.println(str[i]+"-"+count);
            }
        }
    }
}
