package BankSystem;

public class Logger {
	String driverName;
	
	public Logger(String driverName) {
		this.driverName = driverName;
	}
	
	public static void  log(Log log) {
		System.out.println(log.getData());
	}
	
	public Log[] getLogs() {
		Log[] logs = null;
		return logs;
	}
}
