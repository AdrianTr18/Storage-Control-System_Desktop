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

-- Establecemos las llavesd foraneas
Alter table Usuarios add foreign key (IDSexo) references Sexo(IDSexo);

-- Insertamos datos de prueba
Insert into Sexo (Tipo) values ('F'), ('M'), ('Otro');
Insert into Usuarios (nombre, apellido_paterno, apellido_materno, correo, usuario, contrasenia, IDSexo, indicador) values ('Admin1', 'Admin1', 'Admin1', 'Admin1', 'Admin1','Admin1',1, 'S');

Insert into Usuarios (nombre, apellido_paterno, apellido_materno, correo, usuario, contrasenia, IDSexo, indicador) values ('a', 'a', 'a', 'a', 'a','a', 1, 'S');
-- Pruebas
Select * from Usuarios u where u.usuario = 'a' and u.contrasenia = 'a';

Select * from Usuarios;

Select Tipo from Sexo where IDSexo = 1;
Select s.IDSexo from Sexo s where s.Tipo = 'M';
Select s.Tipo from Sexo s order by 1;