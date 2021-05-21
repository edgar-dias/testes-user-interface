package pt.axians.testes.leilao;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class ExampleStepDefinition {

	private WebDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./webdriver/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Dado("O utilizador esta na página de autenticação")
	public void o_utilizador_esta_na_pagina_de_autenticacao() {
		driver.get("https://www.stealmylogin.com/demo.html");
	}

	@Quando("Insere os dados e submete")
	public void insere_os_dados_e_submete() {
		driver.findElement(By.name("username")).click();
		driver.findElement(By.name("username")).sendKeys("usersimples");
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).sendKeys("passsimples");
		driver.findElement(By.cssSelector("input:nth-child(7)")).click();
	}

	@Quando("Insere o username {string} e password {string} submete")
	public void insere_o_username_e_password_submete(String username, String password) {
		driver.findElement(By.name("username")).click();
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.cssSelector("input:nth-child(7)")).click();
	}

	@Quando("Insere o username e password de um mapa e submete")
	public void insere_o_username_e_password_submete(DataTable dataTable) {
		Map<String, String> map = dataTable.asMap(String.class, String.class);
		driver.findElement(By.name("username")).click();
		driver.findElement(By.name("username")).sendKeys(map.get("username"));
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).sendKeys(map.get("password"));
		driver.findElement(By.cssSelector("input:nth-child(7)")).click();
	}

	@Então("É apresentada a Dashboard da aplicação")
	public void e_apresentada_a_dashboard_da_aplicacao() {
		String title = driver.findElement(By.cssSelector("h1")).getText();
		Assert.assertEquals("Example Domain", title);
	}

	@AfterStep
	public void takeScreenshot(Scenario scenario) {
		if (scenario.isFailed()) {
			byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "ecra");
		}
	}

	@After
	public void teardown() {
		driver.close();
	}

}
