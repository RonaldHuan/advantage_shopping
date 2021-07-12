package br.com.advantage.test.business.cadastro_e_login;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.advantage.core.utils.UtilidadesPagina;
import br.com.advantage.core.webdriver.utilities.BaseTest;

public class CadastroLoginLogic {
	
	private CadastroLoginPage page;
	private WebDriverWait wait;
	private static WebDriver driver = BaseTest.getDriver();
	private String senhaConfirmada;
	private String userNameValidacao;
	private UtilidadesPagina utils;
	
	public CadastroLoginLogic() {
		utils = new UtilidadesPagina();
		wait = new WebDriverWait(driver, 60);
	}
	
	public void abrirNavegadorHome() {
		maximizarTela();
		page = CadastroLoginPage.openBrowser();
		
	}
	
	public void maximizarTela() {
		System.out.println("maximizando tela");
		driver.manage().window().maximize();
	}
	
	public void clicarBtnUsuario() {
		System.out.println("clico do botao para cadastrar usuario");
		wait.until(ExpectedConditions.elementToBeClickable(page.getBtnUsuario())).click();
	}
	
	public void clicarBtnCreateNewAccount() {
		System.out.println("clico no botao 'CREATE NEW ACCOUNT'");
		wait.until(ExpectedConditions.elementToBeClickable(page.getBtnCreateNewAccount())).click();
	}
	
	public void preencherCampoUserName(String username) {
		System.out.println("preencho o 'Username' " + username);
		wait.until(ExpectedConditions.elementToBeClickable(page.getCampoUserName())).click();
		page.getCampoUserName().sendKeys(username);
		userNameValidacao = username;
	}
	
	public void preencherCampoEmail(String email) {
		System.out.println("preencho o 'Email' " + email);
		page.getCampoEmail().sendKeys(email);
	}
	
	public void preencherCampoPassword(String senha) {
		System.out.println("preencho o 'Password' " + senha);
		page.getCampoPassword().sendKeys(senha);
		senhaConfirmada = senha;
	}
	
	public void preencherCampoConfirmPassword() {
		System.out.println("confirmo o 'Password' " + senhaConfirmada);
		page.getCampoConfirmPassword().sendKeys(senhaConfirmada);
	}
	
	public void preencherCampoFirstName(String firstname) {
		System.out.println("preencho o 'FirstName' " + firstname);
		page.getCampoFirstName().sendKeys(firstname);
	}
	
	public void preencherCampoLastName(String lastname) {
		System.out.println("preencho o 'LastName' " + lastname);
		page.getCampoLastName().sendKeys(lastname);
	}
	
	public void preencherCampoPhoneNumber(String phonenumber) {
		System.out.println("preencho o 'PhoteNumber' " + phonenumber);
		page.getCampoPhoneNumber().sendKeys(phonenumber);
	}

	public void selecionarCountry(String country) throws InterruptedException {
		utils.scroll(page.getCampoSelectorCountry());
		Thread.sleep(5000);
		utils.selecionarElementoPorValor(page.getCampoSelectorCountry(), country);
		System.out.println("seleciono o 'Country' " + country);
	}
	
	public void preencherCampoCity(String city) {
		System.out.println("preencho a 'City' " + city);
		page.getCampoCity().sendKeys(city);
	}
	
	public void preencherCampoAddress(String address) {
		System.out.println("preencho o 'Address' " + address);
		page.getCampoAddress().sendKeys(address);
	}
	
	public void preencherState(String state) {
		System.out.println("preencho o 'State' " + state);
		page.getCampoState().sendKeys(state);
	}
	
	public void preencherPostalCode(String postalcode) {
		System.out.println("preencho o 'PostalCode' " + postalcode);
		page.getCampoPostalCode().sendKeys(postalcode);
	}
	
	public void aceitarTermos() throws InterruptedException {
		System.out.println("concordo com os termos");
		utils.scroll(page.getCkbAceiteTermo());
		utils.click(page.getCkbAceiteTermo());
	}
	
	public void clicarBtnRegister() {
		System.out.println("clico em 'Register'");
		utils.scroll(page.getBtnRegister());
		wait.until(ExpectedConditions.elementToBeClickable(page.getBtnRegister())).click();
	}
	
	public void validarUsuarioCriado() {
		System.out.println("valido o cadastro efetuado");
		wait.until(ExpectedConditions.elementToBeClickable(page.getLblValidacao(userNameValidacao)));
		WebElement elemento = driver.findElement(page.getLblValidacao(userNameValidacao));
		assertTrue(elemento.isDisplayed());
	}
	
	
	
	public void preencherCampoUserNameLogin(String username) {
		System.out.println("preencho o 'Username' em 'Login' " + username);
		wait.until(ExpectedConditions.elementToBeClickable(page.getCampoUserNameLogin())).click();
		page.getCampoUserNameLogin().sendKeys(username);
		userNameValidacao = username;
	}
	
	public void preencherCampoPasswordLogin(String senha) {
		System.out.println("preencho o 'Password' em 'Login' " + senha);
		page.getCampoPasswordLogin().sendKeys(senha);
	}
	
	public void clicarBtnSignIn() {
		System.out.println("clico em 'SIGN IN'");
		wait.until(ExpectedConditions.elementToBeClickable(page.getBtnSignIn()));
		utils.click(page.getBtnSignIn());
	}
	
	public void validarLoginEfetuado() {
		System.out.println("valido o login efetuado");
		wait.until(ExpectedConditions.elementToBeClickable(page.getLblValidacao(userNameValidacao)));
		WebElement elemento = driver.findElement(page.getLblValidacao(userNameValidacao));
		assertTrue(elemento.isDisplayed());
	}
	
}
