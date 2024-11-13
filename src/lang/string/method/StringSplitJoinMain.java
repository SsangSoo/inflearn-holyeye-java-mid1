package lang.string.method;

public class StringSplitJoinMain {

    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        //split
        String[] splitStr = str.split(",");
        for(String s : splitStr) {
            System.out.println("s = " + s);
        }

        String joinStr = "";
        for (String string : splitStr) {
            joinStr += string + "-";
        }

        System.out.println("joinStr = " + joinStr); // Apple-Banana-Orange-

        // 끝에 '-' 빼려면
//        String joinStr2 = "";
//        for(int i=0; i < splitStr.length; i++) {
//            String string = splitStr[i];
//            joinStr2 += string;
//            if(i != splitStr.length-1) {
//                joinStr2 += "-";
//            }
//        }
//
//        System.out.println("joinStr2 = " + joinStr2);

        // join()
        String joinedStr = String.join("-", "A", "B", "C");
        System.out.println("joinedStr = " + joinedStr);


        // 문자열 배열 연결
        String result = String.join("-", splitStr);
        System.out.println("result = " + result);


    }
}
