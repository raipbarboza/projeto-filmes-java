# projeto-filmes-java
Rep para projeto de Desenvolvimento de sistemas aplicados - UFLA
# Projeto Filmes Java

Projeto desenvolvido para a disciplina **Desenvolvimento de Sistemas Aplicados (63A-64A-70A-73A)** da **Universidade Federal de Lavras (UFLA)**.

O projeto consiste no desenvolvimento de uma aplicação em Java para o gerenciamento básico de um acervo cinematográfico, conforme os requisitos definidos no **Enunciado 1** da disciplina.

## 1. Sobre o projeto

Um museu cinematográfico deseja informatizar o controle de seu acervo. Para isso, a aplicação deve permitir o cadastro e a manipulação das informações básicas de filmes.

O desenvolvimento do projeto tem como objetivo aplicar, de forma prática, os conceitos de programação e desenvolvimento de sistemas apresentados na disciplina.

## 2. Requisitos

A aplicação deve disponibilizar as seguintes operações:

* Cadastrar um filme;
* Alterar a avaliação de um filme cadastrado;
* Verificar se um filme possui mais de 30 anos;
* Exibir `CLASSICO` para filmes com mais de 30 anos;
* Exibir `CONTEMPORANEO` para filmes com 30 anos ou menos;
* Permitir o encerramento da execução do programa.

### Dados de um filme

Cada filme possui os seguintes atributos:

| Atributo        | Tipo     | Descrição                    |
| --------------- | -------- | ---------------------------- |
| `titulo`        | `String` | Título do filme              |
| `anoLancamento` | `int`    | Ano de lançamento            |
| `genero`        | `String` | Gênero cinematográfico       |
| `avaliacao`     | `double` | Avaliação atribuída ao filme |

Além do armazenamento das informações, a classe `Filme` deve permitir o acesso ao ano de lançamento e a alteração da avaliação cadastrada.

## 3. Tecnologias e ferramentas

* **Java**
* **IntelliJ IDEA**
* **Git**
* **GitHub**

## 4. Estrutura do projeto

```text
projeto-filmes-java/
│
├── src/
│   ├── Filme.java
│   └── Main.java
│
├── .gitignore
└── README.md
```

### `Filme.java`

Classe responsável pela representação de um filme, contendo seus atributos e comportamentos relacionados ao domínio da aplicação.

### `Main.java`

Classe responsável pelo ponto de entrada da aplicação e pela interação com o usuário.

## 5. Conceitos aplicados

Durante o desenvolvimento serão praticados conceitos fundamentais de desenvolvimento em Java, incluindo:

* Classes e objetos;
* Atributos e métodos;
* Encapsulamento;
* Construtores;
* Modificadores de acesso;
* Tipos primitivos e referências;
* Estruturas condicionais;
* Estruturas de repetição;
* Entrada e saída de dados;
* Organização e separação de responsabilidades;
* Controle de versão com Git.

## 6. Evolução do projeto

O desenvolvimento será realizado de forma incremental, utilizando Git para registrar as alterações e acompanhar a evolução da aplicação.

### Implementação

* [x] Estrutura inicial do projeto
* [x] Classe `Filme`
* [x] Cadastro de filme
* [x] Alteração da avaliação
* [x] Verificação de filme clássico
* [x] Registro da data de cadastro
* [ ] Melhorias na interface de interação
* [ ] Novas funcionalidades

> A lista de implementação será atualizada conforme o projeto evoluir durante as aulas.

## 7. Controle de versão

O Git será utilizado para registrar as etapas de desenvolvimento do projeto, mantendo um histórico das alterações realizadas.

Os commits seguem uma convenção simples para facilitar a identificação das mudanças, por exemplo:

```text
feat: adiciona projeto inicial de filmes
feat: adiciona alteração de avaliação
feat: adiciona verificação de filme clássico
docs: atualiza documentação do projeto
```

## 8. Disciplina

**Desenvolvimento de Sistemas Aplicados**
Universidade Federal de Lavras — UFLA

**Enunciado 1 — Sistema de gerenciamento de filmes**
