# PO

![Java](https://img.shields.io/badge/Java-8%2B-ED8B00?logo=openjdk&logoColor=white)
![Build](https://img.shields.io/badge/build-Ant%20%2F%20NetBeans-blue)
![License](https://img.shields.io/badge/license-MIT-green)
![Status](https://img.shields.io/badge/status-exerc%C3%ADcio%20acad%C3%AAmico-lightgrey)

Exercício acadêmico em Java que modela, com Programação Orientada a Objetos (POO), o consumo de energia de equipamentos domésticos (computador, cafeteira e fogão), usando herança e interfaces.

## Descrição

O projeto é um estudo de caso de POO desenvolvido no NetBeans, no pacote `prova`. Ele modela diferentes tipos de equipamentos domésticos por meio de:

- uma classe abstrata (`Equipamento`) com os atributos e comportamentos comuns a todo equipamento;
- uma interface (`Ligavel`) que define o contrato de equipamentos que possuem consumo elétrico mensurável;
- classes concretas (`Computador`, `Consumo`, `Fogao`) que estendem/implementam esses tipos para representar equipamentos específicos.

Não é uma aplicação com interface gráfica ou linha de comando interativa — é um exercício de modelagem de classes, pensado para ser explorado/testado a partir do próprio código-fonte ou de uma IDE.

## Tecnologias utilizadas

- **Java** (compilado com `javac.source`/`javac.target` = 1.8, compatível com JDKs mais novos)
- **Apache Ant** (via o projeto NetBeans, `build.xml` + `nbproject/build-impl.xml`)
- **NetBeans** (estrutura de projeto `j2seproject`)

## Funcionalidades

- `Equipamento` *(classe abstrata)*: guarda o modelo do equipamento (`modEquipamento`) com getter e setter, e é a superclasse de `Computador` e `Fogao`.
- `Ligavel` *(interface)*: contrato `ModEquipamento()` / `getConsEnergia()` para equipamentos com consumo elétrico.
- `Computador`: estende `Equipamento` e implementa `Ligavel`; expõe um consumo elétrico estático (`consEletrico`, padrão 20) via getter/setter estático.
- `Consumo`: implementa `Ligavel` diretamente (representa uma cafeteira); `getConsEnergia()` retorna um valor fixo (0, não calculado) e `getModEquipamento()` retorna `"cafeteira"`.
- `Fogao`: estende `Equipamento` e adiciona o atributo `bocas` (número de bocas), com getter e setter.

## Pré-requisitos

- JDK 8 ou superior instalado (testado também em JDK 21).
- Opcional: [Apache NetBeans](https://netbeans.apache.org/) para abrir o projeto como está estruturado (`nbproject/`), ou o [Apache Ant](https://ant.apache.org/) para build via linha de comando.

## Instalação

```bash
git clone https://github.com/Carolaynebarret/PO.git
cd PO
```

Não há dependências externas para baixar — o projeto usa apenas a biblioteca padrão do Java.

## Como executar

### Via NetBeans

Abra a pasta do projeto no NetBeans (`File > Open Project`) e use `Run > Run Project`.

### Via linha de comando (sem Ant)

```bash
mkdir -p build/classes
javac -d build/classes src/prova/*.java
java -cp build/classes prova.Equipamento
```

A classe principal (`main.class`) configurada no projeto é `prova.Equipamento`, que contém um `main` vazio — o objetivo do projeto é a modelagem das classes, não uma execução com saída no console.

### Via Ant

```bash
ant run
```

## Como rodar os testes

Este projeto **não possui suíte de testes automatizados** (não há testes unitários, ex. JUnit, nem pasta `test/` com conteúdo). Essa é uma lacuna conhecida — veja o Roadmap abaixo.

## Estrutura de pastas

```
PO/
├── src/prova/
│   ├── Equipamento.java   # classe abstrata base
│   ├── Ligavel.java       # interface de equipamentos ligáveis
│   ├── Computador.java    # extends Equipamento, implements Ligavel
│   ├── Consumo.java       # implements Ligavel (cafeteira)
│   └── Fogao.java         # extends Equipamento
├── nbproject/             # configuração do projeto NetBeans
├── docs/images/           # capturas de tela (a produzir)
├── build.xml              # script Ant (gerado pelo NetBeans)
├── manifest.mf
├── LICENSE
└── README.md
```

## Roadmap / melhorias futuras

Lacunas reais identificadas no código durante a auditoria, ainda não resolvidas por exigirem decisões de design que vão além de uma correção pontual:

- **Sem testes automatizados**: não há nenhuma suíte de testes (JUnit ou similar) cobrindo as classes do domínio.
- **`Consumo.getConsEnergia()` sempre retorna 0**: o método existe, mas o cálculo de consumo real de energia da cafeteira nunca foi implementado.
- **`Fogao` não implementa `Ligavel`**: diferente de `Computador` e `Consumo`, a classe `Fogao` não expõe consumo de energia, o que é inconsistente com os demais equipamentos do domínio.
- **Sem ponto de entrada de demonstração**: o `main` de `prova.Equipamento` está vazio; não há um cenário de exemplo instanciando e exercitando as classes do domínio.

## Contribuição

Sugestões e correções são bem-vindas via *pull request*:

1. Faça um fork do repositório.
2. Crie uma branch para sua alteração (`git checkout -b minha-alteracao`).
3. Faça commit das mudanças com uma mensagem descritiva.
4. Abra um Pull Request explicando o que foi alterado e por quê.

## Licença

Este projeto está licenciado sob a licença MIT — veja o arquivo [LICENSE](LICENSE) para mais detalhes.
