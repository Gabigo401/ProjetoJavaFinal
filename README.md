Este relatório descreve o desenvolvimento de um sistema de pedidos de comidas e bebidas, utilizando JFrame como interface gráfica e PostgreSQL(Pgadmin)
como banco de dados. O objetivo principal do projeto é permitir que o usuário faça o cadastro, login, visualizar as opções de comidas e bebidas e adicione
os produtos em um carrinho de pedidos e finalize os pedidos com nota de avaliação, e visualizar seus pedidos finalizados.
O projeto foi feito seguindo o padrão MVC (Model–View–Controller), para garantir uma melhor organização, manutenção e separação entre a lógica, interface e dados.
O sistema foi dividido em três camadas principais:
 1 - Model (Modelo) Contém as classes responsáveis por representar os dados e regras do projeto
Usuários – representa os usuários cadastrados.
Alimento – classe abstrata para comidas e bebidas.
Comida e Bebida – especializações de Alimento e as bebidas aplicam taxa de 10% se forem alcoólicas.
Pedido – representa um pedido realizado, com atributos como CPF do usuário, total,   avaliação e status.


<img width="788" height="425" alt="image" src="https://github.com/user-attachments/assets/ea4a89d8-abed-4caf-af75-7cacdde0f900" />


View (Visão) Contém as interfaces gráficas (JFrame):
Login – tela de login do usuário.
TelaComidas – tela principal com listagem das comidas/bebidas e campo de busca.
Carrinho – mostra os pedidos em andamento do usuário logado.
FinalizarPedidos – exibe os pedidos já finalizados.
Cadastrar - tela para o cadastro
Cada tela interage apenas com o Controller, mantendo o MVC respeitado.


<img width="742" height="299" alt="image" src="https://github.com/user-attachments/assets/edf12f33-247d-4b4e-98fe-aa13ab750f92" />


Controller (Controle) Responsável por conectar a interface (View) com as regras e o banco de dados:
PedidoControle – trata ações como adicionar pedidos, buscar comidas, listar carrinho
ContrododoLogin – valida o login do usuário e passa o CPF logado para as próximas telas.
FinalizarController – atualiza status do pedido e grava a nota de avaliação.
CarrinhoControle - mostra os pedidos feito pelo usuário e permite excluir pedidos atraves do id
ControdoCadastro - faz o registro das informações do usuario e salva no banco de dados


<img width="540" height="352" alt="image" src="https://github.com/user-attachments/assets/d9f209ae-5578-45fc-9e8b-1b914f5c651d" />

DAO -  A camada responsável pela comunicação do projeto com o banco de dados (PostgreSQL):

Conexao – gerencia a conexão JDBC.
PedidoDao, UsuarioDao, NotaDao, CarrinhoDao – executam os comandos SQL (INSERT, SELECT, UPDATE, DELETE) para mudar as tabelas do banco de dados.

<img width="741" height="220" alt="image" src="https://github.com/user-attachments/assets/34dd9277-07c4-4eb5-9d8d-59ba37dee692" />


Funcionalidades feitas.

Cadastro do usuário:
Recebe as informações do usuário e salva ela no banco de dados para não se perder ao fechar o programa

Login do Usuário:
Autêntica pelo CPF e senha, após o login, o CPF é passado para as próximas telas (usado para filtrar os pedidos).

Adicionar Pedido: A Seleção de comidas/bebidas via checkbox e salvamento no banco de dados com status “Em andamento”.

Buscar Comida: Um campo de busca que filtra os itens por nome (Pizza, Frango etc.) ou letras,
usa setVisible() em labels e checkboxes para só mostrar o que o usuario digitou


<img width="664" height="292" alt="image" src="https://github.com/user-attachments/assets/b4245aa0-b65c-4f98-9b41-dbac39817215" />


Exibir Carrinho: Exibe apenas os pedidos com status “Em andamento” e CPF igual ao logado, mostra nome da comida, preço e ID do pedido, etc.


<img width="675" height="431" alt="image" src="https://github.com/user-attachments/assets/96232050-1cbd-43e6-98ac-e03ab9fcb670" />


Finalizar Pedido: Usuário insere nota (1–5) e um Controle atualiza o campo avaliacao e muda o status para “Finalizado”.
Excluir Pedido: Através do id exclui pedidos com status “Em andamento”.

O projeto atingiu os objetivos propostos, permitindo o gerenciamento completo de pedidos de um usuário e persistência de dados em um banco relacional.
O uso do padrão MVC facilitou a manutenção e a expansão do sistema.
 Como melhorias futuras podendo ser implementadas






