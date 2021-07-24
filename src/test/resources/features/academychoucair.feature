#Autor: ElizabethCano
/*@stories
Feature : Academy Choucair
    As a user, I want to learn how to automate in screamplay at the Choucair Academy with the automation course
@scenario1
 Scenario: search for a automation course
    Given than Elizabeth wants to learn automation at the academy Choucair
    When he search for the course Recursos Automatización Bancolombia on the choucair academy platform
    Then  he finds the course called resources Recursos Automatización Bancolombia*/

 @stories
    Feature : Academy Choucair
        As a user, I want to learn how to automate in screamplay at the Choucair Academy with the automation course
    @scenario1
     Scenario OutLine: Search for a automation course
        Given than Elizabeth wants to learn automation at the academy Choucair
        |strUser |strPassword |
        |<strUser> |<strPassword |
        When he search for the course Recursos Automatizacion Bancolombia on the choucair academy platform
        |strCourse|
        |<strCourse>|
        Then  he finds the course called resources Recursos Automatizacion Bancolombia
        |strCourse|
        |<strCourse>|

        Examples:
        |strUser|strPassword|strCourse|
        |rpenaa|Febrero.2020|Metodología Bancolombia|
