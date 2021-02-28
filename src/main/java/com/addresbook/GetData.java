package com.addresbook;

import java.util.Scanner;

public class GetData {
    private final static Scanner sc = new Scanner(System.in);
    public static int getIntValue()
    {
        return sc.nextInt();
    }
    public static String getStringValue()
    {
        return sc.next();
    }
}
