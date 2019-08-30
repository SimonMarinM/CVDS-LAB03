# CVDS-LAB03
## INTEGRANTES
 SIMÓN MARÍN y ALEJANDRO BOHÓRQUEZ


## Clases de Equivalencia

| Clase Equivalencia | Especificiación                                                           | Explicación             |
|--------------------|---------------------------------------------------------------------------|-------------------------|
| Dead               | Vivo=false & edad >=18 & edad < 125                                        | La persona esta muerta  |
| Invalid Age        | edad < 0 & edad > 125                                                     | Edad no valida          |
| Underage           | edad <18 & edad >=0                                                       | Menor de edad           |
| Duplicated         | persona ∈ personas & edad >= 18 & edad < 125 y vivo = true                | Persona ya registrada   |
| NoName             | nombre = null & edad >=0 & edad <= 125                                    | Persona sin nombre      |
| Valid              | ¬Dead & ¬Invalid Age & ¬UnderAge & ¬Duplicated & ¬NoName & ¬InvalidGender | Registro valido         |




# Un comando que nos servirá mas adelante
 git rm -rf --cached .
