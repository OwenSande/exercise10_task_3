package com.company;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	    int bajt;

        try(
                FileInputStream fis = new FileInputStream("test123.txt");
                FileOutputStream fiss = new FileOutputStream("test123copy.txt")
        ){

            do{
                bajt = fis.read();
                if ((char) bajt == ' ') bajt = '-';
                if (bajt != -1) fiss.write(bajt);

            } while (bajt != -1);

        }catch (IOException e){

            System.out.println("Error ");
        }


    }
}

