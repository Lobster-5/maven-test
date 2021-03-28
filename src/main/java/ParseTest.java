import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;

public class ParseTest {
    public static void main(String[] args) throws IOException {
        /*Document doc = Jsoup.connect("https://javarush.ru/groups/posts/1086-3-primera-kak-razobratjh-html-fayl-v-java-ispoljhzuja-jsoup").get();
        //String title = doc.title();
        StringBuilder stringBuilder = new StringBuilder("");
        for(Element e : doc.select("img")) {
            stringBuilder.append(e.attr("src"));
        {
        System.out.println(stringBuilder);*/

        URL url = new URL("https://shop.samberi.com/upload/iblock/dfb/dfbdbd1a91ba1fda149259ae6032d319.jpg");
        BufferedImage image;
        image = ImageIO.read(url);
        ImageIO.write(image, "jpg", new File("d:\\test.jpg"));
    }
}
