# JavaGame02_PalabraOculta


11) JUEGO DEL AHORCADO


![image](https://user-images.githubusercontent.com/36207623/154251338-085e500b-55f0-4591-9a1e-4e7f5ed4ef72.png)


Grupo 6: Adrián - Isabel - Joan.


                           Enunciado:

-   El objetivo es implementar u na aplicación que permita jugar al juego del ahorcado.
    Para su realización se deberán seguir las siguientes indicaciones.

-   En un panel incluiremos los botones correspondientes a las letras. Se deberá
    implementar un único procedimiento que permita habilitar y deshabilitar todos
    los botones a la vez.

-   Utilizamos otro componente las distintas imágenes que muestren la evolución del
    ahorcamiento. Por lo tanto, el jugador solo dispone de 10 intentos fallidos para
    adivinar la palabra.

-   Además incluiremos un groupbox (pistas) que incluirá 5 botones de color rojo. El
    numero de vidas a crear podrá ser modificado con lo que hemos de pasar este
    como parámetro. También se presentara un botón pista.


-   La palabra a adivinar se extraerá de forma aleatoria de un Listbox que se rellena
    con 10 palabras que deseéis.

-   Tras obtener las palabras se crearan componentes label “_” necesarios para
    adivinar la palabra.

-   Cada vez que se pulse sobre una letra esta se deshabilitara sino has acertado se
    cargara la siguiente imagen. Si has acertado se cargara la imagen en la posición
    que corresponda. Se comprobara si un jugador ha ganado o ha perdido mostrando
    una imagen por pantalla. Tanto si gana como si pierde se le pedirá al jugador si
    quiere volver a jugar.

-   El menú Archivo del juego tendrá dos opciones Salir y nuevo juego. También
    mostraremos los intentos fallidos que lleva el jugador en cada partida.

-   Además se crearan dos formularios accesibles desde la barra de menú: Como jugar y
    acerca de (donde aparecerá el nombre del alumno dentro de un menú ayuda).
    Retos adicionales:



-  Se debe crear un formulario donde se puede elegir el nivel del jugador.
    

-  Las características de la primera parte son del jugador principiante. El intermedio
   tendrá 8 intentos y el avanzado solo 6.

-  Este formulario aparecerá siempre que seleccionemos nuevo juego

-  Se deberá crear una nueva opción de menú llamada diccionario / palabra nueva
   donde se podrán añadir palabras al diccionario.


                          Gestión de la Pista.
      
      
-   En cualquier momento del juego el usuario puede solicitar una pista pulsando el
    botón pista. Solo se puede edir una pista por partida y su uso implica perder una
    vida. Así pues, antes de darle una pista habrá que confirmar si el usuario quiere
    una pista a cambio de una vida ( MsgBox ). Si acepta la pista, se perderá una vida,
    se eliminara uno de los botones presentes en el groupbox , se mostrará la pista
    siempre que tenga mas de una vida.

-   La pista a mostrar será la primera letra de cada palabra oculta que aun no haya
    sido encontrada. Es posible que tras mostrar una pista el jugador gane la partida.
    
    
                            Capturas Proyecto.
                            
                            
                            ![image](https://user-images.githubusercontent.com/36207623/154261065-6d0424b9-34b3-4a56-ba0f-207268b8269e.png)
                            
                            Inicio del Juego
                            
                            ![image](https://user-images.githubusercontent.com/36207623/154261174-a5d08205-e526-44d7-a989-2d854cf0b282.png)


                              Panel del Juego
                              
                              
                              ![image](https://user-images.githubusercontent.com/36207623/154261307-ba024b8c-bab3-464c-bee0-21294a9aa303.png)
                              
                              Desarrollo del Juego
                              
                              
                              ![image](https://user-images.githubusercontent.com/36207623/154261379-f5fb1cba-eb2a-4205-b012-aa35c508487f.png)
                              
                              Gestión de Diccionario.



