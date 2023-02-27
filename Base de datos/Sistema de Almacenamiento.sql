create table Usuarios (
	IDUsuario int primary key auto_increment,
    nombre varchar (50) not null,
    apellido_paterno varchar (60) not null,
    apellido_materno varchar (60) not null,
	correo varchar (120) not null,
    usuario varchar (80) not null,
    contrasenia varchar (120),
    IDSexo int not null, -- Llave foranea
    indicador varchar (1)
);

create table Sexo (
	IDSexo int primary key auto_increment,
    Tipo varchar (4) not null
);

create table Productos (
	IDProducto int primary key auto_increment,
	nombre varchar (120) not null,
    indicador varchar (1)
);

create table Tipos_producto(
	IDTipo_producto int primary key auto_increment,
    Tipo varchar (50) not null,
	indicador varchar (1)
);

create table Productos_entrantes (
	IDProducto_entrante int primary key auto_increment,
    IDProducto int not null, -- Llave foranea
	IDTipo_producto int not null, -- Lave foranea
    IDUbicacion int not null, -- Llave foranea
	Cantidad int not null,
    Fecha date not null,
    indicador varchar (1)
);

create table Productos_salientes(
	IDProducto_saliente int primary key auto_increment,
    IDProducto int not null, -- Llave foranea
	IDTipo_producto int not null, -- Llave foranea
    Cantidad int not null,
    Descripcion varchar (150) not null,
    Fecha date not null,
    indicador varchar (1)
);

create table Ubicacion_productos(
	IDUbicacion_productos int primary key auto_increment,
    Ubicacion varchar (120),
    indicador varchar (1)
);
-- Establecemos las llavesd foraneas
Alter table Usuarios add foreign key (IDSexo) references Sexo(IDSexo);
Alter table Productos_entrantes add foreign key (IDProducto) references Productos(IDProducto);  
Alter table Productos_entrantes add foreign key (IDTipo_producto) references Tipos_producto(IDTipo_producto);
Alter table Productos_entrantes add foreign key (IDUbicacion) references Ubicacion_productos(IDUbicacion_productos);  
Alter table Productos_salientes add foreign key (IDProducto) references Productos(IDProducto);
Alter table Productos_salientes add foreign key (IDTipo_producto) references Tipos_producto(IDTipo_producto);

-- Insertamos datos de prueba
Insert into Sexo (Tipo) values ('F'), ('M'), ('Otro');
Insert into Usuarios (nombre, apellido_paterno, apellido_materno, correo, usuario, contrasenia, IDSexo) values ('Admin1', 'Admin1', 'Admin1', 'Admin1', 'Admin1', 'Admin1', 1);
Insert into productos (nombre, indicador) values ('Prueba1','S');
Insert into productos (nombre, indicador) values ('Prueba2','S');
Insert into productos (nombre, indicador) values ('Prueba3','S');
Insert into tipos_producto (Tipo, indicador) values ('Materias Primas','S');
Insert into tipos_producto (Tipo, indicador) values ('Productos Intermedios','S');
Insert into tipos_producto (Tipo, indicador) values ('Accesorios','S');
Insert into tipos_producto (Tipo, indicador) values ('Productos Terminados','S');
Insert into tipos_producto (Tipo, indicador) values ('Refacciones','S');
Insert into ubicacion_productos (Ubicacion, Indicador) values ('UbicacionPrueba1', 'S');

-- Pruebas
Select Nombre from Productos where IDProducto = 1 and indicador = 'S';
Select Tipo from Sexo where IDSexo = 1;
Select Tipo from Tipos_Producto where IDTipo_producto = 1 and indicador = 'S';
Select Ubicacion from ubicacion_productos where IDUbicacion_productos = 1 and indicador = 'S';
Select IDProducto from Productos where nombre = 'Prueba1' and indicador = 'S';
Select IDTipo_Producto from Tipos_producto where Tipo = 'Materias Primas' and Indicador = 'S';
Select IDUbicacion_productos from Ubicacion_productos where Ubicacion = 'UbicacionPrueba1' and Indicador = 'S';
