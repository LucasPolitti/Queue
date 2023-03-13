# Queue
##O que esse código faz?

O código apresenta uma classe chamada Queue, que é uma implementação de uma fila. A fila é uma estrutura de dados que armazena elementos em uma ordem específica, em que o primeiro elemento a ser adicionado é o primeiro a ser removido (FIFO - First In, First Out).

Dentro da classe Queue, existem duas variáveis privadas: um array de caracteres chamado q, que será usado para armazenar os elementos na fila, e duas variáveis inteiras putloc e getloc, que indicam a posição em que o próximo elemento será adicionado ou removido da fila.

O construtor da classe Queue recebe um tamanho como parâmetro e cria um array de caracteres com o tamanho especificado. Ele também define putloc e getloc como 0, indicando que não há elementos na fila no início.

A classe Queue também possui dois métodos: put e get. O método put é usado para adicionar um elemento à fila. Ele recebe um caractere como parâmetro e verifica se a fila já está cheia (ou seja, se putloc é igual ao tamanho do array). Se a fila já estiver cheia, o método exibe uma mensagem informando que a fila está cheia e retorna sem fazer nada. Caso contrário, o método adiciona o caractere ao array q e incrementa putloc.

O método get é usado para remover e retornar o próximo elemento da fila. Ele verifica se a fila está vazia (ou seja, se getloc é igual a putloc). Se a fila estiver vazia, o método exibe uma mensagem informando que a fila está vazia e retorna um caractere nulo (representado por (char) 0). Caso contrário, o método retorna o próximo elemento do array q e incrementa getloc.

A classe QDemo é usada para demonstrar o funcionamento da fila. No método main, criamos uma nova instância da classe Queue com tamanho 10 e armazenamos essa instância na variável q. Em seguida, adicionamos três elementos (A, B e C) à fila usando o método put. Por fim, usamos um loop para imprimir o conteúdo da fila usando o método get. O resultado esperado é "ABC".
