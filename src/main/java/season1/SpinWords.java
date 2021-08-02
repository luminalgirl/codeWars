package season1;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SpinWords{

	
	public String spinWords(String sentence){
		
		StringBuilder finalSentence = new StringBuilder();
		List<String> sentenceWords = ((Stream<String>) Pattern.compile(" ").splitAsStream(sentence)).collect(Collectors.toList());
		for(String word : sentenceWords){
			if(word.length()>4) {
				word=new StringBuilder(word).reverse().toString();
			}
			finalSentence.append(word+" ");
		}
		return finalSentence.toString().trim();
	}
}
