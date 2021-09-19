package com.intellias.jsrc.homeworks.lesson1;

public class Application {
    public static void main(String[] args) {
        System.out.println(argsStringsConcatenation(args));

    }

    private static String argsStringsConcatenation(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        for(String str: args){
            stringBuilder.append(str);
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }
}
