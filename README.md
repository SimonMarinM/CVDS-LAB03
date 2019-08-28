# CVDS-LAB03



## Clases de Equivalencia

| Clase Equivalencia | Especificiación                                                           | Explicación             |
|--------------------|---------------------------------------------------------------------------|-------------------------|
| Dead               | Vivo=false & edad >=18 & edad < 125                                        | La persona esta muerta  |
| Invalid Age        | edad < 0 & edad > 125                                                     | Edad no valida          |
| Underage           | edad <18 & edad >=0                                                       | Menor de edad           |
| Duplicated         | persona ∈ personas & edad >= 18 & edad < 125 y vivo = true                | Persona ya registrada   |
| NoName             | nombre = null & edad >=0 & edad <= 125                                    | Persona sin nombre      |
| Valid              | ¬Dead & ¬Invalid Age & ¬UnderAge & ¬Duplicated & ¬NoName & ¬InvalidGender | Registro valido         |



## Integrantes

Sergio Alejandro Bohorquez

German Simon Marín

## Notas
*El git ignore se encuentra oculto*

git rm -rf --cached .


