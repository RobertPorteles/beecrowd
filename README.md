Problemas de Lógica de programação e POO;

1- Numerão:
Dependendo das aplicações científicas, um número com 1000 casas é insuficiente (por
exemplo para armazenar a massa de um planeta ou a energia dele em órbita).
Para isso, os cientistas do ITO (Institute of Tecnology at Oz-asco) decidiram contratar
você para implementar uma classe Java chamada NumeroGrande, capaz de ser criado
com uma precisão definida pelo usuário. Exemplo:
NumeroGrande ng = new NumeroGrande(1000);
Significa que o usuário cria um número inteiro grande com 1000 casas.
Para que seja possível implementar esse número, ele deve receber uma String como
valor (e obviamente essa String deve ser decodificada para que o número possa ser
manipulado. Exemplo:
ng.setValorString(“1827232318390128309128301938102938129038”);
Além disso, na operação de soma (a única que ele implementa), um número grande
recebe como argumento outro número grande para ser calculado, como no exemplo
abaixo.
NumeroGrande n3 = n1.soma(n2); // n3 = n1 + n2;
A implementação da soma deve ser feita da seguinte maneira (vamos somar 350 com
971)
