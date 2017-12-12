package com.sg.service.util.csv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReaderService {

    public static List<String[]> readCsv() {
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        
        List<String[]> csvData = new ArrayList<>();
       // List<String[]>
        try {
            br = new BufferedReader(new FileReader("/Users/sdutta1/Documents/workstation/InventoryDiscountMS/src/main/resources/inventory.csv"));
            while ((line = br.readLine()) != null) {
                if(line.equals("\n")) {

                }
                else {
                    String[] item = line.split(cvsSplitBy);
                    csvData.add(item);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return csvData;
    }


    public static void main(String[] args) {
        readCsv();
    }
}
