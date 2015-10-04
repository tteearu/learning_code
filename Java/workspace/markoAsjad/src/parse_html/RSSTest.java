package parse_html;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class RSSTest {
	public static void main(String[] args) {
		Document doc;
		Elements titles, descriptions, items, pubdates;

		try {
			PrintWriter writer = new PrintWriter("/home/marko/Documents/learning_code/Java/shows.txt", "UTF-8");

			try {
				doc = Jsoup.connect("http://showrss.info/rss.php?user_id=271515&hd=1&proper=null").get();
				items = doc.select("item");

				for (Element element : items) {
					titles = element.select("title");
					descriptions = element.select("description");
					pubdates = element.select("pubDate");
					writer.println(titles.text() + ";" + pubdates.text());
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
			writer.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
	}
}