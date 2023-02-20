create table Usuarios (
	IDUsuario int primary key auto_increment,
    nombre varchar (50) not null,
    apellido_paterno varchar (60) not null,
    apellido_materno varchar (60) not null,
	correo varchar (120) not null,
    contrasenia varchar (120),
    IDSexo int null, -- Llave foranea
    indicador varchar (1)
);

create table Sexo (
	IDSexo int primary key auto_increment,
    Tipo varchar (4) not null
);
