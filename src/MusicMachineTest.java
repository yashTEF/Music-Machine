import java.util.Scanner;

public class MusicMachineTest {
	static String USER_NAME;
	
	public static void main(String args[]) {
		System.out.println("Enter a User Name Here :");
		Scanner sc = new Scanner(System.in);
		USER_NAME = sc.next();
	 Thread t1 = new Thread(new Runnable() {
         public void run() {
            MusicMachineServer.main(args);
         }
      });
      t1.start();
      Thread t2 = new Thread(new Runnable() {
         public void run() {
            MusicMachine.main(new String[] { USER_NAME });
         }
      });
      t2.start();

      try {
    	  Thread.sleep(50000000);
    	  } catch(Exception x){}
      System.exit(0);
	}
}
