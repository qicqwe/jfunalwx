package util;


public class WeChatURL {
	/**
	 * 获取AccessToken接口（GET）
	 */
	public  static  String AccessTokenURL = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET";
//	public   String AccessTokenURL = "https://api.yixin.im/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET";
	/**
	 * 创建菜单接口（POST）
	 */
	private   static String CreateMenuURL = " https://api.weixin.qq.com/cgi-bin/menu/create?access_token=ACCESS_TOKEN";

	/**
	 * 自定义菜单查询接口（GET）
	 */
	private   static String CatchMenuURL = "https://api.weixin.qq.com/cgi-bin/menu/get?access_token=ACCESS_TOKEN";
	
	/**
	 * 自定义菜单删除接口（GET ）
	 */
	private   static String RemoveMenuURL = "https://api.weixin.qq.com/cgi-bin/menu/delete?access_token=ACCESS_TOKEN";
	
	/**
	 * 发送客服消息接口（POST）
	 */
	private   static   String SendCustomMsgURL = "https://api.weixin.qq.com/cgi-bin/message/custom/send?access_token=ACCESS_TOKEN";
	
	/**
	 * 获取关注用户列表（GET ）
	 */
	private   static  String GetAllUserURL = "https://api.weixin.qq.com/cgi-bin/user/get?access_token=ACCESS_TOKEN&next_openid=";
	
	/**
	 * 或者用户信息(GET)
	 */
	private   static  String GetUserInfoURL = "https://api.weixin.qq.com/cgi-bin/user/info?access_token=ACCESS_TOKEN&openid=OPENID&lang=zh_CN";
	/**
	 * 上传多媒体（POST/FORM）
	 */
	private   static  String UploadFileURL = "http://file.api.weixin.qq.com/cgi-bin/media/upload?access_token=ACCESS_TOKEN&type=TYPE";
	/**
	 * 下载多媒体（GET）
	 */
	private   static  String downFileURL = "http://file.api.weixin.qq.com/cgi-bin/media/get?access_token=ACCESS_TOKEN&media_id=MEDIA_ID";

	/**
	 * 创建分组(POST)
	 */
	private   static  String CreateGroupURL="https://api.weixin.qq.com/cgi-bin/groups/create?access_token=ACCESS_TOKEN";
	/**
	 * 查询所有分组（GET）
	 */
	private   static  String GetGroupURL = "https://api.weixin.qq.com/cgi-bin/groups/get?access_token=ACCESS_TOKEN";
	/**
	 * 获取用户所在分组（POST）
	 */
	private   static  String GetUserGroupURL = "https://api.weixin.qq.com/cgi-bin/groups/getid?access_token=ACCESS_TOKEN";
	/**
	 * 修改分组(POST)
	 */
	private   static  String UpdateGroupURL = "https://api.weixin.qq.com/cgi-bin/groups/update?access_token=ACCESS_TOKEN";
	/**
	 *移动用户分组 (POST)
	 */
	private   static  String UpdateGroupUserURL = "https://api.weixin.qq.com/cgi-bin/groups/members/update?access_token=ACCESS_TOKEN";
	
	private   static  String  SendGroupMsgURLByOpenId = "https://api.weixin.qq.com/cgi-bin/message/mass/send?access_token=ACCESS_TOKEN";
	
	private   static  String SendGroupMsgURLByGroupId="https://api.weixin.qq.com/cgi-bin/message/mass/sendall?access_token=ACCESS_TOKEN";
	
	private static String SendNewMsgURL="https://api.weixin.qq.com/cgi-bin/media/uploadnews?access_token=ACCESS_TOKEN";
	/**
	 *分享获取临时票据的接口
	 */
	private static String SendTicketURL="https://api.weixin.qq.com/cgi-bin/ticket/getticket?access_token=ACCESS_TOKEN&type=jsapi";

	private static String CustomSessionURL=" https://api.weixin.qq.com/customservice/kfsession/getsession?access_token=ACCESS_TOKEN&openid=";
	
	private static String CloseCustomURL=" https://api.weixin.qq.com/customservice/kfsession/close?access_token=ACCESS_TOKEN";
	public static String getSendNewMsgURL() {
		String accessToken = AccessToken.getAccessToken().getToken();
		String url  = SendNewMsgURL.replace("ACCESS_TOKEN", accessToken);
		return url;
	}
	public static String getCreateMenuURL() {
		String accessToken = AccessToken.getAccessToken().getToken();
		String url  = CreateMenuURL.replace("ACCESS_TOKEN", accessToken);
		return url;
	}
	public static String getCatchMenuURL() {
		String accessToken = AccessToken.getAccessToken().getToken();
		String url  = CatchMenuURL.replace("ACCESS_TOKEN", accessToken);
		return url;
	}
	public static String getRemoveMenuURL() {
		String accessToken = AccessToken.getAccessToken().getToken();
		String url  =RemoveMenuURL.replace("ACCESS_TOKEN", accessToken);
		return url;
	}
	public static String getSendCustomMsgURL() {
		String accessToken = AccessToken.getAccessToken().getToken();
		String url = SendCustomMsgURL.replace("ACCESS_TOKEN", accessToken);
		return url;
	}
	public static String getGetAllUserURL() {
		String accessToken = AccessToken.getAccessToken().getToken();
		String url = GetAllUserURL.replace("ACCESS_TOKEN", accessToken);
		return url;
	}
	public static String getGetUserInfoURL() {
		String accessToken = AccessToken.getAccessToken().getToken();
		String url = GetUserInfoURL.replace("ACCESS_TOKEN", accessToken);
		return url;
	}
	public static String getUploadFileURL() {
		String accessToken = AccessToken.getAccessToken().getToken();
		String url = UploadFileURL.replace("ACCESS_TOKEN", accessToken);
		return url;
	}
	public static String getdownFileURL(String media_id) {
		String accessToken = AccessToken.getAccessToken().getToken();
		String url = downFileURL.replace("ACCESS_TOKEN", accessToken).replace("MEDIA_ID", media_id); 
		return url;
	}
	public static String getCreateGroupURL() {
		String accessToken = AccessToken.getAccessToken().getToken();
		String url = CreateGroupURL.replace("ACCESS_TOKEN", accessToken);
		return url;
	}
	public static String getGetGroupURL() {
		String accessToken = AccessToken.getAccessToken().getToken();
		String url = GetGroupURL.replace("ACCESS_TOKEN", accessToken);
		return url;
	}
	public static String getGetUserGroupURL() {
		String accessToken = AccessToken.getAccessToken().getToken();
		String url = GetUserGroupURL.replace("ACCESS_TOKEN", accessToken);
		return url;
	}
	public static String getUpdateGroupURL() {
		String accessToken = AccessToken.getAccessToken().getToken();
		String  url = UpdateGroupURL.replace("ACCESS_TOKEN", accessToken);
		return url;
	}
	public static String getUpdateGroupUserURL() {
		String accessToken = AccessToken.getAccessToken().getToken();
		String  url = UpdateGroupUserURL.replace("ACCESS_TOKEN", accessToken);
		return url;
	}
	public  static String getSendGroupMsgURLByOpenId() {
		String accessToken = AccessToken.getAccessToken().getToken();
		String  url = SendGroupMsgURLByOpenId.replace("ACCESS_TOKEN", accessToken);
		return url;
	}
	public static String getSendGroupMsgURLByGroupId() {
		String accessToken = AccessToken.getAccessToken().getToken();
		String  url = SendGroupMsgURLByGroupId.replace("ACCESS_TOKEN", accessToken);
		return url;
	}
	public static String getSendTicketURL() {
		String accessToken = AccessToken.getAccessToken().getToken();
		String  url = SendTicketURL.replace("ACCESS_TOKEN", accessToken);
		return url;
	}
	public static String getCustomSessionURL() {
		String accessToken = AccessToken.getAccessToken().getToken();
		String url = CustomSessionURL.replace("ACCESS_TOKEN", accessToken);
		return url;
	}
	public static String getCloseCustomURL() {
		String accessToken = AccessToken.getAccessToken().getToken();
		String url = CloseCustomURL.replace("ACCESS_TOKEN", accessToken);
		return url;
	}
	
	
}
