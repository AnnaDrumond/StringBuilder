# StringBuilder
Exercicio usando String Builder - aula 120 - pdf 07 - Udemy

Classe StringBuilder
A classe StringBuilder faz parte do pacote java.lang. Essa classe permite criar e manipular dados de Strings dinamicamente, ou seja, podem criar variáveis de String modificáveis.

O significado da classe StringBuilder não tem o mesmo sentido que classe String. Existe uma diferença entre essas classes, veja algumas características.

Características StringBuilder:

Armazena caracteres especificados pela sua capacidade, caso ela seja excedida, é aumentada para acomodar os caracteres adicionais;
Não precisa alocar novos objetos quando realiza uma concatenação;
Não são sincronizadas;
Não são seguras para threads;

Uma vantagem sobre a classe String é a concatenação de strings. Pois quando concatena strings com StringBuilder é invocado o método append. Esse método aloca novas strings concatenadas para o mesmo objeto, ou seja, cada vez que concatena strings não são criadas cópias dos objetos como é realizado pelo método concat da classe String, contribuindo para um melhor desempenho do sistema.

Fonte: https://www.devmedia.com.br/a-classe-stringbuilder-em-java/25609
