package ro.ase.csie.cts.g1094.singleton;

public class DbConnection {
	
	String connString;
	String schema;
	
	private static DbConnection connection = null; //by default is null
	
	private DbConnection() {
		System.out.println("Creating a connection object");
		System.out.println("Loading confuguration...");
		this.connString="127.0.0.1:1443";
		this.schema="cts";
	}

	private DbConnection(String connString, String schema) {
		super();
		this.connString= connString;
		this.schema= schema;
	}
	
	public static DbConnection getConnection() {  //this is the only public method
		if (DbConnection.connection== null) {
			connection = new DbConnection();
		}
		return DbConnection.connection;//there is no else because we always want to return this
	}
	//it's not clean
	//it's misleading-other will think they have multiple connection
	public static DbConnection getConnection(String conString, String schema) {  //this is the only public method
		if (DbConnection.connection== null) {
			connection = new DbConnection(conString, schema);
		}
		return DbConnection.connection;
	}
}
