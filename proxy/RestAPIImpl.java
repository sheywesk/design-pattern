package proxy;

public class RestAPIImpl implements RestAPI {

    public String call() {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "OK";
    }
}
