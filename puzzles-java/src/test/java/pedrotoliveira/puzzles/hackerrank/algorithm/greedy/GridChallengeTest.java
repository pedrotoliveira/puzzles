/*
 * Copyright (c) - UOL Inc, Todos os direitos reservados
 *
 * Este arquivo e uma propriedade confidencial do Universo Online Inc. Nenhuma
 * parte do mesmo pode ser copiada, reproduzida, impressa ou transmitida por
 * qualquer meio sem autorizacao expressa e por escrito de um representante
 * legal do Universo Online Inc.
 *
 * All rights reserved
 *
 * This file is a confidential property of Universo Online Inc. No part of this
 * file may be reproduced or copied in any form or by any means without written
 * permisson from an authorized person from Universo Online Inc.
 *
 */
package pedrotoliveira.puzzles.hackerrank.algorithm.greedy;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author pedrotoliveira
 */
public class GridChallengeTest {

    private InputStream input;
    private File expectedOutput;

    @Before
    public void setUp() throws Exception {
		ClassLoader classLoader = this.getClass().getClassLoader();
        this.input = new FileInputStream(classLoader.getResource("GridChallengeTestCase10").getFile());
        this.expectedOutput = new File(classLoader.getResource("GridChallengeTestCase10Output").getFile());
    }

    @After
    public void tearDown() throws Exception {
        try {
            input.close();
        } catch (IOException io) {
            //Do nothing
        }
    }

    @Test
    public void testPrintSolution() throws Exception {
        File testOutput = new File("tmp/GridChallengeTestOutput");
        if (testOutput.exists()) {
            testOutput.delete();
        } else {
            testOutput.createNewFile();
        }
        PrintStream printStream = new PrintStream(testOutput);
        GridChallenge challenge = new GridChallenge(input, printStream);
        challenge.printSolution();
        assertTrue(FileUtils.contentEquals(expectedOutput, testOutput));
    }

}
