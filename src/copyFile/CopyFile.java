package copyFile;

import javax.annotation.processing.FilerException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CopyFile {
    public void copyfile(String source_file, String target_file) {
        try {
            File sourceFile = new File(source_file);
            File targetFile = new File(target_file);
            if (!sourceFile.exists()) {
                throw new FileNotFoundException();
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile));
            BufferedReader br = new BufferedReader(new FileReader(sourceFile));
            String line = null;
            int count = 0;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                count += 1;
            }
            bw.close();
            br.close();
            System.out.println("So phan tu : " + count);
        } catch (IOException e) {
            System.err.println("file khong ton tai");
        } catch (Exception e){

        }
    }

    public static void main(String[] args) {
        CopyFile copyFile = new CopyFile();
        copyFile.copyfile("C:\\Users\\ADMIN\\Desktop\\java\\Bai tap\\baitap_FileText\\src\\copyFile\\sourceFile.txt",
                "C:\\Users\\ADMIN\\Desktop\\java\\Bai tap\\baitap_FileText\\src\\copyFile\\targetFile.txt");
    }
}
