package chap_04;

public class _07_Dowhile {
    public static void main(String[] args) {
        // 반복문 Do While
        // 수영장에서 수용을 하는 모습
        int distance = 25; // 전체 거리 25m
        int move = 0; // 현재 이동 거리 0m
        int height = 2; // 키 2m

        while (move + height < distance) { // 현재 이동 거리가 전체 거리보다 작다는 조건이 참인 동안 반복 수행
            System.out.println("발차기를 계속 합니다");
            System.out.println("현재 이동 거리 : " + move);
            move += 3; // 3미터 이동
        }
        System.out.println("도착하였습니다");


        System.out.println(" --- 반복문 #1 ---");
        //키가 엄청나게 큰 사람?
        move = 0;
        height =25;

        while (move + height < distance) { // 현재 이동 거리가 전체 거리보다 작다는 조건이 참인 동안 반복 수행
            System.out.println("발차기를 계속 합니다");
            System.out.println("현재 이동 거리 : " + move);
            move += 3; // 3미터 이동
        }
        System.out.println("도착하였습니다");


        System.out.println(" --- 반복문 #2 ---");
        // Do While 반복문
        do {
            System.out.println("발차기를 계속 합니다");
            System.out.println("현재 이동 거리 : " + move);
            move += 3; // 3미터 이동
        } while (move + height < distance);
        System.out.println("도착하였습니다");


    }
}
