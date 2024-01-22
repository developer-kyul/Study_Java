package chap_04;

public class _05_For {
    public static void main(String[] args) {
        //반목문 For
        //매장 인사를 여러번 한다면?
        System.out.println("어서오세요. 코딩입니다");

        //반복문 사용 For
        //for(선언; 조건; 증감) {
        // ...수행 명령...}
        for (int i = 0; i < 10; i++) {
            System.out.println("어서오세요. 코딩입니다 " + i);
        }

        //짝수만 출력 i+=2
        // 0 2 4 6 8
        for (int i = 0; i < 10; i +=2) {
            System.out.print(i);
        }

        System.out.println();

        //홀수만 출력
        // 1 3 5 7 9
        for (int i = 1; i < 10 ; i+=2) {
            System.out.print(i);
        }

        System.out.println();
        
        //거꾸로 숫자
        // 5 4 3 2 1
        for (int i = 5; i > 0; i--) {
            System.out.print(i);
        }

        //1부터 10까지의 수들의 합
        // 1 + 2 + ... + 10 = 55
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println("현재까지 총합은 " + sum + "입니다");
        }

        System.out.println("결과 : " + sum);
    }
}