-- begin COVIDCHECKUP_DOCTOR
create unique index IDX_COVIDCHECKUP_DOCTOR_UNIQ_EMAIL on COVIDCHECKUP_DOCTOR (EMAIL) ^
-- end COVIDCHECKUP_DOCTOR
-- begin COVIDCHECKUP_DIAGNOSIS
alter table COVIDCHECKUP_DIAGNOSIS add constraint FK_COVIDCHECKUP_DIAGNOSIS_ON_DOCTOR foreign key (DOCTOR_ID) references COVIDCHECKUP_DOCTOR(ID)^
alter table COVIDCHECKUP_DIAGNOSIS add constraint FK_COVIDCHECKUP_DIAGNOSIS_ON_PATIENT foreign key (PATIENT_ID) references COVIDCHECKUP_PATIENT(ID)^
create index IDX_COVIDCHECKUP_DIAGNOSIS_ON_DOCTOR on COVIDCHECKUP_DIAGNOSIS (DOCTOR_ID)^
create index IDX_COVIDCHECKUP_DIAGNOSIS_ON_PATIENT on COVIDCHECKUP_DIAGNOSIS (PATIENT_ID)^
-- end COVIDCHECKUP_DIAGNOSIS
