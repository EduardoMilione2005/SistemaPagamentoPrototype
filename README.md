# Sistema de Pagamento - Prototype Pattern

## Descrição

Este projeto implementa o padrão de projeto **Prototype** em Java, simulando um sistema simples de pagamentos.

O padrão **Prototype** permite criar novos objetos a partir da clonagem de instâncias já existentes, evitando a criação repetitiva e facilitando a reutilização de objetos configurados previamente.

Neste sistema, diferentes tipos de pagamento são registrados em um **Registry**, e novos objetos são criados por meio de clonagem.

---

## Padrão de Projeto Utilizado

### Prototype

O padrão **Prototype** é um padrão criacional que permite copiar objetos existentes em vez de criar novas instâncias do zero.

### Vantagens
- Redução de código repetitivo
- Facilidade de criação de objetos complexos
- Melhor desempenho em alguns cenários
- Flexibilidade para registrar protótipos e cloná-los

---

## Estrutura do Projeto

```text
SistemaPagamentoPrototype/
│── src/
│   ├── PagamentoPrototype.java
│   ├── Pagamento.java
│   ├── PagamentoRegistry.java
│   ├── Main.java
│   └── PagamentoTest.java
│
└── README.md
Classes do Projeto
PagamentoPrototype

Interface responsável por definir o método de clonagem.

Método:

clone()
Pagamento

Classe concreta que implementa a interface PagamentoPrototype.

Atributos:

tipo
valor

Métodos principais:

clone()
getTipo()
getValor()
setTipo()
setValor()
toString()
PagamentoRegistry

Classe responsável por armazenar protótipos de pagamentos e retornar clones sob demanda.

Função:

Registrar tipos de pagamento
Retornar cópias dos protótipos
Main

Classe principal para execução do sistema.

Função:

Demonstrar o funcionamento do padrão Prototype.
PagamentoTest

Classe de teste para validar se a clonagem dos objetos funciona corretamente.

Exemplo de Execução
Entrada

O sistema registra alguns tipos de pagamento:

PIX
Cartão de Crédito
Boleto
Saída esperada
Pagamento{tipo='PIX', valor=100.0}
Pagamento{tipo='Cartão de Crédito', valor=250.0}
Pagamento{tipo='Boleto', valor=500.0}
Como Executar
Pré-requisitos
Java JDK 8 ou superior
IDE (IntelliJ, Eclipse ou VS Code)
Passos
Clone o repositório:
git clone <url-do-repositorio>
Abra o projeto na IDE.
Compile e execute a classe:
Main.java
Como Testar

Execute a classe:

PagamentoTest.java

Ela irá validar se os objetos retornados pelo registry são clones independentes.

Conceitos Demonstrados
Programação Orientada a Objetos
Interfaces em Java
Encapsulamento
Clone de objetos
Padrão de projeto Prototype
Registry de protótipos
