import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

//https://www.dropbox.com/request/6HkVNpexYJ8m9UwEWylm

public class Criptografia {
	public static void main(String[] args) throws IOException {

		BufferedReader input = new BufferedReader(
				new InputStreamReader(new FileInputStream("C:\\G07_encrypted.txt"), "UTF-8"));

		// String mensagem ="Japao";

		int chave = 3;
		String mensagem = input.readLine();

		System.out.println(decifra(mensagem, chave));

		FileWriter arq = new FileWriter("C:\\Users\\roberto\\Desktop\\criptografado.txt");
		PrintWriter gravarArq = new PrintWriter(arq);

		gravarArq.println(decifra(mensagem, chave));
		arq.close();
	}

	public static String cifra(String mensagem, int chave) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < mensagem.length(); i++) {
			char c = (char) (mensagem.charAt(i));
			/*
			 * if (c != '.' && c != ' ' && c != ':' && c != 'á' && c != 'é' && c
			 * != 'í' && c != 'ó' && c != 'ú' && c != '0' && c != 'ç' && c !=
			 * 'õ' && c != '/' && c != '_' && c != '?' ) {
			 * 
			 * c = (char) (mensagem.charAt(i) + chave);
			 * 
			 * 
			 * }
			 */

			if (  c =='b' || c == 'c' || c == 'd' || c == 'e' || c == 'f' || c == 'g' || c == 'h' || c == 'i'
					|| c == 'j' || c == 'k' || c == 'l' || c == 'm' || c == 'n' || c == 'o' || c == 'p' || c == 'q'
					|| c == 'r' || c == 's' || c == 't' || c == 'u' || c == 'v' || c == 'w' || c == 'x' || c == 'y'
					|| c == 'z' ||
					
					c == 'B' || c == 'C' || c == 'D' || c == 'E' || c == 'F' || c == 'G' || c == 'H' || c == 'I'
					|| c == 'J' || c == 'K' || c == 'L' || c == 'M' || c == 'N' || c == 'O' || c == 'P' || c == 'Q'
					|| c == 'R' || c == 'S' || c == 'T' || c == 'U' || c == 'V' || c == 'W' || c == 'X' || c == 'Y'
					|| c == 'Z') {
				
				c = (char) (mensagem.charAt(i) + chave);
			}
			else if (c =='a' || c == 'A'){
				c = 'x';
			}
				
			builder.append(c);
		}
		return builder.toString();
	}

	// Decifra a mensagem

	public static String decifra(String mensagem, int chave) {
		return cifra(mensagem, -chave);

	}

	// Encripta a mensagem

	public static String cifra2(String mensagem, int chave) {
		return cifra(mensagem, +chave);

	}
}