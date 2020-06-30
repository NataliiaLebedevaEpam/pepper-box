package com.gslab.pepper.enrichment.model;

import java.io.Serializable;

public class KafkaMessage implements Serializable{

    private EnrichmentDocument document;
    private String job_id;
    private String batch_id;
    private String unique_key;

    public EnrichmentDocument getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = new EnrichmentDocument(document);
    }

    public String getJob_id() {
        return job_id;
    }

    public void setJob_id(String job_id) {
        this.job_id = job_id;
    }

    public String getBatch_id() {
        return batch_id;
    }

    public void setBatch_id(String batch_id) {
        this.batch_id = batch_id;
    }

    public String getUnique_key() {
        return unique_key;
    }

    public void setUnique_key(String unique_key) {
        this.unique_key = unique_key;
    }

    @Override
    public String toString() {
        return "Message{" +
                "document=" + document.getId() +
                ", job_id='" + job_id + '\'' +
                ", batch_id='" + batch_id + '\'' +
                ", unique_key=" + unique_key +
                '}';
    }
}
