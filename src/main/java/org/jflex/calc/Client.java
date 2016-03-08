package org.jflex.calc;

import java.io.FileReader;

public class Client {
	public static void main(String argv[]) {
		/* Start the parser */
		String filePath = "E:\\STS\\workspace-git\\jflexdemo\\src\\org\\jflex\\calc\\test.txt" ;
		try {
			parser p = new parser(new Lexer(new FileReader(filePath)));
			Object result = p.parse().value;
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
