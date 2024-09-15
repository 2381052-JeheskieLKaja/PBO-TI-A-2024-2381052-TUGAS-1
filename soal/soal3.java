package soal;

import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        int total = 1;
        String kalimat;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan kalimat dalam camelcase: ");
        kalimat = input.next();
        char[] kumpulanHuruf = kalimat.toCharArray();
        for (char huruf:kumpulanHuruf){
            if((int)huruf >= 65 && huruf <= 90){
                total++;
            }
        }
        System.out.println(total);
    }
}
