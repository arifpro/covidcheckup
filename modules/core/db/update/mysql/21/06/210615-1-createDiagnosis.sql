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
);