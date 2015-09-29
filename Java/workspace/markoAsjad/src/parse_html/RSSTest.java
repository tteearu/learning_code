package parse_html;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class RSSTest {
	public static void main(String[] args) {
		Document doc;
		Elements titles = null;
		Elements descriptions = null;
		Elements items = null;

		try {
			doc = Jsoup.connect("http://showrss.info/rss.php?user_id=271515&hd=1&proper=null").get();
			items = doc.select("item");

			for (Element element : items) {
				titles = element.select("title");
				descriptions = element.select("description");
				System.out.println(titles.text());
				System.out.println("\t" + descriptions.text());

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}