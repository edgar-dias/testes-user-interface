package pt.axians.testes.leilao;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features = {"src/test/feature"}, plugin= {"pretty", "html:target/cucumber_report.html"})
public class TesteUserInterface{
	
}