package com.company;

public class Decoder {

    public static String Decode(String message, int negativeKey) {

        String string = "";

        if( negativeKey > 0){
            return ("Введено неправильное число!");
        }

        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            if (ch >= 'а' && ch <= 'я') {
                ch += negativeKey % 33;
                if (ch < 'а') {
                    ch += 33;
                }
                if (ch > 'я') {
                    ch -= 33;
                }
            } else if (ch >= 'А' && ch <= 'Я') {
                ch += negativeKey % 33;
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
