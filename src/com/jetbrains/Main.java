package com.jetbrains;

import java.io.*;
import java.util.*;

public class Main {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        ArrayList<Station> connectionList = readFiles("londonconnections.csv");
        ArrayList<Station> linesList = readFiles("londonlines.csv");
        ArrayList<Station> stationList = readFiles("londonstations.csv");

//        String start;
//        String end;
//
//        start = InputCheck.checkInput("starting station");
//        end = InputCheck.checkInput("ending station");
//
//        System.out.println("Your stations are: " + start + " and " + end);
//
//        for(int i = 0;i<stationList.size();i++){
//            System.out.println(stationList.get(i).getLongitude());
//        }


    }

    public static ArrayList<Station> readFiles(String path) throws IOException {

        String row = "";
        ArrayList<Station> fileData = new ArrayList<Station>();

        File csvFile = new File(path);
        if (csvFile.isFile()) {
            BufferedReader csvReader = new BufferedReader(new FileReader(path));
            while ((row = csvReader.readLine()) != null) {
                String[] rowData = row.split(",");
                Station newStation = new Station(rowData);
                fileData.add(newStation);

            }
            csvReader.close();
        }

        return fileData;
    }
}
