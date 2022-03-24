package com.company;

public class Encoder {

    public static String Encode(String message, int key) {

        String string = "";

        if( key < 0){
            return ("Введено неправильное число!");
        }

        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            if (ch >= 'а' && ch <= 'я') {
                ch += key % 33;
                if (ch < 'а') {
                    ch += 33;
                }
                if (ch > 'я') {
                    ch -= 33;
                }
            } else if (ch >= 'А' && ch <= 'Я') {
                ch += key % 33;
                if (ch < 'А') {
                    ch += 33;
                }
                if (ch > 'Я') {
                    ch -= 33;
                }
            }
            string += ch;
        }
        return string;
    }
}




