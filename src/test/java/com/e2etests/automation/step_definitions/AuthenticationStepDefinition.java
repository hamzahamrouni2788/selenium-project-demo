package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.AuthenticationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthenticationStepDefinition {
	
	private AuthenticationPage authenticationPage;
	
    public AuthenticationStepDefinition() {
    	this.authenticationPage = new AuthenticationPage();
    	
    }

	@Given("je me connecte  a l application OrangeHRM")
	public void jeMeConnecteALApplicationOrangeHRM() {
		authenticationPage.goToUrl();
	}
	
	@When("je saisie le username {string}")
	public void jeSaisieLeUsername(String username) {
		authenticationPage.fillUsername(username);
	}
	@When("je saisie le mot de passe {string}")
	public void jeSaisieLeMotDePasse(String password) {
		authenticationPage.fillPassword(password);
	}

	@When("je click sur lebouton login")
	public void jeClickSurLeboutonLogin() {
		authenticationPage.clickOnBtnLogin();
	}
	@Then("je me redérige vers la  page home")
	public void jeMeRedérigeVersLaPageHome(String msg) {
	String message = AuthenticationPage.homePage.getText();
	Assert.assertTrue(message.contains("msg"));
	}



}
