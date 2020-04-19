package com.jetbrains;

import java.io.*;
import java.util.*;

public class Main {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        ArrayList<Connection> connectionList = readFile("londonconnections.csv", "Connection");
        ArrayList<Line> lineList = readFile("londonlines.csv", "Line");
        ArrayList<Station> stationList = readFile("londonstations.csv", "Station");

        String startingStation;
        String endingStation;

        startingStation = Inputs.checkInput("starting station");
        endingStation = Inputs.checkInput("ending station");

        System.out.println("Your stations are: " + startingStation + " and " + endingStation);
//
//        for (int i = 0; i < stationList.size(); i++) {
//            System.out.println(stationList.get(i).getLongitude());
//        }


    }

    public static <T> ArrayList<T> readFile(String path, String className) throws IOException {

        String row = "";
        ArrayList<T> fileData = new ArrayList<>();

        File csvFile = new File(path);
        if (csvFile.isFile()) {
            BufferedReader csvReader = new BufferedReader(new FileReader(path));
            int iteration = 0;
            while ((row = csvReader.readLine()) != null) {
                if (iteration == 0) {
                    iteration++;
                    continue;
                } else {
                    String[] rowData = row.split(",");

                    if (className.equals("Connection")) {
                        Connection newConnection = new Connection(rowData);
                        fileData.add((T) newConnection);
                    } else if (className.equals("Line")) {
                        Line newLine = new Line(rowData);
                        fileData.add((T) newLine);
                    } else if (className.equals("Station")) {
                        Station newStation = new Station(rowData);
                        fileData.add((T) newStation);
                    }

                }

            }
            csvReader.close();
        }

        return fileData;
    }


}
