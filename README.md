# 🏦 Sistema de Gestão de RH

Este é um projeto desenvolvido em **Java** para consolidar os pilares da Programação Orientada a Objetos (POO).
O sistema simula a gestão de funcionários de uma empresa, calculando bonificações específicas por cargo e gerenciando permissões de acesso.

## 🚀 Funcionalidades

- **Cadastro Interativo**: Uso da classe `Scanner` para entrada de dados via console.
- **Cálculo de Bonificação**: Cada cargo possui uma regra de negócio diferente para o cálculo de bônus (Polimorfismo).
- **Sistema de Autenticação**: Implementação de permissões de acesso para cargos de confiança (Interfaces).
- **Relatório Geral**: Listagem automatizada de todos os colaboradores e seus respectivos benefícios.

## 🛠️ Conceitos de OO Aplicados

Neste projeto, apliquei os quatro pilares da POO:

1. **Abstração**: A classe `Funcionario` foi definida como `abstract`, servindo apenas como um molde para os cargos reais.
2. **Herança**: Classes como `Gerente`, `Diretor` e `Programador` herdam atributos e métodos comuns da classe pai.
3. **Encapsulamento**: Proteção de dados sensíveis utilizando modificadores de acesso `private` e métodos `Getters` e `Setters`.
4. **Polimorfismo**: Capacidade de tratar diferentes objetos de forma genérica em uma `ArrayList<Funcionario>`, onde cada um executa sua própria versão dos métodos sobrescritos (`@Override`).



## 🏗️ Estrutura do Projeto

- `Funcionario` (Classe Abstrata Pai)
- `Autenticavel` (Interface para controle de acesso)
- `Gerente`, `Diretor`, `Programador` (Classes Filhas)
- `Main` (Classe principal com a lógica do Scanner e Relatórios)

## 💻 Como executar

1. Clone o repositório.
2. Certifique-se de ter o **JDK 17+** instalado.
3. Importe o projeto em sua IDE (Eclipse, IntelliJ ou VS Code).
4. Execute a classe `Main.java`.

---
Desenvolvido por [João Vitor dos Passos Ribeiro] durante os estudos de Java e POO.
