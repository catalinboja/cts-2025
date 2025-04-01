package ro.ase.acs.cts.main;

import ro.ase.acs.cts.design.patterns.factory.method.DocFactory;
import ro.ase.acs.cts.design.patterns.simple.factory.DocSimpleFactory;
import ro.ase.acs.cts.documents.AbstractDocument;
import ro.ase.acs.cts.documents.DocType;
import ro.ase.acs.cts.documents.DocumentHtmlGeneric;
import ro.ase.acs.cts.documents.DocumentOpenOfficeText;
import ro.ase.acs.cts.documents.DocumentWordText;

public class Main {
	public static void main(String[] args) {
		
		//tight coupling;
		
//		AbstractDocument htmlDoc = 
//				new DocumentHtmlGeneric("index.html", true);
//		AbstractDocument msWordDoc = 
//				new DocumentWordText("course.docx", 12, true, 10, false);
//		AbstractDocument openOfficeDoc = 
//				new DocumentOpenOfficeText("assignment.odl", 6);
		
		//test the factory method solution
		
		DocFactory docFactory = new DocFactory();
		AbstractDocument msWordDoc2 = 
				docFactory.getDocument(DocType.WORD, "course.docx");
		
		//test the simple factory
		AbstractDocument msWordDocCopy = 
				DocSimpleFactory.getDocument(DocType.WORD, "course.docx");
		
	}
}
