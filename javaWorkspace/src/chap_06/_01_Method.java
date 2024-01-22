package chap_06;

public class _01_Method {
    public static void sayHello () {
        //주로 동사를 사용한 메소드명을 만든다
        //메소드 정의
        //여러번 호출 가능
        System.out.println("안녕하세요? 메소드입니다");
    }


    public static void main(String[] args) {
        // 메소드 >> 함수랑 비슷한 개념
        // 메소드 호출

        System.out.println("메소드 호출 전");
        sayHello();
        sayHello();
        sayHello();
        System.out.println("메소드 호출 후");
    }

}
