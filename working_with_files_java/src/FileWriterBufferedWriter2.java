/*
   FileWriter -> stream de escrita de caracteres em/de arquivos
   * Cria/recria o arquivo: new FileWriter(path)
   * Acrescenta ao arquivo existente: new FileWriter(path, true)
   *
   BufferedWriter -> mais rápido
   */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileWriterBufferedWriter2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //String[] lines = new String[] {"Good morning", "Good afternoon", "good night"};

        String path = "/Users/rodrigoweber/Documents/teste_de_saida_names.txt";

        List<String> names = new ArrayList<>();

        System.out.println("Quantos nomes deseja adicionar: ");
        int numberOfNames = sc.nextInt();
        sc.nextLine();

        for (int i=0; i < numberOfNames; i++) {
            System.out.println("Digite o nome: ");
            String name = sc.nextLine();
            names.add(name);
        }
        System.out.println(names);
        sc.close();


        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String name: names) {
                bw.write(name);
                bw.newLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
