package lessons.day_13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DataFactory {
    public static void readFile(String absoluteFilePath){
        try{
            FileInputStream fileInputStream = new FileInputStream(absoluteFilePath);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {

    }
}
