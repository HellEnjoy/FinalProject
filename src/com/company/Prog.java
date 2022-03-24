package com.company;


import java.io.*;
import java.util.*;

import static com.company.Encoder.Encode;
import static com.company.Decoder.Decode;
import static com.company.BruteForce.BruteForceMethod;


public class Prog {
    //   private JFrame window;
    //   private UI ui;

    public static void main(String[] args) {
        read();
        System.out.println("");
        write();

        System.out.println(Encode("Философия – одна из древнейших наук.", 3));
        System.out.println("");
        System.out.println(Decode("Члосфсчлб – сзрг лк зуиеримылш ргцн.", -3));
        System.out.println("");
        StringTokenizer options = new StringTokenizer(BruteForceMethod("Члосфсчлб – сзрг лк зуиеримылш ргцн."), ".");
        while (options.hasMoreTokens()) {
            System.out.println(options.nextToken());

        }

    }


    private static void read() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/com/company/text.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(Encode(line, 3));
                reader.close();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    private static void write() {
        try {
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("src/com/company/dectext.txt")));
            writer.write("Члосфсчлб – сзрг лк зуиеримылш ргцн.Ес ефи еуипирг ргшсзлолфя оазл, фхуиплеылифб н кргрлбп л тсфебьгеыли лш тслфнц ефё фесё еуипб.Зуиерли пюфолхиол туинугфрс тсрлпгол, ъхс лп рцйир Яччинхлерюм лрфхуцпирх, нсхсуюм тскесоло дю флфхипгхлклусегхя кргрлб л сдпирлегхяфб лпл.Л хгнлп лрфхуцпирхсп фхгог члосфсчлб.Фижсзрб пю тсжсесулп с хсп, ъхс срг фсдсм туизфхгеобих, рг нгнли естусфю схеиъгих, нгнли чцрнщлл еютсорбих л нгнси пифхс кгрлпгих фуизл фсеуипиррюш ргцн.");
            writer.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}

//       Prog programm = new Prog();
//       programm.start();


//   private void start() {
//       createWindow();


//  private void createWindow() {
//      ui = new UI(this);

//      window = new JFrame("Application");
//      window.setSize(1024,768);
//      window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//      window.setContentPane(ui);
//      window.setVisible(true);
//  }
//}