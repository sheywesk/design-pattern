package chainOfResponsability;

public class Client {
    public static void main(String[] args) {
        StepContext context = new StepContext();
        BuildSteps.steps.execute(context);

        System.out.println("\n\t#### steps sem database ####\n");
        StepContext context2 = new StepContext();
        BuildSteps.stepsWithoutDatabase.execute(context2);
    }
}
