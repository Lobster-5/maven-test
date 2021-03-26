import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class ParseTest {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://javarush.ru/groups/posts/1086-3-primera-kak-razobratjh-html-fayl-v-java-ispoljhzuja-jsoup").get();
        //String title = doc.title();
        StringBuilder stringBuilder = new StringBuilder("");
        for(Element e : doc.select("img")){
            stringBuilder.append(e.attr("src")+"\n");
        }
        System.out.println(stringBuilder);
    }
}
