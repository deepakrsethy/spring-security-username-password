-- DROP SCHEMA "security-db-schema";

CREATE SCHEMA "security-db-schema" AUTHORIZATION postgres;

-- DROP TABLE "security-db-schema".users;

CREATE TABLE "security-db-schema".users (
	id uuid NOT NULL,
	first_name varchar(255) NOT NULL,
	last_name varchar(255) NOT NULL,
	"password" varchar(255) NOT NULL,
	user_name varchar(255) NOT NULL,
	user_role varchar(255) NOT NULL,
	CONSTRAINT users_pkey PRIMARY KEY (id)
);

INSERT INTO "security-db-schema".users (id,first_name,last_name,"password",user_name,user_role) VALUES
	 ('84f191e9-5258-4ccc-a923-c415e0d7242e','Clark','kent','superman','Superman','admin'),
	 ('9da9c86f-f9c3-405d-8a0c-9f3c0dd26f4c','Tony','Stark','ironman','Ironman','manager'),
	 ('9a772ab8-0cf3-4637-89f6-2f578acdd757','Bruce','Wayne','batman','Batman','manager'),
	 ('396672bb-ca24-45c6-b14c-dd0d6eb58499','Barry','Allen','flash','Flash','employee'),
	 ('3f6bf675-9cad-4b69-8eaa-65906a1c4e3c','Thor','Nors','thor','Thor','employee'),
	 ('916201ee-519d-44a3-a6d9-ad9540de7597','Steve','Rogers','captain','captain','employee'),
	 ('d560081c-0cda-4180-91bf-10a7e5f7f302','Peter','Parker','spiderman','Spiderman','employee'),
	 ('4e51d11f-f9de-49e8-a3de-fce9adf179ac','Diana','Amazon','wonderwoman','Wonderwoman','employee'),
	 ('92e76152-1dc5-4339-994e-8619f0c7f8d0','Arthur','Curry','aquaman','Aquaman','employee'),
	 ('16ef6174-71c2-4bea-aca8-29b9b5a41490','Bruce','Banner','hulk','Hulk','employee');