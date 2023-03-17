package hw2;

public class Task5 {
    public static void main(String[] args) {
        int min = 25;
        int max = 200;
        int minRandom = 10;
        int maxRandom = 500;
        int randomInt = minRandom + (int) (Math.random() * (maxRandom - minRandom + 1));

        if (randomInt > min && randomInt < max) {
            System.out.println("Interval (" + min + ";" + max + ") contains randomly generated " + randomInt);
        } else {
            System.out.println("Interval (" + min + ";" + max + ") does not contain randomly generated " + randomInt);
        }
    }
}
