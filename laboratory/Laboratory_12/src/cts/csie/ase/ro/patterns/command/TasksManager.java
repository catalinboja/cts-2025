package cts.csie.ase.ro.patterns.command;

import java.util.ArrayList;

public class TasksManager {
	ArrayList<AbstractAsyncTask> tasks = new ArrayList<>();
	
	public void addAsyncTask(AbstractAsyncTask task) {
		this.tasks.add(task);
	}
	
	public void executeNextTask() {
		if(this.tasks.size() > 0) {
			AbstractAsyncTask nextTask = this.tasks.get(0);
			nextTask.doAction();
			this.tasks.remove(nextTask);
		}
	}
}
