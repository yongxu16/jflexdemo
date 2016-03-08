/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Copyright (C) 2004-2015  Gerwin Klein <lsf@jflex.de>                    *
 * All rights reserved.                                                    *
 *                                                                         *
 * License: BSD                                                            *
 *                                                                         *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
package org.jflex.java ;
import java.io.*;
import java_cup.runtime.Symbol;


/**
 * Simple test driver for the java lexer. Just runs it on some
 * input files and produces debug output. Needs symbol class from
 * parser. 
 */
public class TestLexer {

  /** some numerals to for lexer testing */
  int intDec = 37;
  long longDec = 37l;
  int intHex = 0x0001;
  long longHex = 0xFFFFl;
  int intOct = 0377;
  long longOc = 007l;
  int smallest = -2147483648;   

  public static void main(String argv[]) {
	 String fileName = "E:\\STS\\workspace-git\\jflexdemo\\src\\org\\jflex\\java\\Makefile" ;
	 
      try {
        System.out.println("Lexing ["+fileName+"]");
        Scanner scanner = new Scanner(new UnicodeEscapes(new FileReader(fileName)));
                
        Symbol s;
        do {
          s = scanner.debug_next_token();
          System.out.println("token: "+s);
        } while (s.sym != sym.EOF);
        
        System.out.println("No errors.");
      }
      catch (Exception e) {
        e.printStackTrace(System.out);
        System.exit(1);
      }
  }
}
