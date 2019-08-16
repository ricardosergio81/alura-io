package br.com.ricardorosa.alura_io.main;


import java.io.*;

public class TesteReadReduzido {

    public static void main(String[] args) throws IOException {

        InputStream fis = new FileInputStream("lorem.txt");
        Reader isr = new InputStreamReader(fis);
        BufferedReader bis = new BufferedReader(isr);

        String line = bis.readLine();

        while (line != null) {
            System.out.println(line);
            line = bis.readLine();
        }
        bis.close();

    }
}
