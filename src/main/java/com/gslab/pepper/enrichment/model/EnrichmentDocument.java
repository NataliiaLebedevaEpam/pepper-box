package com.gslab.pepper.enrichment.model;

import com.gslab.pepper.input.FieldDataFunctions;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

public class EnrichmentDocument implements Serializable {
    private String id;
    private List<Header> header = Collections.singletonList(new Header());
    private List<AbstractGroup> abstractGroup = Collections.singletonList(new AbstractGroup());
    private List<Note> notes = Collections.singletonList(new Note());
    private List<Object> dateGroup = Collections.singletonList("date group");
    private List<DoiGroup> doiGroup = Collections.singletonList(new DoiGroup());
    private SourceMeta sourceMeta = new SourceMeta();
    private List<TitleGroup> titleGroup = Collections.singletonList(new TitleGroup());
    private List<Object> kwdGroup = Collections.singletonList("kwd group");
    private List<Object> contribGroup = Collections.singletonList("contrib group");
    private Object mappingMeta = "mapping meta";
    private List<ContentTypes> contentTypes = Collections.singletonList(new ContentTypes());
    private List<Object> permissions = Collections.singletonList("permission");
    private String publicationStatus = FieldDataFunctions.RANDOM_STRING("Published", "UNPUBLISHED", "WAITING FOR PUBLISHING");
    private List<ArticleIdGroup> articleIdGroup =  Collections.singletonList(new ArticleIdGroup());
    private Publisher publisher = new Publisher();
    private List<Object> assetGroup =  Collections.singletonList("asset group");
    private Object creativeWorkMeta = FieldDataFunctions.RANDOM_ALPHA_NUMERIC("qwertyuiopasdfghjklzxcvbnm1234567890", 10);
    private List<Object> affGroup =  Collections.singletonList(FieldDataFunctions.FIRST_NAME());
    private String timestamp = String.valueOf(FieldDataFunctions.TIMESTAMP());
    private String dataset = "performance test dataset";

    public EnrichmentDocument(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    static class Header implements Serializable {
        private String jobId = "jobId";
        private String s3MetaLocation = "s3MetaLocation";
        private String batchId = FieldDataFunctions.RANDOM_ALPHA_NUMERIC("qwertyuiopasdfghjklzxcvbnm1234567890", 10);
        private String batchDate = FieldDataFunctions.RANDOM_ALPHA_NUMERIC("qwertyuiopasdfghjklzxcvbnm1234567890", 10);
        private String articleDeleted = FieldDataFunctions.RANDOM_STRING("true", "false");
        private String uuid = FieldDataFunctions.UUID();
    }

    static class AbstractGroup implements Serializable {
        private String abstractType = FieldDataFunctions.RANDOM_ALPHA_NUMERIC("qwertyuiopasdfghjklzxcvbnm1234567890", 10);
        private String abstractLang = FieldDataFunctions.RANDOM_ALPHA_NUMERIC("qwertyuiopasdfghjklzxcvbnm1234567890", 10);
        private String _abstract = FieldDataFunctions.RANDOM_ALPHA_NUMERIC("qwertyuiopasdfghjklzxcvbnm1234567890", 10);
    }

    static class ArticleIdGroup implements Serializable {
        private String articleIdType = FieldDataFunctions.RANDOM_ALPHA_NUMERIC("qwertyuiopasdfghjklzxcvbnm1234567890", 10);
        private String datasourceId = FieldDataFunctions.RANDOM_ALPHA_NUMERIC("qwertyuiopasdfghjklzxcvbnm1234567890", 10);
        private String articleId = FieldDataFunctions.RANDOM_ALPHA_NUMERIC("qwertyuiopasdfghjklzxcvbnm1234567890", 10);
    }

    static class ContentTypes implements Serializable {
        private String doctype = FieldDataFunctions.FIRST_NAME();
        private String publicationType = FieldDataFunctions.LAST_NAME();
    }

    static class Note implements Serializable {
        private String note = FieldDataFunctions.FIRST_NAME();
        private String noteType = FieldDataFunctions.LAST_NAME();
    }

    static class TitleGroup implements Serializable {
        private String titleType = FieldDataFunctions.USERNAME();
        private String titleLang = FieldDataFunctions.RANDOM_STRING("en", "fr", "it", "de", "fi");
        private String title = FieldDataFunctions.USERNAME();
    }

    static class DoiGroup implements Serializable {
        private String doiType = FieldDataFunctions.FIRST_NAME();
        private String doi = FieldDataFunctions.LAST_NAME();
    }

    static class SourceMeta implements Serializable {
        private String sourceIssn = "sourceIssn";
        private String sourceEissn = "sourceEissn";
        private List<SourceTitleGroup> sourceTitleGroup = Collections.singletonList(new SourceTitleGroup());

        public static class SourceTitleGroup implements Serializable {
            private String sourceTitleType = "sourceTitleType";
            private String title = FieldDataFunctions.USERNAME();
        }
    }

    static class Publisher implements Serializable {
        private String publisherName = FieldDataFunctions.USERNAME();
        private Object publisherLoc = FieldDataFunctions.RANDOM_STRING("USA", "UK", "EU", "CAN");
    }

}
