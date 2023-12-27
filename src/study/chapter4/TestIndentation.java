package study.chapter4;

public class TestIndentation {

	public static void main(String[] args) {
		String text = """
				Eu quero testar o quanto eu posso
				escrever aqui discriminadamente
				sobre qualquer coisa e ainda assim
				o texto ficar organizado por meio 
				da indentação.
				""";
		
		System.out.println(text);
		System.out.println(text.indent(2));
		System.out.println(text.stripIndent());
	}
}
