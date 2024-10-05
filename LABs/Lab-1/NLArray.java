public class NLArray {
    public static void main(String[] args) {

        Character[][] arr = {
                { 'a', 'b', 'c', 'd' },
                { 'e', 'f', 'g', 'h' },
                { 'i', 'j', 'k', 'l' },
                { 'm', 'n', 'o', 'q' }
        };

        System.out.println("Outer Boundaries:");
        extractBoundaries(arr);
        
        System.out.println("Inner Part:");
        cropCenterPart(arr);
    }

    public static void extractBoundaries(Character[][] arr) {
        // Printing 1st row, 1st col, last row, last col
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (i == 0 || i == arr.length - 1)
                    System.out.print(arr[i][j] + " ");
                else if ((i > 0 || i < arr.length - 1) && (j == 0 || j == arr[i].length - 1))
                    System.out.print(arr[i][j] + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void cropCenterPart(Character[][] arr) {
        // Printing center of the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (i == 0 || i == arr.length - 1)
                    System.out.print("  ");
                else if ((i > 0 || i < arr.length - 1) && (j == 0 || j == arr[i].length - 1))
                    System.out.print("  ");
                else
                    System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
