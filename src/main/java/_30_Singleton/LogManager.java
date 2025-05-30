package _30_Singleton;

public class LogManager {
    /*
    싱글톤(singleton)
    애플리케이션 전체에서 단 하나의 인스턴스를 공유하도록 하는 패턴
    자원을 공유해야 할 때 => 설정 파일
    객체를 여러 번 만들 필요가 없고, 한 번만 만들고 재사용 하는 경우
     */

    private static LogManager instance; // 클래스 수준의 변수
    
    private LogManager () {}; // 생성자를 private으로 막아서 외부에서 new 금지
    
    public static LogManager getInstance() {
        if (instance == null) { // 정적 변수에 인스턴스가 있는지 확인
            instance = new LogManager(); // 없다면 최초 1회 객체 생성
        }
        return instance; // 있다면 정적 변수에 있는 객체 반환
    }
    
    public void log(String massage) {
        System.out.println("LOG => " + massage);
    }
}