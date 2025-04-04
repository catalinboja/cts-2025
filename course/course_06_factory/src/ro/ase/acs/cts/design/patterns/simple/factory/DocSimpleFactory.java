package ro.ase.acs.cts.design.patterns.simple.factory;

import ro.ase.acs.cts.documents.AbstractDocument;
import ro.ase.acs.cts.documents.DocType;
import ro.ase.acs.cts.documents.DocumentHtmlGeneric;
import ro.ase.acs.cts.documents.DocumentOpenOfficeText;
import ro.ase.acs.cts.documents.DocumentWordText;

public class DocSimpleFactory {
	
	public static final int DEFAULT_WORD_VERSION = 1;
	public static final int DEFAULT_OPEN_VERSION = 9;
	
	public static AbstractDocument getDocument(
			DocType docType, String docName) {
		
		switch(docType) {
		case WORD:
			return new DocumentWordText(
					docName, DEFAULT_WORD_VERSION, false);
			
		case HTML:
			return new DocumentHtmlGeneric(docName, false);
			
		case OPEN_OFFICE:
			return new DocumentOpenOfficeText(docName);
		default:
			throw new UnsupportedOperationException();
		}
		
	}
	
}
