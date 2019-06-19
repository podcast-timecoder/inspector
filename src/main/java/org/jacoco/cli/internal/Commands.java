package org.jacoco.cli.internal;

import java.io.PrintWriter;

public class Commands {

    public static int dumpAction(String address, String port, String filename) {
        try {
            final PrintWriter out = new PrintWriter(System.out, true);
            final PrintWriter err = new PrintWriter(System.err, true);
            return new Main("dump", "--port=" + port, "--address=" + address, "--destfile=" + filename).execute(out, err);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
