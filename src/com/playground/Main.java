package com.playground;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("My beautiful program");
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] digest = md.digest("abracadabra".getBytes(StandardCharsets.UTF_8));
        for (byte b : digest) {
            System.out.printf("%02x", b);
        }
    }
}