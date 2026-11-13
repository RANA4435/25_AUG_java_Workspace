package com.string.concat3;
public class ReverseString {

    public static void main(String[] args) {

        String str = "Kamdev";

        StringBuilder sb = new StringBuilder(str);

        String reverse = sb.reverse().toString();

        System.out.println(reverse);
    }
}