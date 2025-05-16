package cts.csie.ase.ro.patterns.command;

public class AsyncTask extends AbstractAsyncTask {
	
	String params;
	IGameModule module;
	
	public AsyncTask(String params, IGameModule module) {
		super();
		this.params = params;
		this.module = module;
	}

	@Override
	public void doAction() {
		if(this.module!= null) {
			this.module.executeTask(this.params);
		}
	}
}
