public class MyRunnableMT implements Runnable{

    private final String text;

    MyRunnableMT(String text){
        this.text = text;
    }

    @Override
    public void run(){
        for (int i = 1; i<=5; i++){
            try {
                Thread.sleep(1000);
                System.out.println(text + " " + i);
            } catch (InterruptedException e) {
                System.out.println("thread was interrupted");
            }
        }
    }
}
