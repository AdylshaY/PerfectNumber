public class Main {

    public static void main(String[] args) {

        int number = 28;
        int sum = 0;

        for (int i=1; i<number; i++){
            int remaining = number % i;
            if(remaining == 0){
                sum = sum + i;
            }
        }
        if (sum == number){
            System.out.println(number + " is perfect number.");
        } else {
            System.out.println(number + " isn't perfect number.");
        }
    }
}
