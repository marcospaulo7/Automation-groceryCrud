# groceryCrud

Este é um projeto de automação referente a testes Web do site groceryCrud.


## 🚀 Começando

Essas instruções permitirão que você obtenha uma cópia do projeto em operação na sua máquina local para fins de avaliação e teste.


# 📋 Pré-requisitos

Voce precisa ter instalado e configurado em sua maquina:
```
-Java JDK 8+
-Git 
-Maven
```

Abra seu terminal de comando e rode o seguinte comando (escolha uma pasta para isso)
```
git clone https://github.com/marcospaulo7/Automation-groceryCrud.git
```

### 🔧 Instalação

Na pasta raiz do projeto, onde encontra-se o POM.xml execute seguinte comando para instalar as dependencias necessárias

```
mvn clean install
```

## ⚙️ Executando os testes

Na pasta raiz do projeto, onde encontra-se o POM.xml execute o comando

```
mvn test
```
Ou voce pode executar os testes pela classe RunTest dentro do caminho

```
src/test/java/runTest/RunTest.java
```

### ⌨️Sobre Evidencias

No seguinte caminho
```
reports
```
é gerado uma evidencia em .json e .html dos testes executados


## 🛠️ Construção

Tecnologias utilizadas:

* [Java JDK 11](https://www.oracle.com/br/java/technologies/javase-downloads.html)
* [jUnit 4](https://junit.org/junit4/)
* [Cucumber 6.10.2](https://cucumber.io/)
* [Maven](https://maven.apache.org/)
* [Repositório Maven](https://mvnrepository.com/)
