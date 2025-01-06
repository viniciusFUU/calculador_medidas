create database calc_values;

use calc_values;

create table client(
	id_client int auto_increment primary key,
    client_name varchar(255) not null,
    client_number varchar(11) not null,
    client_state varchar(55) not null,
    client_city varchar(255) not null,
    client_neighborhood varchar(55) not null,
    client_street varchar(255) not null,
    client_house_number int not null
);

create table service(
	id_service int auto_increment primary key,
    id_client int not null,
    service_description varchar(255) not null,
    service_measure_side float(3,2) not null,
    service_measure_heigth float(3,2) not null,
    service_measure_base float(3, 2) not null,
    meter_value double(3,2) not null,
    service_value double(3,2) not null,
    
    foreign key (id_client) references client(id_client)
);