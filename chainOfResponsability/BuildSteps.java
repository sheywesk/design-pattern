package chainOfResponsability;

public class BuildSteps {
    public static ProcessStep steps = buildChain(new SearchCache(),
            new SearchDatabase(),
            new SearchWeb());

    public static ProcessStep stepsWithoutDatabase = buildChain(new SearchCache(),
            new SearchWeb());
    private static ProcessStep buildChain(ProcessStep... processSteps) {
        if (processSteps.length < 2)
            throw new UnsupportedOperationException("Não é possivel iniciar com menos de 2 elementos");

        for (int index = 0; index < processSteps.length - 1; index++) {
            processSteps[index].setNextStep(processSteps[index + 1]);
        }
        
        return processSteps[0];
    }

}
