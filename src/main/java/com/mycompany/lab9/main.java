/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab9;
import java.io.File;
import java.io.*;


public class main {
   
    public static final String delimiter = ",";
   
   public static void read(String csvFile) {
      try {
         File file = new File(csvFile);
         FileReader fr = new FileReader(file);
         BufferedReader br = new BufferedReader(fr);
         String line = "";
         String[] tempArr;
         while((line = br.readLine()) != null) {
            tempArr = line.split(delimiter);
            for(String tempStr : tempArr) {
               System.out.print(tempStr + " - ");
            }
            System.out.println();
         }
         br.close();
         } catch(IOException ioe) {
            ioe.printStackTrace();
         }
   }
   public static void main(String[] args) {
      // csv file to read
      String csvFile = "C:\\Users\\Usuario\\Desktop\\LAB9\\src\\main\\java\\com\\mycompany\\lab9\\PromedioCSV.csv";
      main.read(csvFile);
   }
}