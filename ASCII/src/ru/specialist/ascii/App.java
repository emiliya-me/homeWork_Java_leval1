package ru.specialist.ascii;

public class App {

	public static void main(String[] args) {
		
        System.out.print("    ");
        for(int i = 0; i <= 0xF; i++) {
            System.out.printf(" %2X", i);
        }
        System.out.println();
        

        for (int row = 0; row <= 0xF; row++) {
            System.out.printf("%2X", row);
            
            for (int col = 0; col <= 0xF; col++) {
                int code = (col << 4) + row;
                char ch = (char)code;
                
                
                if (code < 0x20 || code == 0x7F) {
                    ch = ' ';
                } else if (code == 0x20) {
                    ch = ' ';
                } else if (code > 0x7F && code < 0xA0) {
                    ch = ' '; 
                }
                
                System.out.printf(" %2c", ch);
            }
            System.out.println();
        }
    }	
	

}
