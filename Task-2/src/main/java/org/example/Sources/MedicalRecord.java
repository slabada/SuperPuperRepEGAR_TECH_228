package org.example.Sources;

import java.time.LocalDate;

public class MedicalRecord {
    private long code;
    private String patientName;
    private LocalDate date;
    private long doc;
    private long diagnosis;

    public MedicalRecord(long code,
                         String patientName,
                         LocalDate date,
                         long doc,
                         long diagnosis) {
        this.code = code;
        this.patientName = patientName;
        this.date = date;
        this.doc = doc;
        this.diagnosis = diagnosis;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public long getDoc() {
        return doc;
    }

    public void setDoc(long doc) {
        this.doc = doc;
    }

    public long getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(long diagnosis) {
        this.diagnosis = diagnosis;
    }
}
