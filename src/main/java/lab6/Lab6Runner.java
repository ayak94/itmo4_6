package lab6;

import com.opencsv.CSVReader;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.apache.commons.lang3.StringUtils;

import java.io.*;

/**
 * Created by olgaoskina
 * 09/11/15
 */
public class Lab6Runner {
    final private static String INPUT_FILE_NAME = "src/main/resources/SocialPharmacies.CSV";
    final private static String OUTPUT_FILE_NAME = "src/main/java/out.CSV";
    final private static char SEPARATOR = ',';
    final private static char QUOTE = '\"';


    public static void main(String[] args){
        try (CSVReader reader = new CSVReader(new FileReader(INPUT_FILE_NAME), SEPARATOR, QUOTE);
             FileOutputStream outputStream = new FileOutputStream(OUTPUT_FILE_NAME)) {
            new RandomCsvWriterToStream(reader, outputStream).write();
            System.out.println("DONE!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
