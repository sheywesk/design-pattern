package chainOfResponsability;

public class SearchCache extends ProcessStep {

    @Override
    public StepContext execute(StepContext context) {
        context.put("user", "cache user");
        System.out.println("######## Executing search cache #########");
        System.out.println("user: " + context.get("user"));
        System.out.println("result last step: " + context.getResult());
        context.setResult("fake cache result");
        return next(context);
    }

}
