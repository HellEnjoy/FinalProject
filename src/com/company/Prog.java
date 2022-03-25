package com.company;

import java.io.*;
import java.util.*;

import static com.company.Encoder.Encode;
import static com.company.Decoder.Decode;
import static com.company.BruteForce.BruteForceMethod;
import static com.company.StaticticMethod.statisticMethod;


public class Prog {

    public static void main(String[] args) {


        read();
        System.out.println(" ");
        write();
        System.out.println("Encoder");
        System.out.println(Encode("Философия – одна из древнейших наук.", 3));
        System.out.println("Decoder");
        System.out.println(Decode("Члосфсчлб – сзрг лк зуиеримылш ргцн.", -3));
        System.out.println("BruteForce");
        StringTokenizer options = new StringTokenizer(BruteForceMethod("Члосфсчлб – сзрг лк зуиеримылш ргцн."), ".");
        while (options.hasMoreTokens()) {
            System.out.println(options.nextToken());
        }
        statisticMethod();
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

