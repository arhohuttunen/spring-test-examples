create table customer(
    id bigint,
    name varchar(256),
    address varchar(256),
    registration_date timestamp
);

create table product_order(
    id bigint,
    creation_date timestamp
);

create sequence hibernate_sequence;
