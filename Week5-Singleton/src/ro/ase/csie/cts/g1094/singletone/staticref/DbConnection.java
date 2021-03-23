package ro.ase.csie.cts.g1094.singletone.staticref;

public class DbConnection {
	String connString;
	String schema;
	
	public static DbConnection connection = new DbConnection();
	
	//static class initializer
	static {
		//called only once before the class is loaded by the JVM
		System.out.println("Hello.DbConnection is loaded");
		connection.connString="10.0.0.1:1443";
		connection.schema = "tempData";
	}
	
	//constructor initializer
	{
		//called every time before any constructor call
		System.out.println("Building an object");
	}
	//if you don;t define it uou get the free public versiobn of it
	private DbConnection() {
		System.out.println("Creating a connection object");
		System.out.println("Loading confuguration...");
		this.connString="127.0.0.1:1443";
		this.schema="cts";
	}

	
}
