import java.io.File;

public class Create_file {
    void createFile()
    {
        File file =new File("hello_Welcome.txt");
        System.out.println("file name is : "+file.getName());


    }
    public static void main(String [] args)
    {
        Create_file createFile=new Create_file();
        createFile.createFile();

    }
}
