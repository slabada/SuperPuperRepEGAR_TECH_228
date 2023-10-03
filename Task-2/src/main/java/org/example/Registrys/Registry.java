package org.example.Registrys;

import org.example.Dictionary.Dictionary;
import org.example.Sources.Diagnosis;
import org.example.Sources.Document;
import org.example.Sources.MedicalRecord;

import java.util.ArrayList;
import java.util.List;

public class Registry {
    private final List<MedicalRecord> records = new ArrayList<>();
    private final Dictionary dictionary;

    public Registry(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public void addMedicalRecord(MedicalRecord record) {
        records.add(record);
    }

    public void displayRegistry() {
        for (MedicalRecord record : records) {

            long documentCode = record.getDoc();
            Document document = dictionary.getDocumentByCode(documentCode);

            long diagnosisCode = record.getDiagnosis();
            Diagnosis diagnosis = dictionary.getDiagnosisByCode(diagnosisCode);

            System.out.println("код пациента: " + record.getCode());
            System.out.println("пациент: " + record.getPatientName());
            System.out.println("дата: " + record.getDate());
            System.out.println("документ: " + document.getName());
            System.out.println("диагноз: " + diagnosis.getName());
            System.out.println("-------------------------------------------------");
        }
    }
}
