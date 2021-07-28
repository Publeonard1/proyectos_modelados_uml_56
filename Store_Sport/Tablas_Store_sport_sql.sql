CREATE TABLE Clientes(
    indentificacion varchar(10) PRIMARY KEY,
    nombres varchar(20),
    apellidos varchar(30)
);

CREATE TABLE Marcas ( /* Este codigo se hizo en SQLite3 para determinar una nueva tabla para la subclase Marca */
	codigo_marca INTEGER,
	nombre TEXT(30),
	CONSTRAINT Marcas_PK PRIMARY KEY (codigo_marca)
);

