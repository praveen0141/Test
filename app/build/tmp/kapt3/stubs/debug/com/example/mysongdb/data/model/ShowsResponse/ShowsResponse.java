package com.example.mysongdb.data.model.ShowsResponse;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bB\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u00c3\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\b\u0012\u0006\u0010\u001c\u001a\u00020\b\u0012\u0006\u0010\u001d\u001a\u00020\b\u0012\u0006\u0010\u001e\u001a\u00020\u0005\u0012\u0006\u0010\u001f\u001a\u00020\b\u0012\u0006\u0010 \u001a\u00020\u0001\u0012\u0006\u0010!\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\"J\t\u0010D\u001a\u00020\u0003H\u00c6\u0003J\t\u0010E\u001a\u00020\bH\u00c6\u0003J\t\u0010F\u001a\u00020\u0013H\u00c6\u0003J\t\u0010G\u001a\u00020\bH\u00c6\u0003J\t\u0010H\u001a\u00020\bH\u00c6\u0003J\t\u0010I\u001a\u00020\u0017H\u00c6\u0003J\t\u0010J\u001a\u00020\u0005H\u00c6\u0003J\t\u0010K\u001a\u00020\u001aH\u00c6\u0003J\t\u0010L\u001a\u00020\bH\u00c6\u0003J\t\u0010M\u001a\u00020\bH\u00c6\u0003J\t\u0010N\u001a\u00020\bH\u00c6\u0003J\t\u0010O\u001a\u00020\u0005H\u00c6\u0003J\t\u0010P\u001a\u00020\u0005H\u00c6\u0003J\t\u0010Q\u001a\u00020\bH\u00c6\u0003J\t\u0010R\u001a\u00020\u0001H\u00c6\u0003J\t\u0010S\u001a\u00020\u0005H\u00c6\u0003J\t\u0010T\u001a\u00020\u0001H\u00c6\u0003J\t\u0010U\u001a\u00020\bH\u00c6\u0003J\t\u0010V\u001a\u00020\nH\u00c6\u0003J\u000f\u0010W\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u00c6\u0003J\t\u0010X\u001a\u00020\u0005H\u00c6\u0003J\t\u0010Y\u001a\u00020\u000fH\u00c6\u0003J\t\u0010Z\u001a\u00020\bH\u00c6\u0003J\u00f5\u0001\u0010[\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u001d\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\b2\b\b\u0002\u0010 \u001a\u00020\u00012\b\b\u0002\u0010!\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\\\u001a\u00020]2\b\u0010^\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010_\u001a\u00020\u0005H\u00d6\u0001J\t\u0010`\u001a\u00020\bH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0006\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\r\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010&R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u0010\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010*R\u0011\u0010\u0011\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010*R\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u0010\u0014\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010*R\u0011\u0010\u0015\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010*R\u0011\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0011\u0010\u0018\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010&R\u0011\u0010\u0019\u001a\u00020\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0011\u0010\u001b\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010*R\u0011\u0010\u001c\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010*R\u0011\u0010\u001d\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010*R\u0011\u0010\u001e\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010&R\u0011\u0010\u001f\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010*R\u0011\u0010 \u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010(R\u0011\u0010!\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010&\u00a8\u0006a"}, d2 = {"Lcom/example/mysongdb/data/model/ShowsResponse/ShowsResponse;", "", "_links", "Lcom/example/mysongdb/data/model/ShowsResponse/Links;", "averageRuntime", "", "dvdCountry", "ended", "", "externals", "Lcom/example/mysongdb/data/model/ShowsResponse/Externals;", "genres", "", "id", "image", "Lcom/example/mysongdb/data/model/ShowsResponse/Image;", "language", "name", "network", "Lcom/example/mysongdb/data/model/ShowsResponse/Network;", "officialSite", "premiered", "rating", "Lcom/example/mysongdb/data/model/ShowsResponse/Rating;", "runtime", "schedule", "Lcom/example/mysongdb/data/model/ShowsResponse/Schedule;", "status", "summary", "type", "updated", "url", "webChannel", "weight", "(Lcom/example/mysongdb/data/model/ShowsResponse/Links;ILjava/lang/Object;Ljava/lang/String;Lcom/example/mysongdb/data/model/ShowsResponse/Externals;Ljava/util/List;ILcom/example/mysongdb/data/model/ShowsResponse/Image;Ljava/lang/String;Ljava/lang/String;Lcom/example/mysongdb/data/model/ShowsResponse/Network;Ljava/lang/String;Ljava/lang/String;Lcom/example/mysongdb/data/model/ShowsResponse/Rating;ILcom/example/mysongdb/data/model/ShowsResponse/Schedule;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Object;I)V", "get_links", "()Lcom/example/mysongdb/data/model/ShowsResponse/Links;", "getAverageRuntime", "()I", "getDvdCountry", "()Ljava/lang/Object;", "getEnded", "()Ljava/lang/String;", "getExternals", "()Lcom/example/mysongdb/data/model/ShowsResponse/Externals;", "getGenres", "()Ljava/util/List;", "getId", "getImage", "()Lcom/example/mysongdb/data/model/ShowsResponse/Image;", "getLanguage", "getName", "getNetwork", "()Lcom/example/mysongdb/data/model/ShowsResponse/Network;", "getOfficialSite", "getPremiered", "getRating", "()Lcom/example/mysongdb/data/model/ShowsResponse/Rating;", "getRuntime", "getSchedule", "()Lcom/example/mysongdb/data/model/ShowsResponse/Schedule;", "getStatus", "getSummary", "getType", "getUpdated", "getUrl", "getWebChannel", "getWeight", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class ShowsResponse {
    @org.jetbrains.annotations.NotNull()
    private final com.example.mysongdb.data.model.ShowsResponse.Links _links = null;
    private final int averageRuntime = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object dvdCountry = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String ended = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.mysongdb.data.model.ShowsResponse.Externals externals = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> genres = null;
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.example.mysongdb.data.model.ShowsResponse.Image image = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String language = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.mysongdb.data.model.ShowsResponse.Network network = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String officialSite = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String premiered = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.mysongdb.data.model.ShowsResponse.Rating rating = null;
    private final int runtime = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.example.mysongdb.data.model.ShowsResponse.Schedule schedule = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String status = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String summary = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String type = null;
    private final int updated = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String url = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object webChannel = null;
    private final int weight = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.mysongdb.data.model.ShowsResponse.ShowsResponse copy(@org.jetbrains.annotations.NotNull()
    com.example.mysongdb.data.model.ShowsResponse.Links _links, int averageRuntime, @org.jetbrains.annotations.NotNull()
    java.lang.Object dvdCountry, @org.jetbrains.annotations.NotNull()
    java.lang.String ended, @org.jetbrains.annotations.NotNull()
    com.example.mysongdb.data.model.ShowsResponse.Externals externals, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> genres, int id, @org.jetbrains.annotations.NotNull()
    com.example.mysongdb.data.model.ShowsResponse.Image image, @org.jetbrains.annotations.NotNull()
    java.lang.String language, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    com.example.mysongdb.data.model.ShowsResponse.Network network, @org.jetbrains.annotations.NotNull()
    java.lang.String officialSite, @org.jetbrains.annotations.NotNull()
    java.lang.String premiered, @org.jetbrains.annotations.NotNull()
    com.example.mysongdb.data.model.ShowsResponse.Rating rating, int runtime, @org.jetbrains.annotations.NotNull()
    com.example.mysongdb.data.model.ShowsResponse.Schedule schedule, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    java.lang.String summary, @org.jetbrains.annotations.NotNull()
    java.lang.String type, int updated, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.lang.Object webChannel, int weight) {
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
    
    public ShowsResponse(@org.jetbrains.annotations.NotNull()
    com.example.mysongdb.data.model.ShowsResponse.Links _links, int averageRuntime, @org.jetbrains.annotations.NotNull()
    java.lang.Object dvdCountry, @org.jetbrains.annotations.NotNull()
    java.lang.String ended, @org.jetbrains.annotations.NotNull()
    com.example.mysongdb.data.model.ShowsResponse.Externals externals, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> genres, int id, @org.jetbrains.annotations.NotNull()
    com.example.mysongdb.data.model.ShowsResponse.Image image, @org.jetbrains.annotations.NotNull()
    java.lang.String language, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    com.example.mysongdb.data.model.ShowsResponse.Network network, @org.jetbrains.annotations.NotNull()
    java.lang.String officialSite, @org.jetbrains.annotations.NotNull()
    java.lang.String premiered, @org.jetbrains.annotations.NotNull()
    com.example.mysongdb.data.model.ShowsResponse.Rating rating, int runtime, @org.jetbrains.annotations.NotNull()
    com.example.mysongdb.data.model.ShowsResponse.Schedule schedule, @org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    java.lang.String summary, @org.jetbrains.annotations.NotNull()
    java.lang.String type, int updated, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.lang.Object webChannel, int weight) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.mysongdb.data.model.ShowsResponse.Links component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.mysongdb.data.model.ShowsResponse.Links get_links() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getAverageRuntime() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getDvdCountry() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEnded() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.mysongdb.data.model.ShowsResponse.Externals component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.mysongdb.data.model.ShowsResponse.Externals getExternals() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getGenres() {
        return null;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.mysongdb.data.model.ShowsResponse.Image component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.mysongdb.data.model.ShowsResponse.Image getImage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLanguage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.mysongdb.data.model.ShowsResponse.Network component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.mysongdb.data.model.ShowsResponse.Network getNetwork() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOfficialSite() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPremiered() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.mysongdb.data.model.ShowsResponse.Rating component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.mysongdb.data.model.ShowsResponse.Rating getRating() {
        return null;
    }
    
    public final int component15() {
        return 0;
    }
    
    public final int getRuntime() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.mysongdb.data.model.ShowsResponse.Schedule component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.mysongdb.data.model.ShowsResponse.Schedule getSchedule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSummary() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    public final int component20() {
        return 0;
    }
    
    public final int getUpdated() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component22() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getWebChannel() {
        return null;
    }
    
    public final int component23() {
        return 0;
    }
    
    public final int getWeight() {
        return 0;
    }
}