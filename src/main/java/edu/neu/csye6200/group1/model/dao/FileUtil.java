package edu.neu.csye6200.group1.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FileUtil {

    public static final String student = "student";
    public static final String teacher = "teacher";
    public static final String immunization = "immunization";

    public void writeTextFile(String fileName, List<String> data) {
        try {
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter out = new BufferedWriter(fw);
            System.out.println("Writing " + fileName + " in progress...");
            for(String line : data) {
                out.write(line);
                out.newLine();
            }
            out.close();
            System.out.println("Writing " + fileName + " complete!");
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    public List<String> readTextfile(String fileName) {
        List<String> data = new ArrayList<String>();
        String line = null;
        try{
            FileReader fr = new FileReader(fileName);
            BufferedReader in = new BufferedReader(fr);
            System.out.println("Reading " + fileName + " in progress...");
            while((line = in.readLine()) != null) {
                data.add(line);
            }
            in.close();
            System.out.println("Reading " + fileName + " complete!");
        }catch(Exception e){
            e.printStackTrace();
        }
        return data;
    }


    public static double strToDouble(String s){
        try{
            return Double.parseDouble(s);
        }catch(Exception e){
            e.printStackTrace();
        }

        return -1.0;

    }

    public static int strToInt(String s){
        try{
            return Integer.parseInt(s);
        }catch(Exception e){
            e.printStackTrace();
        }
        return -1;
    }

    public static String dateToString(Date date){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        return dateFormat.format(date);
    }

    public static Date strToDate(String date){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        Date ans = null;
        try {
            ans = dateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return ans;
    }

    public static boolean strToBoolean(String s){
        try{
            return Boolean.parseBoolean(s);
        }catch (Exception e){
            e.printStackTrace();
        }

        return false;
    }


}
