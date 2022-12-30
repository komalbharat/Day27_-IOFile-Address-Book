import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IOFileJava {

    static File myFile = new File("Database.txt");

    public static void Create(){

        //Code to create a new file
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to Create file");
            throw new RuntimeException(e);
        }
    }

    public static void Write(){
        try {
            FileWriter fileWriter = new FileWriter("Database.txt");

            Scanner sc2 = new Scanner(System.in);

            System.out.println("Please Enter the First Name");
            String str1 = sc2.next();
            fileWriter.write( " First Name=> " + str1);

            System.out.println("Please Enter the Last Name");
            String str2 = sc2.next();
            fileWriter.write( " Last Name=> " + str2);

            System.out.println("Please Enter the Address");
            String str3 = sc2.next();
            fileWriter.write(" Address => " + str3);

            System.out.println("Please Enter the City");
            String str4 = sc2.next();
            fileWriter.write( " Cty=> " + str4);

            System.out.println("Please Enter the State");
            String str5 = sc2.next();
            fileWriter.write( " State=> " + str5);

            System.out.println("Please Enter the ZIP");
            String str6 = sc2.next();
            fileWriter.write( " ZIP=> " + str6);

            System.out.println("Please Enter the Phone Number");
            String str7 = sc2.next();
            fileWriter.write( " Phone Number=> " + str7);

            System.out.println("Please Enter the EmailID");
            String str8 = sc2.next();
            fileWriter.write( " Email ID=> " + str8);

            fileWriter.close();
            //sc1.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void Read(){

        try {
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Create();
        int exit = 99;
        while (exit == 99) {
            System.out.println("Please Enter the following number");
            System.out.println("1: Add");
            System.out.println("2: Read");
            System.out.println("3: Exit");

            Scanner sc3 = new Scanner(System.in);
            int inp = sc3.nextInt();

            if (inp == 1){
                Write();
            } else if (inp == 2) {

                Read();

            } else if (inp == 3) {
                exit = 100;
            }
        }
    }
}