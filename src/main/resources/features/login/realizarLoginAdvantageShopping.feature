Feature: Realiizar login no advantage shopping

	Scenario: Realizar login no advantage shopping
		Given que eu esteja na home do site do advantage shopping
		And clico do botao para cadastrar usuario
		And preencho o 'Username' em 'Login' "testeb"
		And preencho o 'Password' em 'Login' "Testeb123"
		And clico em 'SIGN IN'
		Then valido o login efetuado