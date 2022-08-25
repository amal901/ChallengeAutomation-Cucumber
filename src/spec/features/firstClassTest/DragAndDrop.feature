@dragAndDrop
Feature: J accede au site web Demoqa
  En tant que utilisateur je souhaite acceder au site web Demoqa
  
  Background:	
  	Given J accede au site web Demoqa "https://demoqa.com/droppable/"

@dragAndDropAction
  Scenario: Verifier l action dragAndDrop
    When Je glisse et je lache l element Drag me vers Drop here	
    Then Un message s affiche "Dropped" dans le rectangle bleu