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

public class FileWriterBufferedWriter {

    public static void main(String[] args) {


        String[] lines = new String[] {"Good morning", "Good afternoon", "good night"};

        String path = "/Users/rodrigoweber/Documents/teste_de_saida.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line: lines) {
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
