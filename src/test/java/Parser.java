import com.sun.jna.StringArray;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.net.URL;

public class Parser {
    private static Document getPage() {
        String url = "https://www.pogoda.spb.ru";
        Document page = Jsoup.parse(new URL(url), 3000);

    };
    public static void main(String[] args) {


    }
}
