create table if not exists MEMBER
(
    id bigint auto_increment not null,
    email varchar(255) not null unique,
    password varchar(255) not null,
    age int not null,
    primary key(id)
);