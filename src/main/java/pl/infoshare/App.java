package pl.infoshare;

import java.sql.SQLOutput;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        //rzutowanie:
        double a = 90.99;
        System.out.println(a);

        int  b =  (int) a; //tu wyjdzie 90 bo transformuje double(liczba po przecinku) na cakowita
        System.out.println(b);

        char c= 'a';
        System.out.println(c);

        char d =  (char) 90;
        System.out.println(d);

        int e = (int) c;
        System.out.println(e);

        System.out.println(b/a + d + " Wynik to:" + (b/a + d));

        System.out.println(b/a + d + " Wynik to:" + (b + a + d));

        System.out.println(b/a + d + " Wynik to:" + ("ZZZZ" + b + a + d));


        System.out.println( "Hello World!" ); //tu wpisuje swoj komentarz



        /*
        instrukcja warunkowa
         */


        byte age = 18;

        if (age == 18) {
            System.out.println("Wiek jest rwny od 18 lat");
        }

        if (age >=20 && age <=30) {
            System.out.println("Wiek jest wiekszy rwny 20 i mniejszy rowny 30");
        }

        if (age ==26 && age ==28) {
            System.out.println("Wiek jest rowny 26 lub rowny 28");
        }
            else if (age >= 123) {
                System.out.println("you are dead");}

            else {
                System.out.println("jestes poprostu stary");

            }

           int agePrim = 30;

            switch (agePrim) {
                case 20: {
                    System.out.println("wiek jest rowny 20");
                    break;
                }
                case 25: {
                    System.out.println("wiek jest rowny 25");
                    break;
                }

                case 30: {
                    System.out.println("wiek jest rowny 25");
                    break;
                }

                }
            }

    }


