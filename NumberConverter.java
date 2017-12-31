package com.example.saranyar.androidconvertor;

class NumberConverter {


    static String calcDecimal(String value) {
        String valueToCalc = value.substring(2, value.length());
        String error = "ERROR";
        String decPrefix = "d";
        String binPrefix = "b";
        String hexPrefix = "h";
        try {
            if (value.substring(0, 1).equals(decPrefix)) {
                return valueToCalc;

            } else if (value.substring(0, 1).equals(hexPrefix)) {
                valueToCalc = ("" + Long.parseLong(valueToCalc, 16));

            } else if (value.substring(0, 1).equals(binPrefix)) {
                int decimalValue = Integer.parseInt(valueToCalc, 2);
                valueToCalc = Integer.toString(decimalValue);

            } else {
                valueToCalc = error;
            }
        }catch (Exception e){
            valueToCalc = error;
        }

        return valueToCalc;
    }

    static String calcBinary(String value){
        String valueToCalc = value.substring(2, value.length());
        String error = "ERROR";

        String decPrefix = "d";
        String binPrefix = "b";
        String hexPrefix = "h";

        try {

            if (value.substring(0, 1).equals(decPrefix)) {
                int binaryValue = Integer.parseInt(valueToCalc);
                valueToCalc = Integer.toBinaryString(binaryValue);

            } else if (value.substring(0, 1).equals(hexPrefix)) {
                int hexVlue = Integer.parseInt(valueToCalc, 16);
                valueToCalc = Integer.toBinaryString(hexVlue);

            } else if (value.substring(0, 1).equals(binPrefix)) {
                return valueToCalc;

            } else {
                valueToCalc = error;
            }
        }catch(Exception e){
            valueToCalc = error;
        }

        return valueToCalc;
    }

    static String calcHex(String value){
        String valueToCalc = value.substring(2, value.length());
        String error = "ERROR";

        String decPrefix = "d";
        String binPrefix = "b";
        String hexPrefix = "h";

        try {

            if (value.substring(0, 1).equals(decPrefix)) {
                int first = Integer.parseInt(valueToCalc);
                valueToCalc = Integer.toHexString(first);

            } else if (value.substring(0, 1).equals(hexPrefix)) {
                return valueToCalc;

            } else if (value.substring(0, 1).equals(binPrefix)) {
                int second = Integer.parseInt(valueToCalc, 2);
                valueToCalc = Integer.toString(second, 16);
            } else {
                valueToCalc = error;
            }
        }catch (Exception e){
            valueToCalc = error;
        }

        return valueToCalc;
    }
}
