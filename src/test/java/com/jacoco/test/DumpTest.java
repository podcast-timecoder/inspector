package com.jacoco.test;

import org.jacoco.cli.internal.Main;
import org.junit.Test;

public class DumpTest {

    @Test
    public void name() throws Exception {
        Main.main("dump", "--port=36322", "--address=localhost", "--destfile=cov/result.exec");
    }
}
