package _31_Generic;

import _27_Bean.UserEntityLombok;

import java.util.Date;

public class DataController {
    public static void main(String[] args) {
//        ResponseData responseData = new ResponseData("데이터: ", "홍길동", 22, 3.14);
//        System.out.println(responseData.toStringStr());
//        System.out.println(responseData.toStringInt());
//        System.out.println(responseData.toStringDouble());

        ResponseData<String> responseData1 = new ResponseData<>("이름: ", "홍길동");
        System.out.println(responseData1);
        ResponseData<Integer> responseData2 = new ResponseData<>("나이: ", 22);
        System.out.println(responseData2);
        ResponseData<Double> responseData3 = new ResponseData<>("원주율: ", 3.14);
        System.out.println(responseData3);

        Date now = new Date();
        ResponseData<Date> nowDate = new ResponseData<>("현재 날짜와 시각: ", now);
        System.out.println(nowDate);

//        UserEntityLombok userEntityLombok = new UserEntityLombok();
//        userEntityLombok.setUserId(1);
//        userEntityLombok.setUsername("홍길동");
//        userEntityLombok.setAge(22);
//        userEntityLombok.setEmail("dshaiulwhnl@naver.ocm");
//        ResponseData<UserEntityLombok> user = new ResponseData<>()

        // product 패키지
        // ProductController.java, Product.java
        // 상품 정보, => 상품명(ProductName), 상품 정보(ProductInfo)
        //
    }
}