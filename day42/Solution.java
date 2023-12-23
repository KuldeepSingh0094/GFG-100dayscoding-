import java.util.*;

class CheckBit {
    static boolean checkKthBit(int n, int k) {
        int bit = n & (1 << k);
        if (bit == 0) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // Example usage
        int number = 23; // Sample number
        int position = 3; // Position of the bit to check

        boolean isSet = checkKthBit(number, position);

        if (isSet) {
            System.out.println("The " + position + "th bit is set (1) in " + number);
        } else {
            System.out.println("The " + position + "th bit is not set (0) in " + number);
        }
    }
}
