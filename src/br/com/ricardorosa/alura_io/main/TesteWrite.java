package br.com.ricardorosa.alura_io.main;

import java.io.*;

public class TesteWrite {

    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("lorem2.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
                bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod\n\nteste");

        bw.close();

    }
}
