@authentification
Feature: Je me  connecte a l application OrangeHRM
  Entant que utilisateur , je souhaite m authentifier a l application OrangeHRM

  @connexion_ok
  Scenario: Authentification a l application OrangeHRM
    Given je me connecte  a l application OrangeHRM
    When je saisie le username "Admin"
    And je saisie le mot de passe "admin123"
    And je click sur lebouton login
    Then je me redérige vers la  page home "Wecome"
