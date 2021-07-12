package br.com.advantage.test.business.cadastro_e_login;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CadastroLoginSteps {
	
	private CadastroLoginLogic cadastroLoginLogic;
	
	public CadastroLoginSteps() {
		cadastroLoginLogic = new CadastroLoginLogic();
	}
	
	@Given("^que eu esteja na home do site do advantage shopping$")
	public void que_eu_esteja_na_home_do_site_do_advantage_shopping() throws Throwable {
	    cadastroLoginLogic.abrirNavegadorHome();
	}

	@Given("^clico do botao para cadastrar usuario$")
	public void clico_do_botao_para_cadastrar_usuario() throws Throwable {
	    cadastroLoginLogic.clicarBtnUsuario();
	    
	}

	@Given("^clico no botao 'CREATE NEW ACCOUNT'$")
	public void clico_no_botao_CREATE_NEW_ACCOUNT() throws Throwable {
	    cadastroLoginLogic.clicarBtnCreateNewAccount();
	    
	}

	@Given("^preencho o 'Username' \"([^\"]*)\"$")
	public void preencho_o_Username(String username) throws Throwable {
		cadastroLoginLogic.preencherCampoUserName(username);
	    
	}

	@Given("^preencho o 'Email' \"([^\"]*)\"$")
	public void preencho_o_Email(String email) throws Throwable {
		cadastroLoginLogic.preencherCampoEmail(email);
	}

	@Given("^preencho o 'Password' \"([^\"]*)\"$")
	public void preencho_o_Password(String senha) throws Throwable {
		cadastroLoginLogic.preencherCampoPassword(senha);
	    
	}

	@Given("^confirmo o 'Password'$")
	public void confirmo_o_Password() throws Throwable {
		cadastroLoginLogic.preencherCampoConfirmPassword();
	    
	}

	@Given("^preencho o 'FirstName' \"([^\"]*)\"$")
	public void preencho_o_FirstName(String firstname) throws Throwable {
		cadastroLoginLogic.preencherCampoFirstName(firstname);
	    
	}

	@Given("^preencho o 'LastName' \"([^\"]*)\"$")
	public void preencho_o_LastName(String lastname) throws Throwable {
		cadastroLoginLogic.preencherCampoLastName(lastname);
	    
	}

	@Given("^preencho o 'PhoteNumber' \"([^\"]*)\"$")
	public void preencho_o_PhoteNumber(String phonenumber) throws Throwable {
		cadastroLoginLogic.preencherCampoPhoneNumber(phonenumber);
	    
	}

	@Given("^seleciono o 'Country' \"([^\"]*)\"$")
	public void seleciono_o_Country(String country) throws Throwable {
		cadastroLoginLogic.selecionarCountry(country);
	    
	}

	@Given("^preencho a 'City' \"([^\"]*)\"$")
	public void preencho_a_City(String city) throws Throwable {
		cadastroLoginLogic.preencherCampoCity(city);
	}

	@Given("^preencho o 'Address' \"([^\"]*)\"$")
	public void preencho_o_Address(String address) throws Throwable {
		cadastroLoginLogic.preencherCampoAddress(address);
	    
	}

	@Given("^preencho o 'State' \"([^\"]*)\"$")
	public void preencho_o_State(String state) throws Throwable {
		cadastroLoginLogic.preencherState(state);
	    
	}

	@Given("^preencho o 'PostalCode' \"([^\"]*)\"$")
	public void preencho_o_PostalCode(String postalcode) throws Throwable {
		cadastroLoginLogic.preencherPostalCode(postalcode);
	    
	}

	@Given("^concordo com os termos$")
	public void concordo_com_os_termos() throws Throwable {
		cadastroLoginLogic.aceitarTermos();
	    
	}

	@Given("^clico em 'Register'$")
	public void clico_em_Register() throws Throwable {
		cadastroLoginLogic.clicarBtnRegister();
	    
	}

	@Then("^valido o cadastro efetuado$")
	public void valido_o_cadastro_efetuado() throws Throwable {
		cadastroLoginLogic.validarUsuarioCriado();
	    
	}
	
	@Given("^preencho o 'Username' em 'Login' \"([^\"]*)\"$")
	public void preencho_o_Username_em_Login(String username) throws Throwable {
		cadastroLoginLogic.preencherCampoUserNameLogin(username);
	}
	
	@Given("^preencho o 'Password' em 'Login' \"([^\"]*)\"$")
	public void preencho_o_Password_em_Login(String password) throws Throwable {
		cadastroLoginLogic.preencherCampoPasswordLogin(password);
	}
	
	@Given("^clico em 'SIGN IN'$")
	public void clico_em_SIGN_IN() throws Throwable {
		cadastroLoginLogic.clicarBtnSignIn();
	}
	
	@Given("^valido o login efetuado$")
	public void valido_o_login_efetuado() throws Throwable {
		cadastroLoginLogic.validarLoginEfetuado();
	}

}
