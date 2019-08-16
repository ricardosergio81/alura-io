package br.com.ricardorosa.alura_oi.main;

import java.io.*;

public class TesteRead {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("lorem.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader bis = new BufferedReader(isr);

        String line = bis.readLine();

        while (line != null) {
            System.out.println(line);
            line = bis.readLine();
        }
        bis.close();

    }
}
