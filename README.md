# Padrões criacionais
Tratam da criação do objeto de forma que desacopla e retira a responsabilidade do cliente lidar com as criações.
## design-pattern
Repositório para estudo dos design pattern com java.

## factory method
Existem algumas formas de fazer o padrão de criação Factory. Aqui foram implementadas algumas possibilidades.

![Alt text](factory_method.png)

## abstract factory
A ideia principal desse pattern é introduzir uma família de elementos dentro de um contexto. Por exemplo: se pensarmos em que o contexto é uma 'sala de jantar' poderíamos pensar nos elementos de mesma familia como mesas e cadeiras desse contexto de sala de jantar. Dessa forma eu posso criar uma AbstractFactory para sala de jantar que irá criar as mesas e cadeiras da forma desejada, como uma mesa moderna e cadeiras coloniais. 

![Alt text](abstract_factory.png)

# Padrões Estruturais
Os padrões estruturais se preocupa com a forma em que classes e objetos são compostos para formar estruturas maiores.

## Adapter
Converte a interface de uma classe em outra interface em que o cliente espera, ou seja, permite a comunição entre 2 classes incompativeis.