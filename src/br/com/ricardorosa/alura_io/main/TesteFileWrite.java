package br.com.ricardorosa.alura_io.main;

import java.io.*;

public class TesteFileWrite {

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("lorem2.txt");
        fw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        fw.write(System.lineSeparator());
        fw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod\n\nteste");
        fw.close();


        PrintStream ps = new PrintStream("lorem3.txt");
        ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        ps.println();
        ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod\n\nteste");
        ps.close();

        PrintWriter ps2 = new PrintWriter("lorem4.txt");
        ps2.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        ps2.println();
        ps2.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod\n\nteste");
        ps2.close();
    }
}

