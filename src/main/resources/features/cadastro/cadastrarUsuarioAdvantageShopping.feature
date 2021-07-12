Feature: Cadastrar usuario advantage shopping

	Scenario: Realizar cadastro de usuario
		Given que eu esteja na home do site do advantage shopping
		And clico do botao para cadastrar usuario
		And clico no botao 'CREATE NEW ACCOUNT'
		And preencho o 'Username' "davipereira"
		And preencho o 'Email' "davipereira@gmail.com"
		And preencho o 'Password' "Davi123"
		And confirmo o 'Password'
		And preencho o 'FirstName' "Davi"
		And preencho o 'LastName' "Pereira"
		And preencho o 'PhoteNumber' "11999999999"
		And seleciono o 'Country' "Brazil"
		And preencho a 'City' "Brejo Luiza de Brito"
		And preencho o 'Address' "Praca Braulio Queiroz Matos, s/n"
		And preencho o 'State' "Bahia"
		And preencho o 'PostalCode' "46733970"
		And concordo com os termos
		And clico em 'Register'
		Then valido o cadastro efetuado