import states.LexerState;
import tokens.TokenEmitter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.lang.String;
import java.lang.System;
import java.util.Scanner;

public class LexerMain {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner;
        if (args.length >= 1) {
            scanner = new Scanner(new File(args[0]));
        } else {
            scanner = new Scanner(System.in);
        }
        scanner.useDelimiter("");

        PrintStream printStream;
        if (args.length >= 2) {
            printStream = new PrintStream(new File(args[1]));
        } else {
            printStream = System.out;
        }

        TokenEmitter emitter = new TokenEmitter();

        start(scanner, printStream, emitter);
    }

    static void start(Scanner scanner, PrintStream printStream, TokenEmitter emitter) {
        LexerState.setGlobalEmitter(emitter);

        LexerState state = LexerState.concreteMode();

        while (scanner.hasNext()) {
            state = state.consume(scanner.next().charAt(0));
        }

        printStream.println(emitter);
    }
}
