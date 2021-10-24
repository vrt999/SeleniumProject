package Practice; 

//MyThread extending Thread 
class MyThread extends Thread 
{ 
 @Override
public void run() 
 { 		
	 try {
		Thread.sleep(300);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 System.out.println("current Thread from child: " + Thread.currentThread().getName());
	 
//     for (int i=0; i<5 ; i++) 
//         System.out.println(Thread.currentThread().getName() 
//                             + " in control"); 
} 
} 

//Driver Class 
public class ThreadDemo 
{ 
 public static void main(String[]args) 
 { 
     MyThread t = new MyThread(); 
     t.start();
     System.out.println("State after Thread t start: " + Thread.currentThread().getState());
     try {
		Thread.sleep(200);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     System.out.println("current Thread from main: " + Thread.currentThread().getName());
     System.out.println("State after sleep: " + Thread.currentThread().getState());

//     for (int i=0; i<5; i++) 
//     { 
//         // Control passes to child thread 
//         Thread.yield(); 
//
//         // After execution of child Thread 
//         // main thread takes over 
//         System.out.println(Thread.currentThread().getName() 
//                             + " in control"); 
//     } 
 } 
} 


