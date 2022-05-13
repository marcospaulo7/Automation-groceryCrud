package com.automationpratic.pages;

import com.automationpratic.models.CadastroModel;
import com.automationpratice.communs.DriverFactory;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CadastroPage {


    WebDriver driver;

    @FindBy(id = "field-customerName")
    WebElement fieldCustomerName;

    @FindBy(id = "field-contactLastName")
    WebElement fieldContactLastName;

    @FindBy(id = "field-contactFirstName")
    WebElement fieldContactFirstName;

    @FindBy(id = "field-phone")
    WebElement fieldPhone;

    @FindBy(id = "field-addressLine1")
    WebElement fieldAddressLine1;

    @FindBy(id = "field-addressLine2")
    WebElement fieldAddressLine2;

    @FindBy(id = "field-city")
    WebElement fieldCity;

    @FindBy(id = "field-state")
    WebElement fieldState;

    @FindBy(id = "field-postalCode")
    WebElement fieldPostalCode;

    @FindBy(id = "field-country")
    WebElement fieldCountry;

    @FindBy(id = "field-salesRepEmployeeNumber")
    WebElement fieldSalesRepEmployeeNumber;

    @FindBy(id = "field-creditLimit")
    WebElement fieldCreditLimit;

    @FindBy(id = "report-success")
    WebElement mensagemSuccess;

    @FindBy(id = "switch-version-select")
    WebElement selectTheme;

    @FindBy(xpath = "//div[@class='header-tools']//a")
    WebElement btnAddRecord;

    @FindBy(id = "form-button-save")
    WebElement btnSave;

    Select selectTema = new Select(selectTheme);

    public CadastroPage() {
        PageFactory.initElements(DriverFactory.getInstance().getCurrentDriver(), this);
    }


    public void addRecord(CadastroModel cadastro) {

        fieldCustomerName.sendKeys(cadastro.getCustomerName());
        fieldContactLastName.sendKeys(cadastro.getContactLastName());
        fieldContactFirstName.sendKeys(cadastro.getContactFirstName());
        fieldPhone.sendKeys(cadastro.getPhone());
        fieldAddressLine1.sendKeys(cadastro.getAddressLine1());
        fieldAddressLine2.sendKeys(cadastro.getAddressLine2());
        fieldCity.sendKeys(cadastro.getCity());
        fieldState.sendKeys(cadastro.getState());
        fieldPostalCode.sendKeys(cadastro.getPostalCode());
        fieldCountry.sendKeys(cadastro.getCountry());
        fieldSalesRepEmployeeNumber.sendKeys(cadastro.getSalesRepEmployeeNumber());
        fieldCreditLimit.sendKeys(Integer.toString(cadastro.getCreditLimit()));
    }

    public void Save() {
        btnSave.click();
    }

    public void alterSelect() {
        selectTema.selectByValue("/v1.x/demo/my_boss_is_in_a_hurry/bootstrap-v4");
    }

    public void validarTemaAtual() {
        Assert.assertEquals("Bootstrap V4 Theme", selectTema.getFirstSelectedOption().getText());
    }

    public void acessarCadastro() {
        btnAddRecord.click();
    }

    public void validarMensagemSuccessCadastro() {
        Assert.assertEquals("Your data has been successfully stored into the database. Edit Customer or Go back to " +
                "list", mensagemSuccess.getText());
    }

}
