package com.gslab.pepper.enrichment.model;

import java.io.Serializable;
import java.util.List;

public class CanonicalDocument implements Serializable {
    private String id;
    private List<Header> header;
    private List<AbstractGroup> abstractGroup;
    private List<Note> notes;
    private List<Object> dateGroup;
    private Object counts;
    private List<Object> doiGroup;
    private Object sourceMeta;
    private List<TitleGroup> titleGroup;
    private List<Object> kwdGroup;
    private List<Object> contribGroup;
    private Object mappingMeta;
    private List<ContentTypes> contentTypes;
    private List<Object> permissions;
    private String publicationStatus;
    private List<ArticleIdGroup> articleIdGroup;
    private Object publisher;
    private List<Object> assetGroup;
    private Object creativeWorkMeta;
    private List<Object> affGroup = null;

    public CanonicalDocument(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public static class Header {
        private String jobId;
        private String s3MetaLocation;
        private String batchId;
        private String batchDate;
        private String articleDeleted;
        private String uuid;
    }

    public static class AbstractGroup {
        private String abstractType;
        private String abstractLang;
        private String _abstract;
    }

    public static class ArticleIdGroup {
        private String articleIdType;
        private String datasourceId;
        private String articleId;
    }

    public static class ContentTypes {
        private String doctype;
        private String publicationType;
    }

    public static class Note {
        private String note;
        private String noteType;
    }

    public static class TitleGroup {
        private String titleType;
        private String titleLang;
        private String title;
    }
}
