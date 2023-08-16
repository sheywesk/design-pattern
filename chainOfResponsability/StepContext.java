package chainOfResponsability;

import java.util.HashMap;
import java.util.Map;

public class StepContext {
    private Map<String, Object> context;
    private Object result;

    public StepContext() { 
        this.context = new HashMap<>(0);
    }

    public Object get(String key) {
        return this.context.get(key);
    }

    public void put(String key, Object value) {
        this.context.put(key, value);
    }

    public Object getResult() {
        return this.result;
    }

    public void setResult(Object object) {
        this.result = object;
    }
}
