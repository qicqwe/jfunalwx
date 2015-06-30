package bean;
public class Config {
	private static String key;
	private static String appId="wxba5dd0c9bde90f7c";
	private static String appSecrte="6acca53cfcc02e939dda67aa85247b71";
	private static String host;
	private static String umeHost;
	private static String accoutName;//账号名称
	private static String accountID;//账号ID
	
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getAppSecrte() {
		return appSecrte;
	}

	public void setAppSecrte(String appSecrte) {
		this.appSecrte = appSecrte;
	}


	public String getAppId() {
		return appId;
	}



	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getUmeHost() {
		return umeHost;
	}

	public void setUmeHost(String umeHost) {
		this.umeHost = umeHost;
	}

	public static String getAccoutName() {
		return accoutName;
	}

	public static void setAccoutName(String accoutName) {
		Config.accoutName = accoutName;
	}

	public static String getAccountID() {
		return accountID;
	}

	public static void setAccountID(String accountID) {
		Config.accountID = accountID;
	}
}
