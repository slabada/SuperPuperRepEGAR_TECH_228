package org.example.Dictionary;

import org.example.Sources.Diagnosis;
import org.example.Sources.Document;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private final Map<Long, Document> documentMap = new HashMap<>();
    private final Map<Long, Diagnosis> diagnosisMap = new HashMap<>();

    public void addDocument(Document document) {
        documentMap.put(document.getCode(), document);
    }

    public void addDiagnosis(Diagnosis diagnosis) {
        diagnosisMap.put (diagnosis.getCode(), diagnosis);
    }

    public Document getDocumentByCode(long code) {
        return documentMap.get(code);
    }

    public Diagnosis getDiagnosisByCode(long code) {
        return diagnosisMap.get(code);
    }
}
