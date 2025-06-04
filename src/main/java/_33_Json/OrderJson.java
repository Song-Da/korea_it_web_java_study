package _33_Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class OrderJson {
    public static void main(String[] args) {
        JsonObject oderInfo = new JsonObject();

        oderInfo.addProperty("orderId", "ORD123456");
        oderInfo.addProperty("customer", "곽두팔");
        oderInfo.addProperty("product", "에어팟 프로 2세대");
        oderInfo.addProperty("quantity", 1);
        oderInfo.addProperty("price", 349000);

        JsonObject address = new JsonObject();
        address.addProperty("receiver", "곽두팔");
        address.addProperty("phone", 010-5678-1234);
        address.addProperty("city", "서울");
        address.addProperty("district", "마포구");
        address.addProperty("zipCode", 04123);

        oderInfo.add("address", address);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(oderInfo);
        System.out.println(json);
    }
}
