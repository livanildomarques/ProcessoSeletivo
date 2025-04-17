# 📞 Processo Seletivo - Simulação em Java

Este projeto é uma simulação de um processo seletivo simples, desenvolvido em Java. O sistema realiza ações como avaliação de candidatos, análise de salário pretendido, simulação de contato telefônico e seleção baseada em critérios salariais.

## 🎯 Objetivo

O objetivo deste exercício é aplicar conceitos fundamentais da linguagem Java, como:

- Estruturas de controle (`if`, `while`, `for`)
- Arrays e laços de repetição
- Simulação com números aleatórios (`Random`, `ThreadLocalRandom`)
- Modularização de código com métodos

## 🧩 Funcionalidades

O programa é composto por diferentes métodos, com finalidades específicas:

### `main`
Executa o processo de tentativa de contato com candidatos.

### `entrandoEmContato(String candidato)`
Simula até 3 tentativas de contato com um candidato, com base em retornos aleatórios (probabilidade de 1 em 3).

### `atender()`
Retorna `true` ou `false` aleatoriamente, simulando se o candidato atendeu ou não à ligação.

### `imprimirCandidatos()`
Mostra os candidatos em uma lista numerada e também imprime seus nomes individualmente.

### `selecaoCandidatos()`
Simula um processo de seleção com base na expectativa salarial de 10 candidatos. Apenas os 5 primeiros com salários pretendidos dentro do orçamento são selecionados.

### `valorPretendido()`
Gera um valor aleatório entre R$ 1.800 e R$ 2.200 como salário pretendido de um candidato.

### `analisarCandidato(double salarioPretendido)`
Analisa o salário pretendido comparando com o salário base e sugere a ação: ligar, contra-proposta ou aguardar.

## 🛠️ Tecnologias Utilizadas

- Java 8+
- `java.util.Random`
- `java.util.concurrent.ThreadLocalRandom`

## 🚀 Como Executar

### Pré-requisitos

- Java JDK instalado na sua máquina
- Um editor ou IDE (Eclipse, IntelliJ, VS Code) ou terminal

### Passos

1. Clone o repositório:

```bash
git clone https://github.com/livanildomarques/DesafioControleFluxo.git
cd DesafioControleFluxo
