package com.jetbrains;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);

        ArrayList<String[]> connectionList = readFiles("londonconnections.csv", "londonconnections.csv");
        //ArrayList<String[]> linesList = readFiles("londonlines.csv", "C:\\Users\\Joseph Nino\\londonlines.csv");
        //<String[]> stationList = readFiles("londonstations.csv", "C:\\Users\\Joseph Nino\\londonstations.csv");

       for(int i = 1;i<connectionList.size();i++){
           for(int j = 0;j<connectionList.get(i).length;j++){
               System.out.print(connectionList.get(i)[j]+",");
           }
           System.out.println("");
       }


    }

    public static ArrayList<String[]> readFiles(String file, String path) throws IOException {

        String row = "";
        ArrayList<String[]> stuff = new ArrayList<String[]>();

        File csvFile = new File(path);
        if (csvFile.isFile()) {
            BufferedReader csvReader = new BufferedReader(new FileReader(path));
            while ((row = csvReader.readLine()) != null) {
                String[] data = row.split(",");
                stuff.add(data);

            }
            csvReader.close();
        }

        //System.out.println(data);

        return stuff;
    }
}
