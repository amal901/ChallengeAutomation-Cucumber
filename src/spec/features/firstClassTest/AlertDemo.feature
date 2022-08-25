@AlertDemo
Feature: J accede au site web Demoqa
  En tant que utilisateur je souhaite acceder au site web Demoqa
  
  @AcceptAlert
  Scenario: Accepter l alerte
  	Given J accede au site web Demoqa "https://demoqa.com/alerts"
    When Je clique sue le bouton Click me	
    When J accepte l alerte
    Then l alerte disparait 
    