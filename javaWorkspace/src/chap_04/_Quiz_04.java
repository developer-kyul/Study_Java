public class _Quiz_04 {
    public static void main(String[] args) {
        int hour = 10; //주차 시간
        boolean s_car = false; //경차 여부
        boolean disable_car = false; // 장애인 자량 여부

        int fee = 4000 * hour; //시간 당 요금

        // 30,000d원 최대 요금
        if (fee > 30000) {
            fee = 30000;
        }

        //경차 또는 장애인 차량인 경우 50% 할인
        if (disable_car || s_car) {
            fee /= 2;
        }

        //실행결과 출력
        System.out.println("주차 요금은 "+ fee + "원 입니다");
    }
}
