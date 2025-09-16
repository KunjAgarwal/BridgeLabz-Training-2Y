class PalindromeChecker {
    String text;
    PalindromeChecker(String t) {
        text = t;
    }

    boolean isPalindrome() {
        int left = 0;
        int right = text.length() - 1;
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    void displayResult() {
        System.out.println("Text: " + text);
        if (isPalindrome()) {
            System.out.println("Result: The text is a palindrome.");
        } else {
            System.out.println("Result: The text is NOT a palindrome.");
        }
    }
}

public class palindrome {
    public static void main(String[] args) {
        PalindromeChecker checker1 = new PalindromeChecker("madam");
        checker1.displayResult();

        PalindromeChecker checker2 = new PalindromeChecker("cloud");
        checker2.displayResult();
    }
}
