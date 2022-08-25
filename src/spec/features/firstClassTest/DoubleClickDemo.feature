@doubleClick
Feature: J accede au site web Demoqa
  En tant que utilisateur je souhaite acceder au site web Demoqa
  
  Background:	
  	Given J accede au site web Demoqa "https://demoqa.com/buttons"

@doubleClickAction
  Scenario: Verifier l action double click
    When Je double clique sue le bouton Double Click Me	
    Then Un message s affiche au dessous de la page "You have done a double click"