package se.lth.cs.srl.preprocessor.tokenization;

public class OpenNLPToolsTokenizerWrapper implements se.lth.cs.srl.preprocessor.tokenization.Tokenizer {
	
	opennlp.tools.tokenize.Tokenizer tokenizer;
	
	public OpenNLPToolsTokenizerWrapper(opennlp.tools.tokenize.Tokenizer tokenizerImplementation){
		this.tokenizer=tokenizerImplementation;
	}
	
	@Override
	public String[] tokenize(String sentence) {
		String[] tokens=tokenizer.tokenize(sentence);
		String[] withRoot=new String[tokens.length+1];
		withRoot[0]="<root>";
		int i=1;
		for(String token:tokens){
			withRoot[i]=token;
			++i;
		}
		return withRoot;
	}
	
}
