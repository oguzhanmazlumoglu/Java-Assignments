	import java.util.Scanner;
	public class WeekNine {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int caseNum = -1;
	while (caseNum != 0) {
	System.out.print("Please enter case number: ");
	caseNum = sc.nextInt();
	if (caseNum == 1) {
	System.out.print("Enter a value: ");
	String str = sc.next();
	double j = 0;
	for (int i = 0; i < str.length(); i++) {
	if (str.charAt(i) == '1') {
	j = j + Math.pow(2, str.length() - 1 -
	i);
	}
	}
	System.out.println("Binary: " + str + "\nDecimal:
	" +((int)j)+"\n");
	} else if (caseNum == 2) {
	System.out.println("Please enter a value to
	concatenate words.\nIf you want to stop enter ! character.");
	int i = 1;
	System.out.print("Enter word " + i +": ");
	String concatenate = sc.next();
	String newSentence = "";
	while (!concatenate.equals("!")) {
	i++;
	newSentence += " " + concatenate;
	System.out.print("Enter word " + i + ": ");
	concatenate = sc.next();
	}
	newSentence= newSentence.replace("!", "");
	System.out.println("You constructed a sentence
	with "+(i-1) +" words:"
	+ newSentence +"\n");
	} else if (caseNum == 0) {
	System.out.print("Exit!");
	} else {
	System.out.println("Wrong input!\n");
	}
	}
	}
	}