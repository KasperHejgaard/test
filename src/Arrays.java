public class Arrays {
    public static void main(String[] args) {
        int[] arr = new int[]{38, 0, 0, 0, 0, 0, 0, 117};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        String[] arr2 = new String[]{"Hej", "med", "dig"};
        for (String i : arr2) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        double[] arr3 = new double[]{3.4, 2.5, 1.2, 6.7};
        for (double i = 0; i < 1; i++) {
            System.out.println(arr3[2]);
            System.out.println(arr3.length);
        }
    }
}
