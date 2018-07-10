drop table if exists ingredients;
drop table if exists receipts;
drop table if exists ingredient_name;
drop table if exists users;


create table users (id_user serial,
       	     	  name_user varchar(32),
		  prenom_user varchar(32),
		  mail_user varchar(124) not null unique,
		  password_mdp varchar(64),
		  salt varchar(32),
		  constraint pk_user primary key (id_user)
		  );
		  

create table ingredient_name ( name_ingredient varchar(32),
			       constraint pk_ingredient_name primary key (name_ingredient)
			       );


create table receipts ( id_receipts serial,
       	     	      	name_receipts varchar(64),
			number_persons int,
			creator int,
			constraint pk_receipts primary key (id_receipts),
			constraint fk_receiptes foreign key (creator) references users(id_user)
			);
			

create table ingredients ( name_ingredient varchar(32),
			   amount float,
			   receipts int,
			   constraint pk_ingredients primary key(name_ingredient, receipts),
			   constraint fk_ingredient_name foreign key(name_ingredient) references ingredient_name(name_ingredient),
			   constraint fk_ingredient_receipts foreign key(receipts) references receipts(id_receipts)
			   );


insert into users values ( default, 'haingue', 'fabien', 'fabien.haingue@gmail.com', 'azerty', 'totototo' );
