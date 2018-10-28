package files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import java.net.*;      // import klasy do pracy z internetowymi zasobami
import java.io.*;  // klasa do czytanie buforowego


public class files
{

        public static void main(String[] args) throws IOException
        {
//
//        //ODCZYT
//        File file = new File("/home/trener/Desktop/moj.txt");
//        Scanner sc = new Scanner(file);
//        String line = sc.nextLine();
//        String line2 = sc.nextLine();
//        System.out.println(line + "\n" + line2);

            //ZAPIS
//        PrintWriter write = new PrintWriter("./moj_nowy_plik.txt");
//        write.print("Pierwsza linia");
//        write.print("fdsf linia");
//        write.print("sdfs linia");
//        write.print("fsf linia");
//        write.print("fsdf linia");
//        write.print("dsf linia");
//        write.print("Pierwsdfssdsza linia");
//        write.close();

        /*
        ----------------------------------------------------------------------
         */

            //FILES - NOWY PLIK
//        Path a = Files.createFile(Paths.get("./plik_files1.txt"));
//        System.out.println("Plik zapisany w " + a);

            //FILES - NOWY FOLDER
//        Files.createDirectory(Paths.get("./myFolder"));

            //FILES - WCZYTYWANIE PLIKU
//        List<String> lines = Files.readAllLines(Paths.get("./moj_nowy_plik.txt"));
            //wczytanie pierwszego wiersza z listy
//        lines.get(0);
//        for (String lineInFile:
//                lines) {
//            System.out.println(lineInFile);
//        }

            //KOPIOWANIE
//        Files.copy(Paths.get("./moj_nowy_plik.txt"), Paths.get("/home/trener/Desktop/kopia.txt"), StandardCopyOption.REPLACE_EXISTING);

            //ZADANIE 1
//        String[] names = new String[5];
//
//        names[0] = "Jan";
//        names[1] = "Anna";
//        names[2] = "Marek";
//        names[3] = "Halina";
//        names[4] = "Ferdynand";
//
//        PrintWriter pw = new PrintWriter("./ZAD1.txt");
//
//        for (String name : names) {
//            pw.print(name + "\n");
//        }
//
//        pw.close();
//
//        //ZADANIE 2
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj imie i nazwisko");
//        String name = scanner.nextLine();
//
//        PrintWriter pw2 = new PrintWriter("./ZAD2.txt");
//        pw2.print(name);
//        pw2.close();
//
//        //ZADANIE 3
//
//        //losowanie
//        Random random = new Random();
//
//        //Zapis losowan
//        PrintWriter pwLos1 = new PrintWriter("./ZAD3_1.txt");
//        PrintWriter pwLos2 = new PrintWriter("./ZAD3_2.txt");
//
//        for (int i = 0; i < 100; i++) {
//            pwLos1.append((random.nextInt(100) + 1) + "\n");
//            pwLos2.append((random.nextInt(100) + 1) + "\n");
//        }
//
//        pwLos1.close();
//        pwLos2.close();
//
//        List<String> listLos1 = Files.readAllLines(Paths.get("./ZAD3_1.txt"));
//        List<String> listLos2 = Files.readAllLines(Paths.get("./ZAD3_2.txt"));
//
//        int hits = 0;
//
//        for(String elementLos1 : listLos1){
//            for(String elementLos2 : listLos2){
//                if(Integer.parseInt(elementLos1) == Integer.parseInt(elementLos2)){
//                    hits++;
//                }
//            }
//        }
//
//        System.out.println("Tych samych liczb: " + hits);

            //ZADANIE 4 - Napisz program, który pobierze od użytkownika tekst i zapisze do do pliku od tyłu
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Podaj jakis tekst");
//        String txt = sc.nextLine();
//
//        PrintWriter reverse = new PrintWriter("./ZAD4.txt");
//        reverse.print(new StringBuilder(txt).reverse().toString());

//        String reverseText = "";
//        char[] letters = txt.toCharArray();
//        for(int i = letters.length - 1 ; i >= 0 ; i--){
//            reverseText+=letters[i];
//        }

//        reverse.print(reverseText);
//        reverse.close();



/*      Zad5. Napisz program, który przeniesie plik z zadania4 na pulpit, a następnie wykona jego kopię.
                Wczytaj tekst z pliku z zadania 4 i zapisz tekst ponownie odwrócony do kopii pliku z 1szej części zadania.
 */

//        Files.move(Paths.get("/home/olencjag/MyProjects/warsztaty_java/ZAD4.txt"),
//                Paths.get("/home/olencjag/Desktop/ZAD4.txt"),
//                StandardCopyOption.REPLACE_EXISTING);
//
//        Files.copy(Paths.get("/home/olencjag/Desktop/ZAD4.txt"),
//                Paths.get("/home/olencjag/Desktop/ZAD4_kopia.txt"),
//                StandardCopyOption.REPLACE_EXISTING);
//
//        List<String> lines = Files.readAllLines(Paths.get("/home/olencjag/Desktop/ZAD4.txt"));  //wczytanie całego pliku
//
//        PrintWriter reverse1 = new PrintWriter("/home/olencjag/Desktop/ZAD4_kopia.txt");   //otworzenie pliku do zapisu
//        lines.get(0);  //wczytanie pierwszego wiersza z listy
//        for (String lineInFile: lines)
//        {
//            reverse1.print(new StringBuilder(lineInFile).reverse().toString());     //odwraca string
//        }
//
//        reverse1.close();


            // zadanie domowe
            URL oracle = new URL("https://www.w3.org/TR/PNG/iso_8859-1.txt");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(oracle.openStream()));

            PrintWriter numbers = new PrintWriter("./numbers.txt"); //utworzenie obiektu wskazujcego na plik z liczbami
            PrintWriter letters = new PrintWriter("./letters.txt");

            String inputLine;
            int counter = 0;

            while ((inputLine = in.readLine()) != null) //sczytuje każdą linię z piliku
            {
                if(counter < 8) {
                    counter++;
                    continue;
                }

                if(inputLine.length() > 0)
                {
                    char text[] = inputLine.toCharArray();
                    for(int index = 0; index < inputLine.length(); index++)
                    {
                        if(index < 32)
                            numbers.print(text[index]);
                        else
                            letters.print(text[index]);
                    }
                    numbers.println();
                    letters.println();
                }

            }
            in.close();
            numbers.close();
            letters.close();

        }
}

