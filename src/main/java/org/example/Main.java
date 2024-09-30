package org.example;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Runtime runtime= Runtime.getRuntime();

        Random rm = new Random();
        int totalC= rm.nextInt(1, 7);

        String [] casos = new String[totalC+1];



        String [] command = {"java","-cp", "src/main/resources/BasicProject-1.0-SNAPSHOT.jar", "org.example.BirthdayArgs", "2", "2", "45"};

        Process process =runtime.exec(command);

        int exitStatus=process.waitFor();
        if (exitStatus==0){
            System.out.println(exitStatus);
        }else{
            System.out.println(exitStatus);
        }

        Scanner scannerIS= new Scanner(process.getInputStream());



        while ((scannerIS.hasNextLine())){
            System.out.println(scannerIS.nextLine());
        }

        scannerIS.close();






    }
}