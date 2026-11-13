package com.string.concat3;

public class SetString {

    public static void main(String[] args) {

        String name = "kamdev";

        StringBuilder sb = new StringBuilder(name);

        System.out.println("The original String is = " + name);

        sb.setCharAt(2, 'g');

        System.out.println("After setting the new value = " + sb);
    }
}