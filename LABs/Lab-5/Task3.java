public class Task3 {
    public static void main(String[] args) {

        String line = "algorithm";

        System.out.println("First Single Letter: " + firstSingleLetter(line.toLowerCase()));
    }

    private static boolean firstSingleLetter(String text) {

        int count = 0;

        int sign = text.charAt(0);

        for(int i=1; i<text.length(); i++) {
            if(sign == text.charAt(i)){
                count++;
            }
        }
        if(count == 0){
            return true;
        }

        return false;
    }
}
