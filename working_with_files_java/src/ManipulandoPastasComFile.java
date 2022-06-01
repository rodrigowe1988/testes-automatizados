import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ManipulandoPastasComFile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ///Users/rodrigoweber/Documents
        System.out.println("Digite o path para receber os nomes dos diretórios e arquivos: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("Folders:");

        List<String> testeFolders = new ArrayList<>();

        for (File folder : folders) {
            System.out.println(folder);
            testeFolders.add(String.valueOf(folder));
        }

        File[] files = path.listFiles(File::isFile);
        System.out.println("Files:");

        for (File file : files) {
            System.out.println(file);
        }

        //criando um diretório dentro do path
        boolean success = new File(strPath + "/subdir").mkdir();
        System.out.println("Directory created succesfully: " + success);

        sc.close();

        //String collect = testeFolders.stream()
                       //.collect(Collectors.joining("; "));

        //System.out.println(testeFolders);
        //System.out.println(collect);
    }
}
