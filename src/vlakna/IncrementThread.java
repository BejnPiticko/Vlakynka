package vlakna;

public class IncrementThread extends Thread{
    private MojeCislo cislo;
    public IncrementThread(MojeCislo cislo){
        this.cislo = cislo;
    }
    public void run(){
        for(int i = 0; i < 100; i++){
            cislo.increment();
        }
    }
}
