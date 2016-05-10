import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Vigenere {
	public static void main(String[] args) throws IOException {

		BufferedReader input = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\cript.txt"), "UTF-8"));

		// String mensagem ="Japao";

		int[] chaves = new int[6];

		// CHAVE = BRASIL
		chaves[0] = 1;
		chaves[1] = 17;
		chaves[2] = 0;
		chaves[3] = 18;
		chaves[4] = 8;
		chaves[5] = 11;

		String mensagem = input.readLine();
		//System.out.println(mensagem);

		// int size = chaves.length;
		System.out.println(cifra(mensagem, chaves));
		FileWriter arq = new FileWriter("C:\\Users\\roberto\\Desktop\\criptografado.txt");
		PrintWriter gravarArq = new PrintWriter(arq);

		gravarArq.println(decifra(mensagem, chaves));
		arq.close();
	}

	public static String cifra(String mensagem, int[] chaves) {

		int size = chaves.length;

		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < mensagem.length(); i++) {
			int pos = 0;
			char c = (char) (mensagem.charAt(i));

			if (chaves[pos] > size) {
				chaves[pos] = 0;

				if (c == 'b' || c == 'c' || c == 'd' || c == 'e' || c == 'f' || c == 'g' || c == 'h' || c == 'i'
						|| c == 'j' || c == 'k' || c == 'l' || c == 'm' || c == 'n' || c == 'o' || c == 'p' || c == 'q'
						|| c == 'r' || c == 's' || c == 't' || c == 'u' || c == 'v' || c == 'w' || c == 'x' || c == 'y'
						|| c == 'z' ||

						c == 'B' || c == 'C' || c == 'D' || c == 'E' || c == 'F' || c == 'G' || c == 'H' || c == 'I'
						|| c == 'J' || c == 'K' || c == 'L' || c == 'M' || c == 'N' || c == 'O' || c == 'P' || c == 'Q'
						|| c == 'R' || c == 'S' || c == 'T' || c == 'U' || c == 'V' || c == 'W' || c == 'X' || c == 'Y'
						|| c == 'Z') {
					c = (char) (mensagem.charAt(i) + chaves[pos]);
					pos++;

				}
			}
		}
		return builder.toString();
	}

	public static String decifra(String mensagem, int[] chaves) {
		return cifra(mensagem, chaves);
	}

	public static String cifra2(String mensagem, int[] chaves) {
		return cifra2(mensagem, null);
	}
}