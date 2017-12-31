package com.example.saranyar.androidconvertor;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberConverterTestCase {
    @Test
    public void calcDecimal() throws Exception {
        String binary = "b:10100001";
        String hex = "h:A1";
        String decimal = "d:161";

        String expected = "161";

        String outputBinary, outputHex, outputDec;

        outputBinary = NumberConverter.calcDecimal(binary);
        outputHex = NumberConverter.calcDecimal(hex);
        outputDec = NumberConverter.calcDecimal(decimal);


        assertEquals(expected, outputBinary);
        assertEquals(expected, outputHex);
        assertEquals(expected, outputDec);

    }

    @Test
    public void calcBinary() throws Exception {
        String binary = "b:10100001";
        String hex = "h:A1";
        String decimal = "d:161";

        String expected = "10100001";

        String outputBinary, outputHex, outputDec;

        outputBinary = NumberConverter.calcBinary(binary);
        outputHex = NumberConverter.calcBinary(hex);
        outputDec = NumberConverter.calcBinary(decimal);


        assertEquals(expected, outputBinary);
        assertEquals(expected, outputHex);
        assertEquals(expected, outputDec);

    }

    @Test
    public void calcHex() throws Exception {
        String binary = "b:10100001";
        String decimal = "d:161";

        String expected = "a1";

        String outputBinary, outputDec;

        outputBinary = NumberConverter.calcHex(binary);
        outputDec = NumberConverter.calcHex(decimal);


        assertEquals(expected, outputBinary);
        assertEquals(expected, outputDec);

    }

}