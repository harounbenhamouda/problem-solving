package algo;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumberUsingQueue {
    public static String[] generateBinaryNumber(int number) {
        String[] newArray = new String[number];
        Queue<String> binary = new LinkedList<>();
        binary.offer("1");

        for (int i = 0; i < number; i++) {
            newArray[i] = binary.poll();
            String N1 = newArray[i] + "0";
            String N2 = newArray[i] + "1";
            binary.offer(N1);
            binary.offer(N2);
        }

        return newArray;
    }

    public static void main(String[] args) {
        int number = 5; 
        String[] binaryNumbers = generateBinaryNumber(number);

        for (String binaryNumber : binaryNumbers) {
            System.out.println(binaryNumber);
        }
    }
}

