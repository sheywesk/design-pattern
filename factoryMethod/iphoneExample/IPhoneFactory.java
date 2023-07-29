package factoryMethod.iphoneExample;

/**
 * Classe que representa o Creator do padrão.
 */
public class IPhoneFactory {
    // Transformar os parâmetros em enum é uma boa prática para
    // tornar o código mais seguro.
    public static IPhone create(String generation, String level) {
        IPhone device = null;
        // É possível evoluir as criações para classes separadas
        // deixando a lógica aqui mais simples e encapsular processos
        // de criação mais complexo, e assim implementar o padrão na forma
        // mais completa contendo os ConcreteCreator descrido no readme.
        // Claramente que a melhor forma de implementação depende do problema que 
        // será resolvido
        if ("X".equals(generation)) {
            if ("Pro".equals(level)) {
                device = new IPhone11Pro();
            } else if ("Max".equals(level)) {
                device = new IPhone11ProMax();
            }

        } else if ("11".equals(generation)) {
            if ("Pro".equals(level)) {
                device = new IPhoneXPro();
            } else if ("Max".equals(level)) {
                device = new IPhoneXProMax();
            }
        }
        return device;
    }

}
