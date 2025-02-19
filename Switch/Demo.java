import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character to check whether it is Vowel or Not  : ");
        char ch = sc.next().charAt(0);
        sc.close();
        switch (ch) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U': {
                System.out.print("\n" + ch + " is  a Vowel.\n\n");
            }
                break;
            default: {
                System.out.println("\n" + ch + " is not a Vowel.\n");
            }

        }
    }
}