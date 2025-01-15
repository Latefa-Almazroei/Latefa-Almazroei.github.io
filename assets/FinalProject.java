//Latefa Mohammed Almazroei - 1093635
package finalproject;
import java.util.Scanner;
public class FinalProject {
public static String RailFence(String word){//second method
        
        //since its constant the depth is 4 i will initialize 4 empty rows
            String firstRow = "";
            String secondRow = "";
            String ThirdRow = "";
            String FourthRow = "";
        int rowOnNow = 0; // Start at the top row
        boolean moveDown = true; // make a boolean for moving down for direction purposes
       
        // we want to see each letter so we can distribute them
        for (int i = 0; i < word.length(); i++) {//the word length is the numbers of columns and repitition
            char Char = word.charAt(i);

            // we will put each character in a row orderly
            if (rowOnNow == 0) {
                firstRow += Char;
            } else if (rowOnNow == 1) {
                secondRow += Char;
            } else if (rowOnNow == 2) {
                ThirdRow += Char;
            } else if (rowOnNow == 3) {
                FourthRow += Char;
            }

           //to change dirction for the zig zag pattern we need to move down in first row and move up when we hit fourth row
            if (moveDown) {//if going down is true we add to row and are going down
                rowOnNow++; 
                if (rowOnNow == 3) { // when we hit the last row we want to change direction
                    moveDown = false;//make the boolean false to switch
                }
            } else {
                rowOnNow--; //if its false we start going down and decreasing row
                if (rowOnNow == 0) { //when we hit first row we want to go down
                    moveDown = true;
                }
            }
        }

        //to encrypt after the letters are scattered we read each row at a time and combine
        return firstRow + secondRow + ThirdRow + FourthRow;
    }
    
    
    public static String cipher(String word){//first method
       String encrypted = "";//initialize an empty string
       int length = word.length();//find length to know repitition

         for (int i =0;i<length;i++){
             
             char letter = word.charAt(i);//look at each character
             //make restrictions that they can only input letters and space
             if (!(letter>='a'&&letter<='z'|| letter>='A'&&letter<='Z'||letter==' ')){
               System.out.println("you have entered an invalid input (not in the range)");
             return"";}
             int index = 0;//initialize index so we can add
             if (letter>='a' && letter<='z'){
                //put index to each letter
                 if(letter=='a') index = 0;
                 if(letter=='b') index = 1;
                 if(letter=='c') index = 2;
                 if(letter=='d') index = 3;
                 if(letter=='e') index = 4;
                 if(letter=='f') index = 5;
                 if(letter=='g') index = 6;
                 if(letter=='h') index = 7;
                 if(letter=='i') index = 8;
                 if(letter=='j') index = 9;
                 if(letter=='k') index = 10;
                 if(letter=='l') index = 11;
                 if(letter=='m') index = 12;
                 if(letter=='n') index = 13;
                 if(letter=='o') index = 14;
                 if(letter=='p') index = 15;
                 if(letter=='q') index = 16;
                 if(letter=='r') index = 17;
                 if(letter=='s') index = 18;
                 if(letter=='t') index = 19;
                 if(letter=='u') index = 20;
                 if(letter=='v') index = 21;
                 if(letter=='w') index = 22;
                 if(letter=='x') index = 23;
                 if(letter=='y') index = 24;
                 if(letter=='z') index = 25;
                 //do the math to encrypt add 3 to the index and find the mod then we add it to index of a to find the new letter
                 index = (index+3)%26; 
                 char afterShift = (char)('a'+index);
                 encrypted+=afterShift;
             }
             //do same for all capital letters

             else if (letter >='A'&& letter<='Z'){
                 if(letter=='A') index = 0;
                 if(letter=='B') index = 1;
                 if(letter=='C') index = 2;
                 if(letter=='D') index = 3;
                 if(letter=='E') index = 4;
                 if(letter=='F') index = 5;
                 if(letter=='G') index = 6;
                 if(letter=='H') index = 7;
                 if(letter=='I') index = 8;
                 if(letter=='J') index = 9;
                 if(letter=='K') index = 10;
                 if(letter=='L') index = 11;
                 if(letter=='M') index = 12;
                 if(letter=='N') index = 13;
                 if(letter=='O') index = 14;
                 if(letter=='P') index = 15;
                 if(letter=='Q') index = 16;
                 if(letter=='R') index = 17;
                 if(letter=='S') index = 18;
                 if(letter=='T') index = 19;
                 if(letter=='U') index = 20;
                 if(letter=='V') index = 21;
                 if(letter=='W') index = 22;
                 if(letter=='X') index = 23;
                 if(letter=='Y') index = 24;
                 if(letter=='Z') index = 25;
                 
                 index = (index+3)%26; 
                 char afterShift = (char)('A'+index);
                 encrypted+=afterShift;
                 
             }//deal with the space to keep it as is
             else if (letter ==' '){
                encrypted +=" ";
}
         } 
        return encrypted;         
   }
    public static void main (String[]args){
        System.out.println("choose encryption method");
        System.out.println("--- 1. first method (Caesar cipher) ---");
        System.out.println("--- 2. second method (Rail Fence)   ---");
        System.out.print("choice: ");
        Scanner input = new Scanner(System.in);//take choice from user
        int choice = 0;
        choice=input.nextInt();
        input.nextLine();
        //make a swicth case for each method
        switch (choice){
            case 1:
               System.out.print("enter what you want to encrypt: ");
               String pass1 = input.nextLine();
               String cipherEnc = cipher(pass1);
               if(cipherEnc !=""){//to get a better output we only continue if the method doesnt return the invalid option
               System.out.println("encrypted text is: "+ cipherEnc);}
               break;
                //first method
            case 2:
                System.out.print("enter what you want to encrypt: ");
               String pass2 = input.nextLine();
              
               System.out.println("encrypted text is: "+RailFence(pass2));
               break;
                //second method
            default:
                System.out.println("invalid choice"); 
        }
        
}
    }

/* plan:
    case 1:
    first encryption method (cipher)
    case 2:
    second encryption method
    
    */