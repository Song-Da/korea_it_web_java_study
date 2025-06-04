package _33_Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.Map;

@AllArgsConstructor
@ToString
class Book {
    private String isbn;
    private String title;
    private String author;
    private String price;
    private String publisher;
}

public class BookJson {
    public static void main(String[] args) {
        // Book 객체 => Json 문자열
        Gson gson = new Gson();
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();

        String bookJson = null;

        Book book = new Book("978-1234567890", "자바의 정석", "남궁성", "38000", "도우출판");
        System.out.println("Book 객체 => " + book);

        // Json => Map
        Map<String, String> map1 = gson.fromJson(bookJson, Map.class);
        System.out.println(map1);

        // Map => Pretty Json


        // Json => Book 객체


    }
}