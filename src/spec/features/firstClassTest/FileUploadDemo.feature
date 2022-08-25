@upload
Feature: J accede au site web Demo
 En tant que utilisateur je souhaite acceder au site web Demo
  
  @uploadFile
  Scenario: Telecharger un fichier
    Given J accede au site web Demo "https://demo.guru99.com/test/upload/"
    And Je clique sur choisir un fichier et j ouvre le fichier voulu "C:\\Users\\pc\\Desktop\\formation\\selenium\\Selenium code.txt"
    Then Le fichier sera selectione