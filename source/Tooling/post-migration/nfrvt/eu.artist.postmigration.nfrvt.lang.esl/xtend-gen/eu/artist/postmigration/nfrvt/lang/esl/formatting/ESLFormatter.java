/*******************************************************************************
 * Copyright (c) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Martin Fleck (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
/**
 * generated by Xtext
 */
package eu.artist.postmigration.nfrvt.lang.esl.formatting;

import com.google.inject.Inject;
import eu.artist.postmigration.nfrvt.lang.esl.services.ESLGrammarAccess;
import eu.artist.postmigration.nfrvt.lang.util.mwe.formatting.ARTISTDeclarativeFormatter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.xbase.lib.Extension;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#formatting
 * on how and when to use it
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
@SuppressWarnings("all")
public class ESLFormatter extends ARTISTDeclarativeFormatter {
  @Inject
  @Extension
  private ESLGrammarAccess grammarAccess;
  
  protected void configureFormatting(final FormattingConfig c) {
    this.configureCommaStyle(c, ",");
    this.configureParenthesisStyle(c, "(", ")");
    this.configureParenthesisStyle(c, "{", "}");
    this.configureParenthesisStyle(c, "[", "]");
    TerminalRule _sL_COMMENTRule = this.grammarAccess.getSL_COMMENTRule();
    TerminalRule _mL_COMMENTRule = this.grammarAccess.getML_COMMENTRule();
    this.preserveNewLinesAroundComments(c, _sL_COMMENTRule, _mL_COMMENTRule);
    this.preserveVariableNames(c, "$");
    ParserRule _importNamespaceRule = this.grammarAccess.getImportNamespaceRule();
    this.formatImports(c, _importNamespaceRule);
    ParserRule _importURIRule = this.grammarAccess.getImportURIRule();
    this.formatImports(c, _importURIRule);
    ParserRule _importURIorNamespaceRule = this.grammarAccess.getImportURIorNamespaceRule();
    this.formatImports(c, _importURIorNamespaceRule);
  }
}
