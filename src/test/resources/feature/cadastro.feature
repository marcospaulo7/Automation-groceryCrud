#language: pt
#encoding: UTF-8
#Author: Marcos
#Date: 19/10/2021
#version: 1.0


@smoketest
Funcionalidade: Desafio1
  Essa funcionalidade deve alterar o tema da pagina e
  adicionar um novo Registro


  @smoketest
  Cenario: Validar Alteração do tema
    Dado acessei o site grocerycrud
    Quando alterar o tema da pagina para “Bootstrap V4 Theme”
    Entao visualizo a pagina com o novo tema


  @smoketest
  Cenario: Validar Inserção de registro
    Dado acessei o site grocerycrud
    E acesso o formulário de cadastro
    Quando insiro os dados corretamente
    E clico em Save
    Entao visualizo a mensagem de sucesso

