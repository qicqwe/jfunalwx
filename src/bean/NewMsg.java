package bean;

import java.util.List;


/**
 */
public class NewMsg extends BaseMsg {
	
	public NewMsg() {
		this.MsgType = "new";
	}
	
	private int ArticleCount;

	private List<New> Articles;

	public int getArticleCount() {
		return ArticleCount;
	}

	public List<New> getArticles() {
		return Articles;
	}

	public void setArticles(List<New> articles) {
		Articles = articles;
		ArticleCount = articles.size();
	}
}