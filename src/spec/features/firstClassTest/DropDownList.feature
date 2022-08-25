@dropDownList
Feature: J accede au site web Demoqa
  En tant que utilisateur je souhaite acceder au site web Demoqa
  
  Background:	
  	Given J accede au site web Demoqa "https://demoqa.com/select-menu"

@dropDownListAction
  Scenario: Selectionner une couleur
    When Je selecionne la couleur Violet dans las liste Old Style Select Menu "Voilet"
    Then Verifier que la couleur violet a ete selectionne