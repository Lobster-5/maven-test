import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;

public class ParseTest {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://javarush.ru/groups/posts/1086-3-primera-kak-razobratjh-html-fayl-v-java-ispoljhzuja-jsoup").get();
        StringBuilder stringBuilder = new StringBuilder("");
        Elements e = doc.select("img");
        URL url = new URL("https://javarush.ru/groups/posts/1086-3-primera-kak-razobratjh-html-fayl-v-java-ispoljhzuja-jsoup" + e.attr("src"));
        BufferedImage image;
        image = ImageIO.read(url);
        ImageIO.write(image, "jpg", new File("d:\\test1.jpg"));
    }
}
