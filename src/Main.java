import vlakna.IncrementThread;
import vlakna.MojeCislo;
import vlakna.MyRunnable;

public class Main {
    public static void main(String[] args) {

        try{
           for(int i = 0; i < 10; i++){
               System.out.print("*");
               Thread.sleep(500);
        }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        Thread vlakno = new Thread(new MyRunnable());
        Thread vlakno2 = new Thread(new MyRunnable(){
            @Override
            public void run(){
                for(char znak = 'a';
                    znak <= 'z'; znak++){
                    System.out.print(znak+" ");
                }
        }
        });
           vlakno.start();
           vlakno2.start();
         /*
        try{
           vlakno.join();
           vlakno2.join();
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }*/
        MojeCislo cisilko = new MojeCislo();
        IncrementThread thread1 = new IncrementThread(cisilko);
        thread1.start();

        try{
            thread1.join();
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

    }
}