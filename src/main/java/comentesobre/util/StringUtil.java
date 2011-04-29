package comentesobre.util;

import java.text.Normalizer;

public class StringUtil {

	public static void main(String[] args) {
		String text = "MŽétoDos ágeis";
		System.out.println(converteStringParaUri(text));
	}

	public static String converteStringParaUri(String text){
		text = Normalizer.normalize(text, Normalizer.Form.NFD);
        text = text.replace(" ", "-").toLowerCase();
        text = text.replaceAll("[^\\p{ASCII}]", "");
//        System.out.println(text);
		return text;
	}
	
}
