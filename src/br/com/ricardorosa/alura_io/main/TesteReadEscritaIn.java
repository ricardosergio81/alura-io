package br.com.ricardorosa.alura_io.main;


import java.io.*;

public class TesteReadEscritaIn {

    public static void main(String[] args) throws IOException {

        InputStream fis = System.in;
        Reader isr = new InputStreamReader(fis);
        BufferedReader bis = new BufferedReader(isr);

        OutputStream fos = new FileOutputStream("lorem2.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        String line = bis.readLine();

        while (line != null && !line.isEmpty()) {
            bw.write(line);
            bw.newLine();
            line = bis.readLine();
        }
        bis.close();
        bw.close();

    }
}
