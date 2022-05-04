import java.io.FileNotFoundException;
import java.io.IOException;


public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Data d = new Data();
        d.readFile("hi");
        d.writeFile(1,1,26,11, "E:\\SynologyDrive\\Ma Yuanxin\\MSCNC\\MSCNC.txt");
    }

}
