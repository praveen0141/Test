package com.example.mysongdb.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/mysongdb/data/repository/getEpisodesDataImpl;", "Lcom/example/mysongdb/domain/repository/getEpisodes;", "api", "Lcom/example/mysongdb/data/network/NetworkInterface;", "(Lcom/example/mysongdb/data/network/NetworkInterface;)V", "getepisodes", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/mysongdb/domain/Result;", "Lcom/example/mysongdb/data/model/EpisodeResponse/EpisodeResponse;", "app_debug"})
public final class getEpisodesDataImpl implements com.example.mysongdb.domain.repository.getEpisodes {
    private final com.example.mysongdb.data.network.NetworkInterface api = null;
    
    public getEpisodesDataImpl(@org.jetbrains.annotations.NotNull()
    com.example.mysongdb.data.network.NetworkInterface api) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.example.mysongdb.domain.Result<com.example.mysongdb.data.model.EpisodeResponse.EpisodeResponse>> getepisodes() {
        return null;
    }
}