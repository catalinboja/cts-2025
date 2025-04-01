package ro.ase.csie.cts.assignment2;

public interface IDroneConnection {
	public abstract void connect();
	public abstract boolean isConnected();
	public abstract void disconnect();
}
