package pl.infoshare;

import java.util.Random;
import java.util.Scanner;

public class lesson3_petle_moje {

    public static void main(String[] args) {

/*
Napisz program, który wypisze liczby 1 do 10
 */
        for (int number = 1; number<= 10; number++)
        {
            System.out.println(number);
        }

/*
Napisz program, który wypisze liczby 1 do 100
 */
        for (int number = 1; number<= 100; number++)
        {
            System.out.println(number);
        }

/*
Stwórz tablicę jednowymiarową i umieść w niej dowolne wartości. Wypisz na ekran tylko komórki o indeksie nieparzystym
 */
        int [] array = {1,2,3,4,5,6,7,8,9,10}; //inicjalizaja tablicy, gdy znam wartości tablicy w momencie jej tworzenia

        for (int i = 1; i< 10; i=i+2)  //i= indeks tablicy
        {
            System.out.println(array[i]);
        }

        int[][] array2D = new int[6][3];

        for (int i = 0; i < array2D.length; i++) {          //array2D.length -> okresla ilość wierszy (tu zawsze 6)
            System.out.println("I'm in row no. " + i);      //jeśli ilość wierszy jest mniejsza od 6,to wyswietl to co w pętli for
            for (int j = 0; j < array2D[i].length; j++) {   //-> okresla ilość kolumn w danym wierszu (tu zawsze 3)
                System.out.println("I'm in column no. " + j);
            }
        }

        System.out.println("---------------------------------------------------------------");
        System.out.println();
        System.out.println();

        //1. 2. 3. ...
        for (int i = 1; i < array2D.length + 1 ; i++ )
        {
            System.out.print(i + ". ");

            //1 2 3 4 5 6 7 8 9 10
            for (int j = 1 ; j < array2D[i-1].length + 1 ; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println(); //Next line
        }

        System.out.println("---------------------------------------------------------------");

        for (int i=1; i <10; i++)
        {
            for (int j=0; j <10; j++)
            {
                if ((j % i)==0) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();

        }

        System.out.println("---------------------------------------------------------------");

        for (int i=0; i <10; i++)
        {
            for (int j=0; j <10; j++)
            {
                if (i==j) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();

        }

        System.out.println("---------------------------------------------------------------");

        /*
            CHRISTMAS TREE
         */
        for (int i = 0; i < 10; i++)                //określa wiersze
        {
            for (int j = 0; j < 10 - i; j++)        //określa ile ma zostawić pustych kolumn w danym wierszu
                System.out.print(" ");              // - np dla wiersza i=0 zostawia 10 pustych kolumn, 1szego 9, 2giego 8 itd.
            for (int k = 0; k < (2 * i + 1); k++)   //ten 'for' mówi ile gwiazdek ma narysowac w wierszu i
                System.out.print("*");              //tj dla wiersza 0 rysuje 1dną gwiazdke, 1szego 3, 2giego 5 itd.
            System.out.println();
        }

        System.out.println("---------------------------------------------------------------");


        int[][] array2DFor = new int[10][10];               //inicjalizacja pustej tabeli 10X10

        for (int i = 0; i < array2DFor.length; i++)         //Pierwsza petla "lata po wierszach", sprawdza warunek czy i<10
        {                                                   //i - numer wiersza
            for (int j = 0; j < array2DFor.length; j++)     //Druga petla "lata" po kolumnach
            {                                               //j - numer kolumny
                array2DFor[i][j] = j + 1;                   //przypisanie wartości do każdej komówki/współrzędnej tabeli
            }                                               //np. dla 0.0 przypisuje 1, dla 0.1 -> 2, dla 0.3 -> 4 itd
        }
        for (int[] oneDimArray : array2DFor)  //tu pobiera wartości dla jednego z wierszy wcześniej zainicjalizowanej tabeli array2DFor
        {                                                   //tu bierze wiersz z dwuwymiarowej tablicy array2DFor i otrzymujemy 1wymiarową tablice
            for (int singleElem : oneDimArray)              //tu pobiera elementy z każdej komórki tablicy jednowymiarowej
            {
                System.out.print(singleElem + " ");         //..i wyświetla pobrany element ze spacją
            }
            System.out.println();                           //znak nowej linii
        }

        System.out.println("---------------------------------------------------------------");

        /*
        ZADANIE 1
         */

        int[] array1 = new int[11];

        //Losowanie dowolnej liczby int w przedziale 1 do 100
        Random random = new Random();                   //utworzenie obiektu random klasy Random
        int randomInt = random.nextInt(100) + 1; //metoda nextInt klasy random generuje wartość losową 0-100,
        //dlatego dodajemy 1, żeby nie dostać zera
        for (int i = 0; i < array1.length ; i++)
        {
            array1[i] = random.nextInt(100) + 1; //przypisanie dla każdego elementu tablicy losowo wylosowanej wartości
        }                                              //

        for(int i = 0 ; i < array1.length ; i++)
        {
            if(i % 2 != 0) System.out.println("Index no. " + i + "\t\t\t\t\t\t\t\tvalue: " + array1[i]);
        }    //sprawdzany jest warunek if czy reszta z dzielenia modulo %2 nie jest zerem -> żeby znaleźć indeksy nieparzyste


        System.out.println("---------------------------------------------------------------");

        /*
        ZADANIE 2 - Stwórz tablicę dwuwymiarową, która będzie przechowywać same znaki * (gwiazdki).
                    Wypisz tylko parzyste rzędy, a nieparzyste wyświetl ajko puste linie.
         */

        char[][] array2DTask = new char[10][10];

        for (int i = 0; i < array2DTask.length; i++)        //Pierwsza petla "lata po wierszach"
        {
            for (int j = 0; j < array2DTask.length; j++)    //Druga petla "lata" po kolumnach
            {
                array2DTask[i][j] = '*';                    //przypisanie gwiazdki do każdego elementu tablicy
            }
        }

        for(int i = 0 ; i < array2DTask.length ; i++)
        {
            for (int j = 0 ; j < array2DTask.length ; j++)
            {                                                       //jeśli reszta dzielenia przez 2 (modulo %2) =0
                if(i % 2 == 0) System.out.print(array2DTask[i][j]); //..tzn jesli nr wiersza jest parzysty to wyświetl elementy tablicy (czyli gwiazdki)
                else System.out.print(" ");     //w przeciwnym razie-tj. jeśli reszta z dzielenie różna od zera(wiersz nieparzysty)...
            }                                   //to wyświetl pusty wiersz
            System.out.println();
        }

        System.out.println("---------------------------------------------------------------");

         /*
        ZADANIE 3 - Napisz program, który będzie pytał użytkownika o liczbe od 1 do 10. Gdy użytkownik poda niewłaściwą
                    - pytaj go jeszcze raz. Gdy użytkownik zdadnie, zakończ program.
                    Liczbę prawidłową ustal w programie dowolnie przed rozpoczęciem pytania o nią użytkownika.
         */

/*        int winningNumber = new Random().nextInt(10) + 1; //inicjalizacja liczby wygranej-wylosowanie liczby z zakresu 0-10
                                                    //..za pomocą metody nextInt i dodanie 1 żeby nie wygrana liczba nie byłą zerem
        Scanner scanner = new Scanner(System.in);   //powołanie/deklaracja obiektu do wczytywania danych z klawiatury

        while(true)
        {
            System.out.print("Podaj liczbe od 1 do 10: ");
            int userNumber = scanner.nextInt();

            if (userNumber < 1 || userNumber > 10)
            {
                System.out.println("Podales liczbe z innego przedzialu!!");
            }

            if (userNumber == winningNumber)
            {
                System.out.println("WYGRALES!");
                break;
            }
            else System.out.println("GRAJ DALEJ :-(");
        }
*/
        /*
        ZADANIE 4 - Napisz grę w lotto. Najpierw zapytaj użytkownika o 6 cyfr (każdą osobno).
                    Wylosuj 6 liczb z puli 1-49. Powiadom użytkownika ile liczb trafił.
         */

        int [] userArray = new int[6];
        int [] winningArray = new int[6];

        Scanner scanner1 = new Scanner(System.in);   //powołanie/deklaracja obiektu do wczytywania danych z klawiatury


        for (int userNumber = 0; userNumber < 6; userNumber++)
        {
            int numberOK = 0;
            while(numberOK == 0)
            {
                System.out.print("Podaj " + (userNumber +1) + " liczbę od 1 do 49: ");
                userArray[userNumber] = scanner1.nextInt();
                if((userArray[userNumber] < 1) || (userArray[userNumber] > 49))
                {
                    System.out.println("Podaleś złą liczbę.");
                }
                else
                {
                    numberOK = 1;
                }
            }

        }

        System.out.println("Wylosowane liczby: ");
        for (int  winningNumber = 0; winningNumber < winningArray.length; winningNumber++)
        {
            winningArray[winningNumber] = random.nextInt(48) + 1; //przypisanie dla każdego elementu tablicy losowo wylosowanej wartości
            System.out.print(winningArray[winningNumber] + ",");
        }
        System.out.println();

        int counter = 0;
        for (int i=0; i < userArray.length; i++)
        {
            for (int j=0; j < winningArray.length; j++)
            {
                if (userArray[i] == winningArray[j])
                {
                    counter = counter + 1;
                }
            }
        }

        System.out.println("Ilość trafionych liczb: " + counter);

    }

}