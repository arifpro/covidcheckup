create table COVIDCHECKUP_DOCTOR (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    FIRST_NAME varchar(30) not null,
    LAST_NAME varchar(30) not null,
    EMAIL varchar(255),
    --
    primary key (ID)
);