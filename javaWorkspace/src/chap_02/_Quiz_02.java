package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {

        int height01 = 115;
        int height02 = 121;

        String check01 = (height01 >= 120) ? "키가 " +height01 + "cm 이므로 탑승 가능합니다" : "키가 " +height01 + "cm 이므로 탑승 불가능합니다";
        String check02 = (height02 >= 120) ? "키가 " +height02 + "cm 이므로 탑승 가능합니다" : "키가 " +height02 + "cm 이므로 탑승 불가능합니다";

        System.out.println(check01);
        System.out.println(check02);


    }
}
