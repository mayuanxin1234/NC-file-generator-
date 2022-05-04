import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Data {

    ArrayList<String> lines;
    public void readFile(String fileName) throws FileNotFoundException, IOException {
        try {
            ClassLoader classloader = Thread.currentThread().getContextClassLoader();
            InputStream is = classloader.getResourceAsStream("Main Program.csv");
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            //br.skip(1);
            lines = new ArrayList<>();
            String newLine = "";
            int c = br.read();
            while (c != -1) {
                    if (c == 44) {
                        //System.out.println(newLine);
                        lines.add(newLine);
                        newLine = "";
                        c = br.read();
                    }
                    char c1 = (char) c;
                    newLine += c1;
                    c = br.read();
                }
                br.close();

        } catch (FileNotFoundException e){
            System.out.println(e);
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }

    public void writeFile(int startR, int startC, int endR, int endC, String fileName) throws IOException {

            FileWriter myWriter = new FileWriter(fileName + "\\NC.txt");
            for (int i = startC - 1; i < endC; i++) {
                for (int j = startR - 1; j < endR; j++) {
                        myWriter.write(lines.get(j + i * 75));
                        myWriter.write("\n");
                }
            }
            myWriter.write("M30");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");

    }
}


