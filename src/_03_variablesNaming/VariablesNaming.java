package _03_variablesNaming;

public class VariablesNaming {
    public static void main(String[] args) {
        /* 변수명 짓는 법
        1. 저장되는 데이터에 어울리는 이름, 직관적이고 한눈에 파악하기 쉬운 이름
        2. 밑줄(_), 문자, 숫자 사용 가능, 단 숫자가 맨 앞에 올 수는 없다.
        3. 한 단어 또는 2개 이상 단어를 연속해서 사용할 수 있다.
        4. 소문자로 시작하고, 두 번째 단어부터는 시작 글자를 대문자.
        파스칼 표기법(쌍봉낙타 표기법) => LastName => 클래스명, 파일명
        카멜 표기법(단봉낙타 표기법) => lastName => 변수명, 메소드명
        5. 예약어 사용 불가(public, static, void, int, float, ...) 자바 안에서 기능을 하고 있기 때문에...
         */

        // 자동차에 관한 내용인 것을 알 수가 있음. 직관적이니까.
        String carBrandName = "KIA";
        String carModelName = "EV6";
        String carColor = "white";
        int carPassengerCapacity = 5;
        int carModelYear = 2025;

        // 상수 : 절대 변하지 않는 데이터 => 상수명은 다 대문자, 단어 사이에 _로 구분을 함.
        // final 로 고쳐주면 이 데이터가 마지막이므로 절대 변하지 않음.
        final String COUNTRY_CODE = "KR";
        // COUNTRY_CODE = "US"; <= 바꿀 수 없다고 빨간줄이 뜸.
    }
}