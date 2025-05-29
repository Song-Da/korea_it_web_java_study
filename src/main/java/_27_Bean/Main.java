package _27_Bean;

public class Main {
    public static void main(String[] args) {
        // UserEntity
        // UserId(int), username, age(int), email => private
        // 기본 생성자 하나 만들기
        // getter / setter
        // toString 오버라이드 해서 정보 모두 출력 되도록

        UserEntity userEntity = new UserEntity();
        userEntity.setUserId(1);
        userEntity.setUsername("홍길동");
        userEntity.setAge(20);
        userEntity.setEmail("dwubdlaxwa@naver.com");

        System.out.println(userEntity);

        UserEntityLombok userEntityLombok = new UserEntityLombok();

        userEntityLombok.setUserId(1);
        userEntityLombok.setUsername("홍길동");
        userEntityLombok.setAge(20);
        userEntityLombok.setEmail("dwubdlaxwa@naver.com");

        System.out.println(userEntityLombok);

    }
}