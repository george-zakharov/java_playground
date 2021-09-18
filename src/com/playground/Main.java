package com.playground;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Scanner;

public class Main {
    private static void logText(String logTxt) {
        System.out.println("\n" + logTxt);
    }

    public static void main(String[] args) throws Exception {
        logText("My beautiful program");
        MessageDigest md = MessageDigest.getInstance("MD5");
        String txt = "abracadabra";
        byte[] digest = md.digest(txt.getBytes(StandardCharsets.UTF_8));
        for (byte b : digest) {
            System.out.printf("%02x", b);
        }

        logText("The length of the txt string is: " + txt.length());
        logText("");

        Scanner myObj = new Scanner(System.in);
        logText("Enter username... ");
        String userName = myObj.nextLine();
        logText("Username is: " + userName);
    }
}