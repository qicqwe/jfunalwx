package servlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import util.SignKit;
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	boolean isPost = false;//是否是主动发送
    public MainServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response); 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String signature = request.getParameter("signature");
		String timestamp = request.getParameter("timestamp");
		String nonce = request.getParameter("nonce");
		String ip = request.getRemoteAddr();
		if(!SignKit.checkSignature(signature, timestamp, nonce)){
			return;
		}
		if(request.getMethod().equalsIgnoreCase("get")){
			String echostr = request.getParameter("echostr");
		}else{
			try{
				Map<String,String> map = parseXml(request);
				String key = map.get("key"); 
				
			}catch(Exception e){
				e.printStackTrace();
			}
			finally{
			}
			
		}
		if(!isPost){//被动响应
			response.setContentType("text/plain");
			response.setCharacterEncoding("UTF-8");
			PrintWriter out = null;
			try {
				out = response.getWriter();
				out.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}finally{
				if(out!=null){
					out.close();
				}
			}
		}
		
	}
	/**
	 * 解析微信发来的请求
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	public  Map<String, String> parseXml(HttpServletRequest request) {
		Map<String, String> map = new HashMap<String, String>();

		// 从request中取得输入流
		InputStream in = null;
		try {
			in = request.getInputStream();
			//解析XML
			SAXReader reader = new SAXReader();
			Document document = reader.read(in);
			Element root = document.getRootElement();
			List<Element> elementList = root.elements();
			for (Element e : elementList) {
				map.put(e.getName(), e.getText());
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			try {
				in.close();				
			} catch (IOException e) {
			}
		}
		return map;
	}
	public void consloreEvent(String key){
		switch (key) {
		case "chart":
			
			break;
		default:
			break;
		}
	}
}
