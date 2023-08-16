package chainOfResponsability;

public abstract class ProcessStep {
    private ProcessStep nextStep;

    public void setNextStep(ProcessStep nextStep) {
        this.nextStep = nextStep;
    }

    public abstract StepContext execute(StepContext context);

    public StepContext next(StepContext context) {
        return this.nextStep != null ? this.nextStep.execute(context) : context;
    }

}
