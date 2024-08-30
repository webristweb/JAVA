public class SwitchCase {
    public static void main(String[] args) {
        char ch = 'z';
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " Vowel");
                break;
            default:
                System.out.println(ch + " Not a Vowel");
        }
    }
}