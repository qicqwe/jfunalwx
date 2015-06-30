package util;


public class ChartUtil {
	public static String catchToken(){
		String accessToken = AccessToken.getAccessToken().getToken();
		return accessToken;
	}
}
