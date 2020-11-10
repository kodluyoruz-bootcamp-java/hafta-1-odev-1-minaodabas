package yuvarlama_işlemi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a;
        String b;
        System.out.println("Lutfen yuvarlamak istediginiz sayiyi giriniz:");
        a = input.nextFloat();
        System.out.println("Lutfen asagı veya yukari olarak belirtiniz:");
        b = input.next();

        if(b.equals("asagi")){
            System.out.println(Math.floor(a));
        }
        else if(b.equals("yukari")){
            System.out.println(Math.ceil(a));
        }

    }
}
