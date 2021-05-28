import java.io.*;
import java.util.Scanner;

public class Copy {
    public void fileReaderExample(String filePath){
        try {
            File file=new File(filePath);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader fileReader=new BufferedReader(new FileReader(filePath));
            FileWriter fw = new FileWriter("C:\\Users\\Admin\\IdeaProjects\\module2\\copy_file_text\\fileCopy");
            int line=0;
            while ((line=fileReader.read())!=-1){
                fw.write(line);
            }
            fw.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }

    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn mã nguồn: ");
        Scanner scanner=new Scanner(System.in);
        String path=scanner.nextLine();
        Copy copy=new Copy();
        copy.fileReaderExample(path);
    }
}
