/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javastringtoken;

import java.io.*;
import java.util.*;

/**
 *
 * @author lilith
 */
public class Tokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        String[] items = s.trim().split("[ !,?.\\_'@]+");

        if (s == "") {
            System.out.println("0");
        } else if (s.length() > 400000) {
            return;
        } else {
            System.out.println(items.length);
        }

        for (String item : items) {
            System.out.println(item);
        }

        scan.close();
    }
}
