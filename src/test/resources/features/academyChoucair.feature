# Autor: xxxxxxxxx

  @stories

  Feature: Academy Choucair
    As a user, I want to learn how to automate in screamplay at the Choucair Academy with the automation course
  @scenario1
  Scenario: Search for a automation course
    |strUser| strPassword |
    |TuUsuario| TuClave |
    Given than brandon wants to learn automation at the academy Choucair
    When he search for the course Recursos Automatización Bancolombia on the Choucair academy platform
    |strCourse|
    | Metodología Bancolombia |
    Then he finds the course called resources Recursos Automatización Bancolombia
    | strCourse |
    | Metodología Bancolombia |