/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consolidacao_4;

import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class Tudo {

    public static void main(String[] args) {
        String alfabeto = "abcdefghijklmnopqrstuvwxyz";
        String test = "abacate";
        String carac = "a";

        if (test.length() <= 100 && alfabeto.contains(carac)) {
            ArrayList<String> listaSubString = subString_1(test, carac);
            System.out.println(listaSubString);
        } else {
            System.out.println("Entrada irregular!");
        }
    }

    public static ArrayList<String> subString_1(String termo, String caractere) {
        ArrayList<String> subStrings = new ArrayList<String>();
        char[] termoQuebrado = termo.toCharArray();
        for (int i = 0; i < termoQuebrado.length; i++) {
            if (termoQuebrado[i] == caractere.charAt(0)) {
                String sub = "";
                sub = sub + caractere;
                if (i != termoQuebrado.length) {
                    for (int j = i + 1; j < termoQuebrado.length; j++) {
                        sub = sub + termoQuebrado[j];
                        if (termoQuebrado[j] == caractere.charAt(0)) {
                            subStrings.add(sub);
                        }
                    }
                }
            }
        }
        return (subStrings);
    }
}
