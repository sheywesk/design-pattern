package chainOfResponsability;

public class SearchDatabase extends ProcessStep {

    @Override
    public StepContext execute(StepContext context) {
        System.out.println("######## Executing search database #########");
        System.out.println("user: " + context.get("user"));
        System.out.println("result last step: " + context.getResult());
        context.setResult("fake database result");
        context.put("user", "database user");
        return next(context);
    }

}
