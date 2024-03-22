package Hocjava;


import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Test1 {
	public static void main(String[] args) throws IOException {
		        Document doc = Jsoup.connect("https://www.youtube.com/watch?v=ciUQdpyv6jg").get();
		        String title = doc.title();
		        System.out.println(title);		       
		        
		 }}