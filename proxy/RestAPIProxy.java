package proxy;

public class RestAPIProxy implements RestAPI {
    private RestAPI restAPI;
    private static String cache;

    public RestAPIProxy(RestAPI restAPI) {
        this.restAPI = restAPI;
    }

    @Override
    public String call() {
        if(cache != null) return cache;
        cache = restAPI.call();
        return cache;
    }

}
