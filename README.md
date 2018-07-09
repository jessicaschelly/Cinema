# Cinema

Implementar um sistema orientado a objetos em Java, utilizando interface gráfica, que simule a venda de ingressos de um cinema.

ESCOPO DO DESENVOLVIMENTO:

O sistema possibilita a compra de ingressos de um cinema e o cadastro de filmes e sessões apenas por funcionários. Os ingressos deverão ser vendidos em dois "guichês" que irão se comunicar com o sistema central do cinema para retornar as sessões disponíveis, assim como o valor dos ingressos e mais detalhes sobre os filmes. 

Ele pode ser utilizado pelo cliente e por funcionários apenas a partir de uma identificação, podendo cadastrar filmes com detalhes de duração, sinopse e gênero. Também podendo cadastrar sessões, contendo o filme, horário e tipo de exibição (2D, 3D, dublado, legendado).

Deverá ser possível na listagem dos filmes mostrar suas disponibilidades (dublado – legendado, 2D / 3D).

Com os guichês operando, o sistema permite organizar uma grade de horários com os próximos filmes disponíveis. 

O sistema é utilizado do ponto de vista do comprador, com escolha de filme, horário, poltrona e tipo de ingresso (comum ou meia-entrada) e imprimir todas as escolhas para confirmação.

Cada ingresso receberá um número para identificação, em contagem.

Ainda há uma função para somar e exibir o valor arrecadado pelos dois guichês e fazer histórico de todos os ingressos que já foram vendidos.

RESTRIÇÕES DE ESCOPO:
Somente será tratado a venda dos ingressos, interação entre funcionário e cliente com o sistema.

RESTRIÇÕES:
1. Não permitir a venda de ingressos para sessões que já estão em exibição há mais de 10 min.
2. Não permitir a venda de ingresso caso a sessão já esteja lotada.
3. Não é possível escolher locais que já estão ocupados.
4. O Cliente não poderá ver opções que são restritas à funcionários.
5. A idade do comprador tem que ser compatível com a classificação indicatória do filme.
6. Não será permitido cadastrar sessões em uma sala indisponível, ou seja, com filme em exibição ou esteja no período de limpeza da sala (15m após o término do filme).
