package com.company;

import java.util.regex.Matcher;
import  java.util.regex.Pattern;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            System.out.println("Введите ip-адрес:");
            Scanner sc1 = new Scanner(System.in);
            String ip = sc1.nextLine();
            String input = ip;
            boolean result = input.matches("^((25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)$");
            if (result) {
                System.out.println("Ok");
            }
            else {
                System.out.println("Error");
            }
        }
    }