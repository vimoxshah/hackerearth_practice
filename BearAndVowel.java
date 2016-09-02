import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BearAndVowel {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		for (int test = 1; test <= Integer.parseInt(line); test++) {
			String str;
			int vowel = 0;
			boolean check = false;
			str = br.readLine();
			if (str.length() < 3) {
				for (int j = 0; j < str.length(); j++) {
					if (str.charAt(j) == 'a' || str.charAt(j) == 'e' || str.charAt(j) == 'i' || str.charAt(j) == 'o'
							|| str.charAt(j) == 'u' || str.charAt(j) == 'y') {
						vowel++;
					} else {
						vowel--;
					}
				}
				if (vowel >= 0) {
					System.out.println("easy");
				} else {
					System.out.println("hard");
				}
			} else {
				for (int j = 0; j < str.length(); j++) {
					if (str.charAt(j) == 'a' || str.charAt(j) == 'e' || str.charAt(j) == 'i' || str.charAt(j) == 'o'
							|| str.charAt(j) == 'u' || str.charAt(j) == 'y') {
						vowel++;
					} else {
						vowel--;
					}
				}
				if (vowel >= 0) {
					check = true;
				}
				if (check) {
					String regex = "[bcdfghjklmpqrstnvwxz][bcdfghjklmnpqrstvwxz][bcdfghjklmnpqrstvwxz]";
					for (int i = 0; i < str.length() - 2; i++) {
						String model;
						model = str.charAt(i) + "" + str.charAt(i + 1) + "" + str.charAt(i + 2) + "";
						if (model.matches(regex)) {
							check = false;
							System.out.println("hard");
							break;
						}
					}
				} else {
					System.out.println("hard");
				}
				if (check) {
					System.out.println("easy");
				}
			}
		}
	}
}