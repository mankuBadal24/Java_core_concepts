//THIS PROGRAM IS TO SHOW MULTIPLE THREAD IMPLEMENTATION

// class Th extends Thread {
//     public void run() {
//         for (int i = 1; i <= 100; i++) {
//             System.out.println("Mayank");
//             try {
//                 Thread.sleep(10); // THIS STATEMENT HERE DEFINE THE DELAY WHICH IS VERY IMPORTANT FOR OUR
//                                   // EXPECTING OUTPUT
//             } catch (InterruptedException e) { e.printStackTrace();}
//         }
//     }
// }

// class Ht extends Thread {
//     public void run() {
//         for (int i = 1; i <= 100; i++) {
//             System.out.println("Motta");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }

//     }
// }

// public class Concep_Thread {
//     public static void main(String args[]) {
//         Th obj1 = new Th();
//         Ht obj2 = new Ht();

//         // obj2.setPriority(Thread.MAX_PRIORITY); //this line is to set the priority

//         obj1.start();
//         try {
//             Thread.sleep(4);
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }
//         obj2.start();
//     }
// }


// THE SAME CODE IS WRITTEN WITH LESS LINES BY USING LAMBDA EXPRESSIONS 
// class Th implements Runnable
// {
//     public void run(){
//         for(int i =1 ; i<=5 ; i++){
//             System.out.println("Mayank");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {  e.printStackTrace();}
//         }
//     }
// }

// class Ht implements Runnable{
//     public void run(){
//         for(int i =1 ; i<=5 ; i++){
//             System.out.println("Motta");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {  e.printStackTrace();}
//         }
//     }
// }
class Counter{
    int count;
    public void increment(){
        count++;
    }
}

public class Concep_Thread{
    public static void main(String args[]) throws InterruptedException{
        Runnable obj1 = () -> {
                for(int i=1;i<=5;i++){
                    System.out.println("Hi");
                
            }
        };
    
        
        Runnable obj2 = ()-> {
                for(int i=1;i<=5;i++){
                    System.out.println("Hello");
               
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
 
        t1.join();
        t1.join();
        
    }
}