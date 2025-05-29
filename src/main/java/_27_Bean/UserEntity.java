package _27_Bean;

// Bean
// 하나의 객체 설계 규칙 (명세, 가이드 라인)
// 멤버 변수들은 private => 캡슐화
// 기본 생성자
// getter / setter => 외부 접근을 위해

public class UserEntity { // 3가지의 규칙이 정해지면 Bean 이다. 다른 기능이 있는 건 아니다.
    private int userId;
    private String username;
    private int age;
    private String email;

    public UserEntity() {

    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserEntity(" + "userId= " + userId + ", username= " + username + ", age= " + age + ", email= " + email + ")";
    }
}