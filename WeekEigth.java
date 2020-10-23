import java.util.Scanner;
public class WeekEight {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int caseNum = -1;
while (caseNum != 0) {
System.out.print("Please enter case number: ");
caseNum = sc.nextInt();
if (caseNum == 1) {
System.out.print("Please enter a string value: ");
String original = sc.next();
String reverse = "";
int length = original.length();
for (int i = length - 1; i >= 0; i--) reverse = reverse + original.charAt(i);
if (original.equals(reverse)) {
System.out.println("True!");
System.out.println(original + " is a palindrome.\n");
} else {
System.out.println("False!");
System.out.println(original + " string isn't a palindrome.\n");
}
}
else if (caseNum == 2) {
int k;
System.out.print("Please enter an integer value: ");
int length = sc.nextInt();
for (int i = length; i >= 1; i--) {
for (int j = length; j > i; j--) {
System.out.print(" ");
}
for (k = 1; k <= i; k++) {
System.out.print("* ");
}
System.out.println();
}
System.out.println("\n");
}
else if (caseNum == 0) {
System.out.println("Exit!");
}
else {
System.out.println("Wrong input!\n");
}
}
}
}