package sf;

public class SortStringUsingGivenFunction {

    public static void main(String[] args) {

        String givenString = "AAAABBBAACBBAACB";
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        SortStringUsingGivenFunction ssugf = new SortStringUsingGivenFunction();

        for(int i = 0; i < givenString.length(); i++) {
            char ch = givenString.charAt(i);
            if( ssugf.isA(ch)) {
                aCount++;
            } else if (ssugf.isB(ch)) {
                bCount++;
            }else if(ssugf.isC(ch)) {
                cCount++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int a = 0 ; a < aCount; a++) {
            sb.append("A");
        }
        for(int b = 0 ; b < bCount; b++) {
            sb.append("B");
        }
        for(int c = 0 ; c < cCount; c++) {
            sb.append("C");
        }

        System.out.println("Given  String: " + givenString);
        System.out.println("Sorted String: " + sb);
    }

    private boolean isA(char ch) {
        return ch == 'a' || ch == 'A';
    }

    private boolean isB(char ch) {
        return ch == 'b' || ch == 'B';
    }

    private boolean isC(char ch) {
        return ch == 'c' || ch == 'C';
    }
}
