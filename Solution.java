import java.util.*;

public class Solution {
	public static void main(String[] args) {
    	
    	Scanner scan = new Scanner(System.in);
    	String prodID = scan.nextLine();
    	String isbn = prodID.substring(3, 12);
    	int errorBit = 0;
    	int errorBitSum = 0;
    	String fullISBN;
    	
    	for (int i=0; i<isbn.length(); i++) {
    		errorBitSum = errorBitSum + Integer.parseInt(isbn.substring(i, i+1)) * (10 - i);
    	}
    	
    	for (int j=0; j<=10; j++) {
    		if ((errorBitSum + j) % 11 == 0) {
    			errorBit = j;
    			continue;
    		}
    	}
    	
    	if (errorBit == 10) {
    		fullISBN = isbn.toString() + "X";
    	}
    	else {
    		fullISBN = isbn.toString() + String.valueOf(errorBit);
    	}

    	System.out.println(fullISBN);    	
    	scan.close();
    }
}
