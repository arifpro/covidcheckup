alter table COVIDCHECKUP_DIAGNOSIS add constraint FK_COVIDCHECKUP_DIAGNOSIS_ON_PATIENT foreign key (PATIENT_ID) references COVIDCHECKUP_PATIENT(ID);