package QUESTAO_9;

public class SystemInfo {

	private static SystemInfo instance;
	private String systemName;
	private String javaVersion;
	
	private SystemInfo() {
		
		this.systemName = System.getProperty("os.name");
		this.javaVersion = System.getProperty("java.version");
		
	}
	
	public static SystemInfo getInstance() {
		
		if (SystemInfo.instance == null) {
			SystemInfo.instance = new SystemInfo();
		}
		
		return SystemInfo.instance;
		
	}
	
}
