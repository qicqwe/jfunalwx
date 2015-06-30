package util;



import bean.Config;

import com.alibaba.fastjson.JSONObject;

public class AccessToken {
	
	private static AccessToken accessToken = new AccessToken();
	
	private String token;//
	/*private long expiresTime=7000*1000;//*/
	private long expiresTime=300*1000;
	private  Config config = new Config();
	private long createTime;
	
	private AccessToken() {
	}
	
	public static AccessToken getAccessToken() {
		return accessToken;
	}

	private void setAccessToken(String token, int expiresIn,long createTime) {
		this.token = token;
//		this.expiresIn = expiresIn;
		this.createTime = createTime;
	}

	private void load(){
		if(System.currentTimeMillis() - accessToken.createTime >expiresTime ){
			String url = WeChatURL.AccessTokenURL.replace("APPID", config.getAppId()).replace("APPSECRET", config.getAppSecrte());  
			//注意此处为get请求！	
			String str = HttpUtils.get(url, "");
			JSONObject jsonObject = JSONObject.parseObject(str);
			String access_token = jsonObject.getString("access_token");  
			Integer expires_in = jsonObject.getInteger("expires_in");  
            setAccessToken(access_token, expires_in,System.currentTimeMillis());
		}
	}
	
	public String getToken() {
		load();
		return token;
	}
	

}
