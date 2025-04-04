package ro.ase.acs.cts.documents;

public class DocumentWordText extends AbstractDocument {
	
	private int version;
	private boolean macrosEnabled;

	public DocumentWordText(
			String title, 
			int version
			,boolean enableMacros
			) {
		this.setName(title);
		this.version = version;
		this.macrosEnabled = enableMacros;
	}
	
	@Override
	public String getType() {
		return "MSWord Document for text";
	}

	@Override
	public void print(String text) {
		System.out.println(text);
	}

}
