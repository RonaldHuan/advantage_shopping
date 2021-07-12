package br.com.advantage.core.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import br.com.advantage.core.webdriver.utilities.BaseTest;

public class UtilidadesPagina {
	
	private Select seletor;
	private static WebDriver driver = BaseTest.getDriver();
	
	public void selecionarElementoPorValor(WebElement element, String value) {
		try {
			seletor = new Select(element);
			seletor.selectByVisibleText(value);
		} catch (Exception ex) {
			System.out.println("Erro ao selecionar opcao por texto.");
		}
	}
	
	public Object executeJS(String cmd, Object... param) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js.executeScript(cmd, param);
	}

	public void scroll(int scroll) {
		executeJS("window.scrollBy(0," + scroll + ")", "");
	}

	public void scroll(WebElement element) {
		executeJS("arguments[0].scrollIntoView(true);", element);
	}
	
	public void click(WebElement webElement) {
		try {
			executeJS("arguments[0].click();", webElement);
		} catch (StaleElementReferenceException ex) {
			webElement.click();
		}
	}

}
