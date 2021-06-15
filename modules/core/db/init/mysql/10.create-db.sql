-- begin COVIDCHECKUP_DOCTOR
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
)^
-- end COVIDCHECKUP_DOCTOR
-- begin COVIDCHECKUP_DIAGNOSIS
create table COVIDCHECKUP_DIAGNOSIS (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    AUTO_NUM varchar(30),
    DOCTOR_ID varchar(32) not null,
    PATIENT_ID varchar(32) not null,
    FEVER boolean not null,
    COUGH boolean not null,
    SHORTNESS_BREATH boolean not null,
    FATIGUE boolean not null,
    MUSCLE_ACHES boolean not null,
    HEADACHE boolean not null,
    LOSS_TASTE boolean not null,
    SORE_THROAT boolean not null,
    CONGESTION boolean not null,
    NAUSEA boolean not null,
    DIARRHEA boolean not null,
    TOTAL_SCORE integer,
    --
    primary key (ID)
)^
-- end COVIDCHECKUP_DIAGNOSIS
-- begin COVIDCHECKUP_PATIENT
create table COVIDCHECKUP_PATIENT (
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
    BIRTH_DAY date,
    GENDER integer not null,
    --
    primary key (ID)
)^
-- end COVIDCHECKUP_PATIENT
-- begin COVIDCHECKUP_COVID_LEVEL
create table COVIDCHECKUP_COVID_LEVEL (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    SCORE integer not null,
    LEVEL_ varchar(255) not null,
    --
    primary key (ID)
)^
-- end COVIDCHECKUP_COVID_LEVEL
