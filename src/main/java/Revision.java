public class Revision {
    public static void main(String[] args) {
        Revision palindrome = new Revision();
        palindrome.reversPalindrome(" ", "racecar");

    }

    public void reversPalindrome(String result, String palindrome) {

    {
        System.out.println(String.format("the input string is %s", palindrome));
        int lastLetter = palindrome.length()-1;
        {
            for (int i = lastLetter; i>=0; i--)
                result = result + palindrome.charAt(i);
        }
        System.out.println(result);

}

}

}
