/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        
        
   
        String fileName= "C:\\Users\\Usuario\\Desktop\\LAB9\\src\\main\\java\\com\\mycompany\\lab9\\PromedioCSV.csv";
        File file= new File(fileName);

       
        List<List<String>> lines = new ArrayList<>(); //Se crea una lista de 2 dimensiones
        Scanner inputStream;

        try{
            inputStream = new Scanner(file); //Se usa el método inputstream para leer el archivo

            while(inputStream.hasNext()){
                String line= inputStream.next();
                String[] values = line.split(","); // Se delimitan los datos del archivo
                // this adds the currently parsed line to the 2-dimensional string array
                lines.add(Arrays.asList(values)); //Se agregan las lineas del archivo al arreglo de 2 dimensiones
            }

            inputStream.close(); //Se cierra el método para leer el archivo
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        
        
        double notas []=new double[19]; //Definicion de arreglo 
        double estudiante []=new double[19];
        double suma = 0, suma2 = 0, suma3 = 0, suma4 = 0; double promedio1 = 0, promedio2 = 0, promedio3 = 0, promedio4 = 0; //inicializacion de variables 
        double nota1=0, nota2=0, nota3=0, nota4=0;
        //double estudiante1= 0, estudiante2= 0, estudiante3= 0, estudiante4= 0,estudiante5= 0, estudiante6= 0, estudiante7= 0, estudiante8= 0, estudiante9= 0, estudiante10= 0, estudiante11= 0, estudiante12= 0, estudiante13= 0, estudiante14= 0, estudiante15= 0, estudiante16= 0, estudiante18= 0, estudiante19= 0;
         //double promedioestudiante1= 0, promedioestudiante2= 0, promedioestudiante3= 0, promedioestudiante4= 0,promedioestudiante5= 0, promedioestudiante6= 0, promedioestudiante7= 0, promedioestudiante8= 0, promedioestudiante9= 0, promedioestudiante10= 0, promedioestudiante11= 0, promedioestudiante12= 0, promedioestudiante13= 0, promedioestudiante14= 0, promedioestudiante15= 0, promedioestudiante16= 0, promedioestudiante18= 0, promedioestudiante19= 0; 
        for (int i = 0; i < lines.size(); i++) { //for para iterar dentro del arreglo de 2 dimensiones
             for (int j = 2 ; j <3; j++) { //Se delimitan las columnas en cada caso
             notas[i] = Double.parseDouble(lines.get(i).get(j));   //se convierten los elementos del archivo csv a Double y se guardan en el arreglo
             suma += notas[i];    //Sumatoria de las notas  
             promedio1=suma/(notas.length); //calculo del promedio
             nota1= Double.parseDouble(lines.get(i).get(j));
             nota2= Double.parseDouble(lines.get(i).get(j+1));
             nota3= Double.parseDouble(lines.get(i).get(j+2));
             nota4= Double.parseDouble(lines.get(i).get(j+3));
             estudiante[i] = (nota1+nota2+nota3+nota4)/4;
             
             //System.out.println("Promedio estudinte: "+estudiante[i]);
            //}
               
             
        
          //for para iterar dentro del arreglo de 2 dimensiones
             //for (int j = 3 ; j <4; j++) { //Se delimitan las columnas en cada caso
             notas[i] = Double.parseDouble(lines.get(i).get(j+1));   //se convierten los elementos del archivo csv a Double y se guardan en el arreglo
             suma2 += notas[i];    //Sumatoria de las notas  
             promedio2=suma2/(notas.length); //calculo del promedio
            //}
        
          //for para iterar dentro del arreglo de 2 dimensiones
             //for (int j = 4 ; j <5; j++) { //Se delimitan las columnas en cada caso
             notas[i] = Double.parseDouble(lines.get(i).get(j+2));   //se convierten los elementos del archivo csv a Double y se guardan en el arreglo
             suma3 += notas[i];    //Sumatoria de las notas  
             promedio3=suma3/(notas.length); //calculo del promedio
            //}
        
          //for para iterar dentro del arreglo de 2 dimensiones
             //for (int j = 5 ; j <6; j++) { //Se delimitan las columnas en cada caso
             notas[i] = Double.parseDouble(lines.get(i).get(j+3));   //se convierten los elementos del archivo csv a Double y se guardan en el arreglo
             suma4 += notas[i];    //Sumatoria de las notas  
             promedio4=suma4/(notas.length); //calculo del promedio
            //}
      
         
        
         
         
         }
        }
        for (int i = 0; i < lines.size(); i++) {  
        System.out.println("Promedio estudinte: "+estudiante[i]);
        }
        
        System.out.println("Promedio nota 1: "+promedio1); 
        System.out.println("Promedio nota 2: "+promedio2); 
        System.out.println("Promedio nota 3: "+promedio3); 
        System.out.println("Promedio nota 4: "+promedio4); 
       
        
         
    
    }

}