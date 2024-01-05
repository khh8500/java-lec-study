package ex14.example1;

import java.util.ArrayList;
import java.util.List;

public class CopyEx01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // 컬렉션 복사
        List<Integer> newList = new ArrayList<>(list);
        System.out.println(list.hashCode());
        System.out.println(newList.hashCode());

        newList.add(5);

        System.out.println(list.hashCode());
        System.out.println(newList.hashCode());

          // 이전
//        var newList = new ArrayList<>();
//        for (int i = 0; i < list.size(); i++) {
//            newList.add(list.get(i));
//        }
    }
}
