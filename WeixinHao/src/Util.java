import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;



public class Util {
	
	public static String getIPString (){
		try{
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;
			String path = RootPath.getInstance().getRoot();
			doc = builder.parse(new File(path + "/WEB-INF/IPConfig.xml"));

			NodeList nl = doc.getElementsByTagName("IP");
			return nl.item(0).getFirstChild().getNodeValue();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return null;
	}

}
