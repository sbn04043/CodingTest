import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        String before = phone_book[0];
        for (int i = 1; i < phone_book.length; i++) {
            if (before.length() < phone_book[i].length()) {
                String temp = phone_book[i].substring(0, before.length());
                if (temp.equals(before)) 
                    return false;
            }
            before = phone_book[i];
        }
        return true;
    }
}