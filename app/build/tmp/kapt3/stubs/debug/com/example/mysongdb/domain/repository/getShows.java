package com.example.mysongdb.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/example/mysongdb/domain/repository/getShows;", "", "getShows", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/mysongdb/domain/Result;", "Lcom/example/mysongdb/data/model/ShowsResponse/ShowsResponse;", "name", "", "app_debug"})
public abstract interface getShows {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.example.mysongdb.domain.Result<com.example.mysongdb.data.model.ShowsResponse.ShowsResponse>> getShows(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
}