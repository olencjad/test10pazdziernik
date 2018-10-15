package pl.infoshare;

import java.util.Random;

public class lesson3 {

    public static void main( String[] args )
    {
 //stworzenie tablicy jednoelementowej i wyswietlicnieaprzyste elementy
    int[] array = new int [6];

            array [0] = 5;
            array [1] = 7;
             array [2] = 0;
           array [3] = 3;
             array [4] = 5;
         array [5] = 6;

        System.out.println("Elementy" + array[0] + "" + array[2] + "" + array[4]);
        System.out.println(array[5]);


        //napisz program ktory wypisze liczby od 1-10:

        for (short i = 1; i<=10; i++)
        {
            System.out.println(i);
        }

        //napisz program  wypisujacy liczby od 1-1000:

        for (int i = 1; i<1001; i++) //mozna tez wstawici>0 -- bedzie liczyc w nieskonczonosc
        {
            System.out.println(i);
        }

        //napisz program  wypisujacy liczby od 1-1000:

      /*  for (int i = 1; i<1001 || i>0; i++) //mozna tez wstawici>0 --
        {
            System.out.println(i);
        }
        */

        for (int i = 1000; i>0; i--)
        {
            System.out.println(i);
        }

        for (int i = 1000; i>0; i-=2) //co druga wypisze
        {
            System.out.println(i);
        }


        //while:

        int  i = 1;
        while (i<1001) //dopoki warunek jest prawda rob to co w sekcji
        {
            System.out.println(i);
            i++;
        }

        //petle
/*
        int[] arrayFor = new int[1000];

        for (int j =0 ; j<1000; i++)
        {
            arrayFor[j] = j +1;
        }

        for (int element : arrayFor)
        {
            System.out.println(element);
        }
*/

/*
    //petla w petli zagniezdzona - od wewnatrz do zewnatrz

        int [][] array2D = new int[10][10];

        for (int k=0; k<array2D.length; k++)
        {
            System.out.println("I'm in row no. " + k);

            for (int l=0; l<array2D.length; l++)
            {
                System.out.println("I'm in column no. " + l);
            }

        }
        */

  /*      //Zadanie1
        int[] array1 = new int [11];
        Random random = new Random();
        int randomInt = random.nextInt(100) +1;

        for (int i=0; i<array.length)

        array1 [0] = 3;
        array1 [1] = 5;
        array1 [2] = 7;
        array1 [3] = 3;
        array1 [4] = 5;
        array1 [5] = 6;
        array1 [6] = 6;
        array1 [7] = 6;
        array1 [8] = 6;
        array1 [9] = 6;
        array1 [10] = 6;
        array1 [11] = 6;


        for
        */

    }


}
