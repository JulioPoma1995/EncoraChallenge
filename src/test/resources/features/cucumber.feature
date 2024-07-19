Feature: Registro y logueo de Parabank

@Enc_001 @Nuevousuarioyregistro
  Scenario Outline: Se genera un nuevo usuario y se loguea
        Given Accedo a la url de Parabank
        And Ingreso a la opcion de registro
        When Lleno todo el formulario <F_name>,<L_name>,<Address>,<City>,<State>,<Z_code>,<P_number>,<Ssn>,<user>,<password>
        Then Valido mensaje de confirmacion
        And Inicio sesion con cuenta <user>,<password>
  Examples:
    | F_name | L_name | Address           | City | State | Z_code | P_number     | Ssn | user         | password    |
    | Julio  | Poma   | jr.huamachuco1985 | Lima | Lima  | 02002  | +51995714452 | 123 | JulioEncora3 | Julio@12345 |