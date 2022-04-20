# SpaceshipSimulator 
##  Objetivos del proyecto:
# Objetivo 1 :
#### Implementa una clase de tipo SpaceShip. Incluye en ella, como mínimo, los siguientes atributos: 
- Nombre.
- Matrícula galáctica.
- Aceleración.
- Velocidad X.
- Velocidad Y.
- Coordenada X.
- Coordenada Y.
- Dirección X
- Dirección Y
#### Objetivo 2 :
 La clase SpaceShip debe incluir un método denominado speedUp que calcule la nueva velocidad y posición de la nave espacial
#### Objetivo 3 :
 Sobrecarga el método toString de la clase SpaceShip para que muestre una representación AsciiArt de la misma.
#### Objetivo 4 :
 Crea un directorio docs que cuelgue de la raíz del proyecto y dentro de él, crea un nuevo documento MarkDown denominado SpaceShip.md donde tendrás que explicar el funcionamiento de tu clase SpaceShip.
#### Objetivo 5 :
 Crea un nuevo método que se denomine brake y que lo que haga sea hacer que la nave frene aplicando la misma aceleración pero en sentido contrario.
#### Objetivo 6 :
Crea un nuevo método que se denomine emergencyStop, que lo que haga es que la velocidad de la nave pase a ser cero inmediatamente.
#### Objetivo 7 :
 Crea una nueva clase denominada Cargo que extienda a la anterior. Esta clase debe incluir un nuevo atributo que represente la capacidad de carga máxima.
#### Objetivo 8 :
 Crea un método denominado load() que añada un container a la bodega de una nave de tipo Cargo si aún hay espacio y que muestre un mensaje de error en el caso de que ya no quepa un nuevo container en la misma.
## Objetivo 9 :
 Crea un método denominado unload() que elimine un container de la bodega de carga de una nave de tipo Cargo si hay alguno almacenado allí. En caso contrario debe mostrar un mensaje de aviso indicando que no puede descargarse porque no hay containers almacenados allí.
#### Objetivo 10 :
 Crea un nuevo documento en la carpeta docs de tu proyecto y denomínalo Cargo.md, procede como en el caso anterior explica el funcionamiento de tu clase Cargo así como cualquier referencia que hayas utilizado en este caso. Enlaza este nuevo documento desde el archivo Readme.md.
#### Objetivo 11 :
 Por último, diseña una interfaz que permita al usuario crear una nueva nave, muestre su asciiArt correspondiente y permita que el usuario acelere, frene o pare. El usuario debe poder salir en cualquier momento de la aplicación.
* [Funcionamiento de la clase SpaceShip](./.docs/SpaceShip.md)