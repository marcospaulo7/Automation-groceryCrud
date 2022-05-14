package com.automationpratic.steps;


import com.automationpratic.models.CadastroModel;
import com.automationpratic.pages.CadastroPage;
import com.automationpratice.communs.DriverFactory;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;

public class CadastroStep {

    WebDriver driver = DriverFactory.getInstance().getCurrentDriver();
    CadastroPage cadastroPage = new CadastroPage();
    private CadastroModel cadastroModel;

    @Dado("acessei o site grocerycrud")
    public void acesseiOSiteGrocerycrud() {
        driver.get("https://www.grocerycrud.com/v1.x/demo/my_boss_is_in_a_hurry/bootstrap");
    }

    @Quando("alterar o tema da pagina para “Bootstrap V{int} Theme”")
    public void alterarOTemaDaPaginaParaBootstrapVTheme(int arg0) {
        cadastroPage.alterSelect();

    }

    @Entao("visualizo a pagina com o novo tema")
    public void visualizoAPaginaComONovoTema() {
        cadastroPage.validarTemaAtual();
    }

    @E("acesso o formulário de cadastro")
    public void acessoOFormulárioDeCadastro() {
        cadastroPage.acessarCadastro();
    }

    @Quando("insiro os dados corretamente")
    public void insiroOsDadosCorretamente() {
        cadastroModel = new CadastroModel(
                "Teste Sicredi"
                , "Teste"
                , "Marcos Paulo"
                , "51 9999-9999"
                , "Av Assis Brasil, 3970"
                , "Torre D"
                , "Porto Alegre"
                , "RS"
                , "91000-000"
                , "Brasil"
                , "Fixter"
                , 200
        );
        cadastroPage.addRecord(cadastroModel);
    }

    @E("clico em Save")
    public void clicoEmSave() {
        cadastroPage.Save();
    }

    @Entao("visualizo a mensagem de sucesso")
    public void visualizoAMensagemDeSucesso() {
        cadastroPage.validarMensagemSuccessCadastro();
    }

}
