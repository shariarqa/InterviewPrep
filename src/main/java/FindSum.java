public class FindSum {

    public static void main(String[] args) {
        int a = 678;
        int sum = 0;

        while (a>0){
            int rem = a %10;

            sum += rem;
            a = a/10;
            System.out.println(a);
        }


        System.out.println(sum);
    }
}
