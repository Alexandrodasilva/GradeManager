## Project Grade Manager
## comand mvn spring-boot:run or run in the vscode

## 
1. Tela de Cadastro e Listagem de Alunos
    Cadastro de novos alunos.
    Listagem dos alunos matriculados com opções para edição e exclusão.
2. Tela de Cadastro e Listagem de Professores
    Cadastro de novos professores.
    Listagem dos professores com suas disciplinas atribuídas.
3. Tela de Cadastro e Listagem de Disciplinas
    Cadastro de novas disciplinas.
    Listagem das disciplinas disponíveis, com opções para edição e exclusão.
4. Tela de Matrícula em Disciplinas
    Permitir que um aluno seja matriculado em disciplinas.
    Mostrar as disciplinas disponíveis para matrícula e as já matriculadas por um aluno.
5. Tela de Atribuição de Professores a Disciplinas
    Associar professores a disciplinas.
    Mostrar as disciplinas e permitir a associação com professores.
6. Tela de Criação e Gerenciamento de Turmas
    Cadastro de turmas com suas respectivas disciplinas e alunos associados.
    Listagem das turmas criadas, permitindo a adição e remoção de alunos e disciplinas.
7. Tela de Lançamento de Notas
    Permitir que os professores lancem notas dos alunos em disciplinas.
    Mostrar as disciplinas e alunos matriculados para inserção das notas.
8. Tela de Relatórios e Estatísticas
    Apresentar estatísticas como médias por disciplina, desempenho dos alunos, etc.
    Gerar relatórios sobre o desempenho acadêmico, presença, entre outros.
9. Tela de Perfil de Usuário
    Permitir que usuários (alunos, professores, etc.) visualizem e atualizem suas informações pessoais.
10. Tela de Login e Controle de Acesso
    Página de login para autenticação de usuários.
    Painel de controle de acesso e permissões para diferentes tipos de usuários.
    Estas são apenas algumas sugestões de telas com base nas entidades e relacionamentos do sistema escolar. O design e as funcionalidades podem variar de acordo com as necessidades específicas do sistema e dos usuários finais. Certifique-se de considerar a usabilidade e a experiência do usuário ao projetar essas telas

## ORDEM PARA CRIAÇÃO E VINCULAÇÃO 

1. Disciplinas
    Comece criando as disciplinas. Elas são elementos essenciais em um sistema escolar e frequentemente servem como base para a organização do currículo acadêmico.

2. Professores
    Após criar as disciplinas, associe os professores a elas. Os professores geralmente são responsáveis por ministrar disciplinas específicas. Portanto, a vinculação entre professores e disciplinas é fundamental.

3. Alunos
    Os alunos podem ser matriculados em disciplinas após a definição inicial das disciplinas e da atribuição dos professores. Além disso, os alunos podem ser associados a turmas, e estas, por sua vez, possuem as disciplinas às quais estão vinculadas.

4. Matrículas
    A associação entre alunos e disciplinas pode ser formalizada por meio de matrículas. As matrículas podem conter informações específicas, como notas e desempenho acadêmico.

5. Turmas
    Por fim, as turmas podem ser criadas para agrupar alunos, professores e disciplinas. Elas representam um conjunto específico de alunos e disciplinas que são ensinadas por um professor ou conjunto de professores em um determinado período.