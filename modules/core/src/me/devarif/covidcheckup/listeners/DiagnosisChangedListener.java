package me.devarif.covidcheckup.listeners;

import com.haulmont.cuba.core.EntityManager;
import com.haulmont.cuba.core.app.UniqueNumbersAPI;
import com.haulmont.cuba.core.app.events.EntityChangedEvent;
import com.haulmont.cuba.core.entity.Entity;
import com.haulmont.cuba.core.listener.BeforeInsertEntityListener;
import me.devarif.covidcheckup.entity.Diagnosis;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

import javax.inject.Inject;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

@Component("covidcheckup_DiagnosisChangedListener")
public class DiagnosisChangedListener implements BeforeInsertEntityListener<Diagnosis> {

    @Inject
    private UniqueNumbersAPI uniqueNumbersAPI;

    @TransactionalEventListener(phase = TransactionPhase.BEFORE_COMMIT)
    public void beforeCommit(EntityChangedEvent<Diagnosis, UUID> event) {

    }


    @Override
    public void onBeforeInsert(Diagnosis entity, EntityManager entityManager) {
        long id = uniqueNumbersAPI.getNextNumber("diagnosis");
        String ymd = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        String num = String.format("%04d",id);
        entity.setAutoNum(ymd+num);
    }
}