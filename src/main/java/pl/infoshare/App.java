package pl.infoshare;

import java.sql.SQLOutput;
import java.util.Scanner;

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

        int  b =  (int) a; //tu wyjdzie 90 bo transformuje double(liczbe po przecinku) na cakowita
        System.out.println(b);

        char c = 'a';
        System.out.println(c);

        char d =  (char) 90;        //Konwersja/rzutowanie cyfry 90 na char wg kodu ASCII daje Z...
        System.out.println(d);      //...dlatego tu wyswietla Z na ekranie

        int e = (int) c;            //konwersja/rzutowanie zmiennej c(ktorej przypisano znak a) na calkowita wg kodu ASCII daje 97...
        System.out.println(e);      //...dlatego tu wyswietlilo 97 na ekranie

        int g = (int) 'c';            //konwersja/rzutowanie znaku c na calkowita liczbe daje 97...
        System.out.println(g);

        System.out.println(b/a + d + " Wynik to:" + (b/a + d));
        System.out.println(b/a + d + " Wynik to:" + (b + a + d));
        System.out.println(b/a + d + " Wynik to:" + ("ZZZZ" + b + a + d));  //jezeli zaczynam od stringa to reszte dzialania
                                                                            // potraktuje jako ciag znakow

        double f = (double) 4;          //tu konwertuje 4 na typ double
        System.out.println(f);          //dlatego w wyniku poda 4 z przecinkiem 4.0

        int h = (int) 4;                //tu konwertuje 4 na typ double
        System.out.println(h);          //dlatego w wyniku poda 4 bez przecinka czyli wyswietli 4

        int suma = (byte) 200 + (byte) 200; //?
        System.out.println(suma);


        /*
        instrukcja warunkowa
         */


        byte age = 24;

        if (age == 18)                                          //instrukcja warunkowa if - jesli warunek w nawiasie spelniony..
        {
            System.out.println("Wiek jest rowny 18 lat");       //..to wykona sie kod z tej sekcji
        }

        if (age >=20 && age <=30)
        {
            System.out.println("Wiek jest wiekszy rowny 20 i mniejszy rowny 30");
        }

        if (age==26 && age==28) //podwojne & daje AND, a podwojny || daje OR
        {
            System.out.println("Wiek jest rowny 26 lub rowny 28");
        }
        else if (age >= 123)                        //przechodzi do else if jesli warunek if nie jest spelniony
        {
            System.out.println("you are dead");     //ten kod zostanie wykonany jesli warunek w else if nie zostanie spelniony
        }
        else                                        //przechodzi do else jesli warunek if i else if nie sa spelnione
        {
            System.out.println("jestes poprostu stary"); //jesli przejdzie do instrukcji else to automatycznie wykona sie ten kod
        }


        int agePrim = 25;


        switch (agePrim)
        {
            case 20:
            {
                System.out.println("wiek jest rowny 20");
                break;
            }
            case 25:
            case 26:
            {
                System.out.println("wiek jest rowny 25 lub 26");
//                    break;                                        //jesli tu bedzie break to nie przejdzie do kolejnego case'a
            }

            case 30:
            {
                System.out.println("wiek jest rowny 30");       //wykonal ten kod poniewaz w powyzszym case'ie nie ma breake'a
                break;
            }

        }


        String sex = "f";
        String toPrint;
        if(sex == "m")
        {
            toPrint = "male";
        }
        else
        {
            toPrint = "female";
        }
        System.out.println(toPrint);

        String sex1 = "m";
        String toPrint1 = (sex1 == "m" ? "male1" : "female1");

        System.out.println(toPrint1);


        
        /** Zadanie 1 - Wczytaj z klawiatury liczbe czalkowita i wyswietl ja w formacie zmiennoprzecinowym
         **/


        System.out.println("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int readNumber = scanner.nextInt();
        double number = (double) readNumber;
        System.out.println("You have entered: " + number);

        /** Zadanie2 - Popros uzytkownika o podanie wieku, a potem sprawdz czy jest pelnoletni:
        **/

        System.out.println("Enter your age: ");

        String myString;
        myString = scanner.nextLine();

        try
        {
            int age1 = Integer.parseInt(myString);

            if (age1 <= 123)
            {
                System.out.println("You entered age: " + age1);

                String ifAdult = (age1 >= 18 ? "You're adult" : "You're not adult");
                System.out.println(ifAdult);
            }
            else
            {
                System.out.println("Wrong age. Please enter age under 123");
            }
        }
        catch (NumberFormatException exept)
        {
            System.out.println("Can't convert \"" + myString + "\" to integer. Please input only digits");
        }


        /** Zadanie3 - Popros uzytkownika o podanie loginu i hasla.
             Wyswietl komunikat, jesli logowanie przebieglo pomyslnie
         **/

        String loginUser = "user";
        String loginAdmin = "admin";
        String passUser = "user";
        String passAdmin = "admin";

        System.out.print("Enter your login: ");
        String readLogin = scanner.nextLine();


        System.out.print("Enter your password: ");
        String readPass = scanner.nextLine();

        if (readLogin.equals(loginUser) && readPass.equals(passUser))
        {
            System.out.println("You have successfully logged in as: " + loginUser);
        }
        else if (readLogin.equals(loginAdmin) && readPass.equals(passAdmin))
        {
            System.out.println("You have successfully logged in as: " + loginAdmin);
        }
        else
            {
                System.out.println("Unsuccessful login");
            }
    }




}


