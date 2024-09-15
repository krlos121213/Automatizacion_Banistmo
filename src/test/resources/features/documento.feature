#Autor Carlos Andres Zapata Marin

Feature: Validacion de documento presentacion a la ciudadania

  Scenario: Validacion de documento de presentacion a la ciudadania
    Given que el cliente quiere aaceder a la pagina de la aereonautica civil
    When va a la la seccion de plan de accion ubicada en transparencia
    And  visualiza el documento
    Then deberia ver el documento generado