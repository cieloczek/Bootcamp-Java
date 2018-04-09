package Exercises.BlockJVM;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileHelper {

        public static List<String> readAllLines(String path) {
                List<String> lines = new ArrayList<>();

                        BufferedReader reader = null;
                try {
                     reader = new BufferedReader(new FileReader(path));
                     String line = null;
                     while ((line = reader.readLine()) != null) {
                           lines.add(line);
                         }
                  } catch (IOException e) {
                    e.printStackTrace();
                  } finally {
                     if (reader != null) {
                            try {
                                 reader.close();
                               } catch (IOException e) {
                                 e.printStackTrace();
                               }
                          }
                    }
               return lines;
              }



}
