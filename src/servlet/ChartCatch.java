package servlet;

import java.util.Map;

import com.alibaba.fastjson.JSON;

import util.HttpUtils;

public class ChartCatch {
	public final static String URL="http://www.simsimi.com/requestChat?lc=zh&ft=0.0&req="; 
	public static String catchRseultChart(String chartContext){
		String result="";
		try {
			result=HttpUtils.get(URL+chartContext, null);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			result="连接错误";
		}finally{
			Map<String,String> resultchart = (Map<String, String>) JSON.parse(result); 
			return resultchart.get("res").toString();
		}
	}
/*	public static void main(String[] args) {
		String reaultchart=catchRseultChart("你看你说的是个吊");
		System.out.println(reaultchart);
	}*/
}
