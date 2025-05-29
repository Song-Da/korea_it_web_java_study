package _21_class.Student;

public class Student {
    private String name;
    private int age;
    private String email;
    private String address;


    /*
    private 일 때 값을 넣는 방법
    1. 생성자
     */
    public Student(String name, int age, String email, String address) { // Alt+Insert 를 누르면 Generate가 뜨며 자동완성됨.
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;
    }


//    2. setter - 메소드를 한 번 더 쳐서 클래스 안에서 접근을 하는 것. 값을 넣거나 수정할 수 있음.
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    // getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public void showInfo() {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("이메일: " + email);
        System.out.println("주소: " + address);
    }
}