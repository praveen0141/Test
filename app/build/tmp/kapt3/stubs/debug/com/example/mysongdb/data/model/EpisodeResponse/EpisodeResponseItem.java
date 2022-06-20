package com.example.mysongdb.data.model.EpisodeResponse;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0015J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\tH\u00c6\u0003J\t\u0010+\u001a\u00020\tH\u00c6\u0003J\t\u0010,\u001a\u00020\u0005H\u00c6\u0003J\t\u0010-\u001a\u00020\u0005H\u00c6\u0003J\t\u0010.\u001a\u00020\u0005H\u00c6\u0003J\t\u0010/\u001a\u00020\u0005H\u00c6\u0003J\t\u00100\u001a\u00020\u0005H\u00c6\u0003J\t\u00101\u001a\u00020\u0005H\u00c6\u0003J\t\u00102\u001a\u00020\tH\u00c6\u0003J\t\u00103\u001a\u00020\u000bH\u00c6\u0003J\t\u00104\u001a\u00020\u0005H\u00c6\u0003J\t\u00105\u001a\u00020\tH\u00c6\u0003J\t\u00106\u001a\u00020\u000fH\u00c6\u0003J\u0095\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u0005H\u00c6\u0001J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010;\u001a\u00020\tH\u00d6\u0001J\t\u0010<\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0011\u0010\r\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0010\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0011\u0010\u0011\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0011\u0010\u0012\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0011\u0010\u0013\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u0019R\u0011\u0010\u0014\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019\u00a8\u0006="}, d2 = {"Lcom/example/mysongdb/data/model/EpisodeResponse/EpisodeResponseItem;", "", "_links", "Lcom/example/mysongdb/data/model/EpisodeResponse/Links;", "airdate", "", "airstamp", "airtime", "id", "", "image", "Lcom/example/mysongdb/data/model/EpisodeResponse/Image;", "name", "number", "rating", "Lcom/example/mysongdb/data/model/EpisodeResponse/Rating;", "runtime", "season", "summary", "type", "url", "(Lcom/example/mysongdb/data/model/EpisodeResponse/Links;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/example/mysongdb/data/model/EpisodeResponse/Image;Ljava/lang/String;ILcom/example/mysongdb/data/model/EpisodeResponse/Rating;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "get_links", "()Lcom/example/mysongdb/data/model/EpisodeResponse/Links;", "getAirdate", "()Ljava/lang/String;", "getAirstamp", "getAirtime", "getId", "()I", "getImage", "()Lcom/example/mysongdb/data/model/EpisodeResponse/Image;", "getName", "getNumber", "getRating", "()Lcom/example/mysongdb/data/model/EpisodeResponse/Rating;", "getRuntime", "getSeason", "getSummary", "getType", "getUrl", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class EpisodeResponseItem {
    @org.jetbrains.annotations.NotNull()
    private final com.example.mysongdb.data.model.EpisodeResponse.Links _links = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String airdate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String airstamp = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String airtime = null;
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.example.mysongdb.data.model.EpisodeResponse.Image image = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    private final int number = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.example.mysongdb.data.model.EpisodeResponse.Rating rating = null;
    private final int runtime = 0;
    private final int season = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String summary = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String type = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String url = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.mysongdb.data.model.EpisodeResponse.EpisodeResponseItem copy(@org.jetbrains.annotations.NotNull()
    com.example.mysongdb.data.model.EpisodeResponse.Links _links, @org.jetbrains.annotations.NotNull()
    java.lang.String airdate, @org.jetbrains.annotations.NotNull()
    java.lang.String airstamp, @org.jetbrains.annotations.NotNull()
    java.lang.String airtime, int id, @org.jetbrains.annotations.NotNull()
    com.example.mysongdb.data.model.EpisodeResponse.Image image, @org.jetbrains.annotations.NotNull()
    java.lang.String name, int number, @org.jetbrains.annotations.NotNull()
    com.example.mysongdb.data.model.EpisodeResponse.Rating rating, int runtime, int season, @org.jetbrains.annotations.NotNull()
    java.lang.String summary, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public EpisodeResponseItem(@org.jetbrains.annotations.NotNull()
    com.example.mysongdb.data.model.EpisodeResponse.Links _links, @org.jetbrains.annotations.NotNull()
    java.lang.String airdate, @org.jetbrains.annotations.NotNull()
    java.lang.String airstamp, @org.jetbrains.annotations.NotNull()
    java.lang.String airtime, int id, @org.jetbrains.annotations.NotNull()
    com.example.mysongdb.data.model.EpisodeResponse.Image image, @org.jetbrains.annotations.NotNull()
    java.lang.String name, int number, @org.jetbrains.annotations.NotNull()
    com.example.mysongdb.data.model.EpisodeResponse.Rating rating, int runtime, int season, @org.jetbrains.annotations.NotNull()
    java.lang.String summary, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.mysongdb.data.model.EpisodeResponse.Links component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.mysongdb.data.model.EpisodeResponse.Links get_links() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAirdate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAirstamp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAirtime() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.mysongdb.data.model.EpisodeResponse.Image component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.mysongdb.data.model.EpisodeResponse.Image getImage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int getNumber() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.mysongdb.data.model.EpisodeResponse.Rating component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.mysongdb.data.model.EpisodeResponse.Rating getRating() {
        return null;
    }
    
    public final int component10() {
        return 0;
    }
    
    public final int getRuntime() {
        return 0;
    }
    
    public final int component11() {
        return 0;
    }
    
    public final int getSeason() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSummary() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUrl() {
        return null;
    }
}