package org.example;

import org.example.Dictionary.Dictionary;
import org.example.Registrys.Registry;
import org.example.Sources.Diagnosis;
import org.example.Sources.Document;
import org.example.Sources.MedicalRecord;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Document doc = new Document(1,"Паспорт");
        Diagnosis dia = new Diagnosis(1,"Похмелье");

        Dictionary d = new Dictionary();

        d.addDocument(doc);
        d.addDiagnosis(dia);

        MedicalRecord mr = new MedicalRecord(
                1,
                "Иван",
                LocalDate.parse("2023-01-01"),
                1,
                1
        );

        MedicalRecord mr1 = new MedicalRecord(
                2,
                "Вася",
                LocalDate.parse("2023-01-02"),
                1,
                1
        );

        Registry r = new Registry(d);

        r.addMedicalRecord(mr);
        r.addMedicalRecord(mr1);

        r.displayRegistry();
    }
}