package interviewquestions;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class RotationWord {

    /*

     */

    public static void main(String[] args) {
        String s1 = "kakabüs";
        String s2 = "kabüska";
        System.out.println(isRotated(s1,s2));
    }

    public static boolean isRotated(String s1, String s2){
        if (s1.length()==s2.length()){
            s1 = s1.concat(s1);
            if (s1.contains(s2)) {
                return true;
            }
        }
        return false;
    }

//    public static boolean isRotated(String s1, String s2) {
//        boolean isRotation = false;
//        if (s1.length() != s2.length()) {
//            return false;
//        } else {
//            List<Integer> s2IdxList = new ArrayList<>();
//            for (int i = 0; i<s2.length()-1; i++){
//                if (s2.charAt(i)==s1.charAt(0)){
//                    s2IdxList.add(i);
//                }
//            }
//            System.out.println(s2IdxList);
//            if (s2IdxList.isEmpty()){
//                return false;
//            }
//            ListIterator itr1 = s2IdxList.listIterator();
//            while (itr1.hasNext()){
//                int s2Idx = (int) itr1.next();
//                isRotation = false;
//                for (int i = 0; i < s1.length(); i++) {
//                    System.out.println("" + s1.charAt(i) + s2.charAt(s2Idx));
//                    if (s1.charAt(i) == s2.charAt(s2Idx)) {
//                        isRotation = true;
//                        s2Idx++;
//                        if (s2Idx == s2.length()) {
//                            s2Idx = 0;
//                        }
//                    } else {
//                        isRotation = false;
//                        break;
//                    }
//
//                }
//                if (isRotation){
//                    break;
//                }
//            }
//
//        }
//        return isRotation;
//    }


}
