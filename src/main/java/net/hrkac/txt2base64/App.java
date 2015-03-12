package net.hrkac.txt2base64;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import sun.misc.BASE64Encoder;

public class App {

    private static final String COMMAND_SYNTAX = "java -jar txt2base64.jar <input text file>";
    private static final String EXTENSION = ".base64";

    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Input txt file is missing! Aborting...\nCommand syntax: \n" + COMMAND_SYNTAX);
            System.exit(0);
        }
        OutputStream output = null;
        try {
            InputStream input = new FileInputStream(args[0]);
            BASE64Encoder encoder = new BASE64Encoder();
            output = new FileOutputStream(args[0] + EXTENSION);
            encoder.encodeBuffer(input, output);
            output.flush();
            output.close();
            System.out.println("Base64 file successfully created as " + args[0] + EXTENSION);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
