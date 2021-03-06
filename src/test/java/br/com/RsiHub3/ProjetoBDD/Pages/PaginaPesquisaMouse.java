package br.com.RsiHub3.ProjetoBDD.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class PaginaPesquisaMouse extends BasePage {

	public PaginaPesquisaMouse(WebDriver driver) {
		super(driver);
	}
	
	public String validandoMouseEspecifico () {
		return driver.findElement(By.xpath("//h1[@class='roboto-regular screen768 ng-binding']")).getText();
	}
	
	public PaginaPesquisaMouse selecionandoMouseEspecifico () {
		driver.findElement(By.linkText("HP USB 3 Button Optical Mouse")).click();
		return this;
	}
	
	public String mensagemProdutoNaoEncontrado () {
		return driver.findElement(By.xpath("//*[@id=\"searchPage\"]/div[3]/div/label/span")).getText();
	}
	
	public PaginaPesquisaMouse clicarNoProduto() {
		driver.findElement(By.xpath("//div[@class='autoCompleteCover']//div//img")).click();
		return this;
	}
	
	public void EsperaParaPrint () {
		JavascriptExecutor javaScriptExecutor= (JavascriptExecutor) driver;
		javaScriptExecutor.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 1000);");
	}
	
	public PaginaPesquisaMouse fecharBusca() {
		driver.findElement(By.xpath("//*[@id=\"search\"]/div/div")).click();
		return this;
	}
}
