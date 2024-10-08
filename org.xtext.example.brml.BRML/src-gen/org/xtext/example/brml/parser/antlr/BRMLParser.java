/*
 * generated by Xtext 2.34.0
 */
package org.xtext.example.brml.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.brml.parser.antlr.internal.InternalBRMLParser;
import org.xtext.example.brml.services.BRMLGrammarAccess;

public class BRMLParser extends AbstractAntlrParser {

	@Inject
	private BRMLGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalBRMLParser createParser(XtextTokenStream stream) {
		return new InternalBRMLParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public BRMLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(BRMLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
