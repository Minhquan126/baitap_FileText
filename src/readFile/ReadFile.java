package readFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static void main(String[] args) {
        ReadFile readFile = new ReadFile();
        try {
            File file = new File("C:\\Users\\ADMIN\\Desktop\\java\\Bai tap\\baitap_FileText\\src\\readFile\\countries.csv");
            BufferedReader br = new BufferedReader(new FileReader(file));
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            String line = "";
            while ((line = br.readLine()) != null){
readFile.println(readFile.parseCsv(line));
            }
        } catch (Exception e){
            System.out.println("File khong ton tai");
        }
    }
    public List<String> parseCsv(String csv){
        List<String> list = new ArrayList<>();
        if (csv!= null){
            String[] splitList = csv.split(",");
            for (int i = 0; i < splitList.length; i++) {
list.add(splitList[i]);
            }
        }

        return list;
    }
    public void println(List<String> country){
        System.out.println(country);
    }
}
