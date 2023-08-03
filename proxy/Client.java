package proxy;

public class Client {
    public static void main(String[] args) {
        RestAPI restAPI = new RestAPIImpl();
        RestAPI restAPIProxy = new RestAPIProxy(restAPI);
    }
}
