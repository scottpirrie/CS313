package drivers;

import Runnables.WithdrawRunnable;
import model.AccountADT;
import model.BasicAccount;
import model.Customer;

/**
 * TODO
 * Finish other account classes
 * Work on employee and customer selecting account they want
 * Making sure accounts are unique and we can get them
 * Finish Runnable Classes
 * Work on driver(s)
 * Work towards synchronization
 *
 */

public class TestDriverOne{
    public static void main(String[] args){

        //MODEL CLASSES
        Customer a = new Customer("STEVE");
        AccountADT basic = new BasicAccount(1,500);
        System.out.println(basic.getBalance());

        //RUNNABLES
        WithdrawRunnable r1 = new WithdrawRunnable(basic, 400);

        //THREADS
        Thread t1 = new Thread(r1);
        t1.start();

        //thread waits printing happens first as the main thread might output before the runnable thread resumes control

    }
}
