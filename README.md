# Taller03

-Juan Paiva Navarrete.

Se busca hacer un análisis de distintos casos y modelarlos a través de UML.

Caso 4: (CASO ASIGNADO)

Una empresa de transporte de carga, cuenta con 10 camiones por el momento. La empresa está pronta a comprar nuevos camiones y dar de baja algunos que ya están obsoletos. Los camiones dados de baja, los vende por partes a un astillero.

-Clases: Empresa / Camion / Parte / CamionUtil / CamionObsoleto 

Estas clases se relacionan de la siguiente forma: Empresa tiene 10 camiones (podría ser una agregación), Camion se relacióna con Parte, Los camiones nuevos y los aún "útiles" van a Empresa, los Camiones obsoletos se venden por partes a un astillero. Podríamos considerar una Herencia en Camion con 2 clases heredadas, camiones obsoletos, que podrán desarmarse y venderse por Partes, y los camiones útiles se mantendrán en Empresa distinguiendo un atributo que muestre si el camion es nuevo o usado. 
