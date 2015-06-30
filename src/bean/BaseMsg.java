package bean;
public class BaseMsg {
	// 接收方帐号（收到的OpenID）
	private String ToUserName;
	// 开发者微信号
	private String FromUserName;
	// 消息创建时间 （整型）
	private Long CreateTime;
	// 消息类型（text/music/news）
	protected String MsgType;
	private String id;
	private String username;
	private String loginname;
	private String type;
	private String sendtime;
	private String xmlsource;
	
	public String getXmlsource() {
		return xmlsource;
	}

	public void setXmlsource(String xmlsource) {
		this.xmlsource = xmlsource;
	}

	public String getSendtime() {
		return sendtime;
	}

	public void setSendtime(String sendtime) {
			this.sendtime=sendtime;
		
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getToUserName() {
		return ToUserName;
	}

	public void setToUserName(String toUserName) {
		ToUserName = toUserName;
	}

	public String getFromUserName() {
		return FromUserName;
	}

	public void setFromUserName(String fromUserName) {
		FromUserName = fromUserName;
	}

	public Long getCreateTime() {
		return CreateTime;
	}

	public void setCreateTime(Long createTime) {
		CreateTime = createTime;
	}

	public String getMsgType() {
		return MsgType;
	}

	public void setMsgType(String msgType) {
		MsgType = msgType;
	}
}
