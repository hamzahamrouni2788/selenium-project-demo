@authentification
Feature: Je me  connecte a l application OrangeHRM
  Entant que utilisateur , je souhaite m authentifier a l application OrangeHRM
  
  Background: 
    Given je me connecte  a l application OrangeHRM
    When je saisie le username "Admin"
    And je saisie le mot de passe "admin123"
    And je click sur le bouton login

  @connexion_ok
  Scenario: Authentification a l application OrangeHRM
    Then je me rederige vers la page home "Wecome"

  @deconnexion
  Scenario: deconnexion
    When je clique sur l icone logout
    And je clique sur le bouton logout
