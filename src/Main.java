public class Main {
    public static void main(String[] args) {

        int mult = 1;
        int mult2 = 1;
        int[] arr = {2, 3, 4, 5};

// for loop solution
        for (int i = 0; i < arr.length; i++) {
            mult *= arr[i];
        }
        System.out.println("mult is " + mult);

// conditional loop solution
        int flag = 0;
        while (true) {
            if (flag < arr.length) {
                mult2 *= arr[flag];
                flag++;
                continue;
            }
            break;
        }
        System.out.println("mult2 is " + mult2);

    }
}
