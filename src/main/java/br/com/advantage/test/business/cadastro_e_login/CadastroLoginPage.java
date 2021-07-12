package br.com.advantage.test.business.cadastro_e_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import br.com.advantage.core.webdriver.utilities.BasePage;

public class CadastroLoginPage extends BasePage<CadastroLoginPage> {
	
	private static final String URL_ADVANTAGE_SHOPPING = "http://advantageonlineshopping.com/#/";
	
	public static CadastroLoginPage openBrowser() {
		System.out.println("dado que eu esteja na home do site do advantage shopping");
		new CadastroLoginPage().get(URL_ADVANTAGE_SHOPPING);
		return PageFactory.initElements(driver, CadastroLoginPage.class);
	}
	
	@FindBy(xpath = "//a[contains(@id, 'menuUserLink')]")
	WebElement btnUsuario;
	
	@FindBy(xpath = "//a[contains(text(), 'CREATE NEW ACCOUNT')]")
	WebElement btnCreateNewAccount;
	
	@FindBy(xpath = "//input[contains(@name, 'usernameRegisterPage')]")
	WebElement campoUserName;
	
	@FindBy(xpath = "//input[contains(@name, 'emailRegisterPage')]")
	WebElement campoEmail;
	
	@FindBy(xpath = "//input[contains(@name, 'passwordRegisterPage')]")
	WebElement campoPassword;
	
	@FindBy(xpath = "//input[contains(@name, 'confirm_passwordRegisterPage')]")
	WebElement campoConfirmPassword;
	
	@FindBy(xpath = "//input[contains(@name, 'first_nameRegisterPage')]")
	WebElement campoFirstName;
	
	@FindBy(xpath = "//input[contains(@name, 'last_nameRegisterPage')]")
	WebElement campoLastName;
	
	@FindBy(xpath = "//input[contains(@name, 'phone_numberRegisterPage')]")
	WebElement campoPhoneNumber;
	
	@FindBy(xpath = "//select[contains(@name, 'countryListboxRegisterPage')]")
	WebElement campoSelectorCountry;
	
	@FindBy(xpath = "//input[contains(@name, 'cityRegisterPage')]")
	WebElement campoCity;
	
	@FindBy(xpath = "//input[contains(@name, 'state_/_province_/_regionRegisterPage')]")
	WebElement campoState;
	
	@FindBy(xpath = "//input[contains(@name, 'postal_codeRegisterPage')]")
	WebElement campoPostalCode;
	
	@FindBy(xpath = "//label[contains(text(), 'I agree')]")
	WebElement ckbAceiteTermo;
	
	@FindBy(xpath = "//*[contains(text(), 'REGISTER')]")
	WebElement btnRegister;
	
	@FindBy(xpath = "//input[contains(@name, 'addressRegisterPage')]")
	WebElement campoAddress;
	
	@FindBy(xpath = "//input[contains(@name, 'username')]")
	WebElement campoUserNameLogin;
	
	@FindBy(xpath = "//input[contains(@name, 'password')]")
	WebElement campoPasswordLogin;
	
	@FindBy(xpath = "//button[contains(text(), 'SIGN IN')]")
	WebElement btnSignIn;
	
	public WebElement getCampoUserNameLogin() {
		return campoUserNameLogin;
	}
	
	public WebElement getCampoPasswordLogin() {
		return campoPasswordLogin;
	}
	
	public WebElement getBtnSignIn() {
		return btnSignIn;
	}
	
	private String lblValidacao = "(//span[contains(text(), '%s')])[last()]";
	
	public WebElement getBtnUsuario() {
		return btnUsuario;
	}
	
	public WebElement getCampoAddress() {
		return campoAddress;
	}
	
	public WebElement getBtnCreateNewAccount() {
		return btnCreateNewAccount;
	}
	
	public WebElement getCampoUserName() {
		return campoUserName;
	}
	
	public WebElement getCampoEmail() {
		return campoEmail;
	}
	
	public WebElement getCampoPassword() {
		return campoPassword;
	}
	
	public WebElement getCampoConfirmPassword() {
		return campoConfirmPassword;
	}
	
	public WebElement getCampoFirstName() {
		return campoFirstName;
	}
	
	public WebElement getCampoLastName() {
		return campoLastName;
	}
	
	public WebElement getCampoPhoneNumber() {
		return campoPhoneNumber;
	}
	
	public WebElement getCampoSelectorCountry() {
		return campoSelectorCountry;
	}
	
	public WebElement getCampoCity() {
		return campoCity;
	}
	
	public WebElement getCampoState() {
		return campoState;
	}
	
	public WebElement getCampoPostalCode() {
		return campoPostalCode;
	}
	
	public WebElement getCkbAceiteTermo() {
		return ckbAceiteTermo;
	}
	
	public WebElement getBtnRegister() {
		return btnRegister;
	}
	
	public By getLblValidacao(String username) {
		return By.xpath(String.format(lblValidacao, username));
	}
}
