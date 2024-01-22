package chap_06;

public class _Quiz_06 {
    // substring() 문자열 일부를 자를 수 있음
    // length() 문자열의 길이를 알 수 있음
    public static String getHideenDate(String data, int index){

        String hiddenData = data.substring(0, index); // 나코딩 -> 나
//        for (int i = 0; i < data.length(); i++) {
//
//        }

        for (int i = 0; i < data.length() - index; i++) {
            hiddenData += "*";
        }

        return hiddenData;

    }



    public static void main(String[] args) {
        String name = "나코딩";
        String id = "990130-1234567";
        String phone = "010-1234-5678";

        System.out.println("이름 : " + getHideenDate(name, 1));
        System.out.println("주민등록번호 : " + getHideenDate(id, 8));
        System.out.println("전화번호 : " + getHideenDate(phone, 9));
    }
}
