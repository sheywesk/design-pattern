package chainOfResponsability;

public class SearchWeb extends ProcessStep {

    @Override
    public StepContext execute(StepContext context) {
        System.out.println("######## Executing search web #########");
        System.out.println("user: " + context.get("user"));
        System.out.println("result last step: " + context.getResult());
        context.setResult("fake web result");
        return next(context);
    }

}
