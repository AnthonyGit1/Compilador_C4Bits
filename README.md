# Compilador_C4Bits
## Requisitos
Este compilador genera archivos .bin para una computadora de 4 bits y esta hecho en el lenguaje Java, antes de clonar el repositorio, asegúrese de tener:

[JDK 18](https://www.oracle.com/java/technologies/javase/jdk18-archive-downloads.html).

[Apache-NetBeans 14](https://netbeans.apache.org/download/nb14/).

## Tabla de Comandos
|BIN	|HEX |Nemónico |Descripción	                                                |Observaciones
|-----|----|---------|------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------|
|0	  |0	 |NOT	     |No hace nada, sirve para hacer delays	Ignora el operando    |                                                                                                                                |
|1	  |1	 |NAND,n	 |AND entre operando y el acumulador	                        |                                                                                                                                |
|10	  |2	 |ADD,n	   |Suma el operando al acumulador	                            |                                                                                                                                |
|11	  |3	 |LDA,n	   |Carga el operando en el acumulador	                        |                                                                                                                                |
|100	|4	 |OUTA	   |Coloca el valor del acumulador en el puerto de salida A	    |Ignora el operando                                                                                                              |
|101	|5	 |OUTB	   |Coloca el valor del acumulador en el puerto de salida B	    |Ignora el operando                                                                                                              |
|110	|6	 |INA	     |Carga el valor del puerto de entrada A en el acumulador	    |Ignora el operando                                                                                                              |
|111	|7	 |RD	     |Coloca el valor del acumulador en el Registro D (dirección) |Ignora el operando / Se usa para poder a acceder a 255 byte de la ROM (4 bits bajos del Registro D + 4 bits altos del operando) |
|1000	|8	 |RA	     |Coloca el valor del acumulador en el Registro A	            |Ignora el operando                                                                                                              |
|1001	|9	 |LDRA	   |Carga el valor de Registro A en el acumulador	              |Ignora el operando                                                                                                              |
|1010	|A	 |RB       |Coloca el valor del acumulador en el Registro B             |Ignora el operando                                                                                                              |
|1011	|B	 |LDRB     |Carga el valor de Registro B en el acumulador               |Ignora el operando                                                                                                              |
|1100	|C	 |JPI,n	   |Salto incondicional a la posición RD+Operando	              |                                                                                                                                |
|1101	|D	 |JPC,n	   |Salto condicional (CARRY) a la posición RD+Operando	        |                                                                                                                                |
|1110	|E	 |JPZ,n	   |Salto condicional (ZERO) a la posición RD+Operando	        |                                                                                                                                |

## Computadora de 4 bits
Esta computadora de 4 bits esta hecho en Proteus Profesional, si desea descargarlo vaya al siguiente enlace:

[Proteus Profesional](https://drive.google.com/file/d/18v0yWCBi03uWIsuru3Dm_VMh6fBxX6NW/view)

[Computadora 4 bits Proteus](https://drive.google.com/drive/folders/194GL_Ji9IcDH02Q3mdqr4Qegkiouvits?usp=sharing)

![image](https://user-images.githubusercontent.com/69225537/198195090-a2ff9246-e9f9-4528-8b62-632b5b9dbb28.png)
