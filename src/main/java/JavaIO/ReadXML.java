package JavaIO;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

public class ReadXML {
	public static void main(String[] args) {
		try {
			String fileName = "src\\JavaIO\\XMLInput.xml";
			File file = new File(fileName); // XML file path
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

			Document doc = dBuilder.parse(file);
			doc.getDocumentElement().normalize(); // Normalize XML structure

			System.out.println("Root element: " + doc.getDocumentElement().getNodeName());

			NodeList nodeList = doc.getElementsByTagName("employee");

			// Loop through employees
			for (int i = 0; i < nodeList.getLength(); i++) {
				Node node = nodeList.item(i);

				if (node.getNodeType() == Node.ELEMENT_NODE) {
					Element element = (Element) node;
					
					String id = element.getElementsByTagName("id").item(0).getTextContent();
					String name = element.getElementsByTagName("name").item(0).getTextContent();
					String salary = element.getElementsByTagName("salary").item(0).getTextContent();

					System.out.println("Employee ID : " + id);
					System.out.println("Name        : " + name);
					System.out.println("Salary      : " + salary);
					System.out.println("----------------------");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
