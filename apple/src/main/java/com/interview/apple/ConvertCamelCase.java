package com.interview.apple;

public class ConvertCamelCase {

    public static void main(String[] args) {
        String variable = "unifyTechnologiesLimited";
        System.out.println(convertCamelCase(variable));
    }

    private static String convertCamelCase(String variable) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < variable.length(); i++) {
            if(i != 0 && Character.isUpperCase(variable.charAt(i))) {
                sb.append("_"+Character.toLowerCase(variable.charAt(i)));
            } else {
                sb.append(variable.charAt(i));
            }
        }
        return sb.toString();
    }
}
