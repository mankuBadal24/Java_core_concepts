package UserInputNotes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.util.Scanner;

public class Concep_TakeInput {
    public static void main(String args[]) throws IOException /*throws IOException*/ {
        int num =0 ;
        System.out.println(" enter the no. ");
        // int num = System.in.read(); // the work of read function is to provide THE
        // ASCII VALUE THE GIVEN DATA
        // System.out.println(num -48);

        // THIS IS THE OLD METHOD OF TAKING INPUT IN JAVA
        // InputStreamReader in = new InputStreamReader(System.in); // HERE WE USE INBUILT FUNCTION FOR TAKING INPUT WHICH
        //                                                          // IS BELONGS TO SYSTEM CLASS IN THIS STATEMENT WE
        //                                                          // CREATE THE OBJECT OF INBUILT FUNCTION
        // BufferedReader bf = new BufferedReader(in); // HERE WE CREATE OBJECT OF BUFFERREADER WHUCH IS INBUILT FUNCTION
        //                                             // FOR TAKING INPUT FROM USER
        // int num = Integer.parseInt(bf.readLine());  //IN THIS LINE WE STORE THE VALUE WHICH IS GIVEN BY USER 
                                                       //READLINE IS THE FUNCTION WHICH TAKE A STRING. FURTHER THE PARSE INT METHOD CONVERT INTO INT 
        // br.close();  //  MEANING OF THIS LINE IS WHEN WE USE br CLASS RESOURCES WE HAVE TO CLOSE IT THATS WHY THIS LINE 
        
        // CURRENTLY BEST METHOD OF TAKING INPUT FROM USER IS
        // Scanner m = new Scanner(System.in);
        // int num = m.nextInt();
        //    System.out.println(num);
        
        // try
        // {
        //     InputStreamReader in = new InputStreamReader(System.in);
        //       br = new BufferedReader(in);
        //      num = Integer.parseInt(br.readLine());
        //      System.out.println(num);
            
        // }
        // finally{
        //      br.close();
        // }

        //THERE IS A SHORTCUT METHOD ALSO WHERE WE DONT WANT TO WRITE SO MUCH CODE THE WAY IS HERE
        //THIS CONCEPT IS KNPWN AS TRY WITH RESOURCES AND ADVANTAGE IS WE DONT NEED TO CLOSE THE RESOURCES
         try( BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
         {
             num = Integer.parseInt(br.readLine());
             System.out.println(num);
    }
}
}
