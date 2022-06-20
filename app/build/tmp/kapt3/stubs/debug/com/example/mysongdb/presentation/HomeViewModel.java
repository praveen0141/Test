package com.example.mysongdb.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/example/mysongdb/presentation/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "showsUseCase", "Lcom/example/mysongdb/domain/usecase/showsUseCase;", "(Lcom/example/mysongdb/domain/usecase/showsUseCase;)V", "episodeDetailState", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/example/mysongdb/data/model/EpisodeResponse/EpisodeResponse;", "getEpisodeDetailState", "()Lkotlinx/coroutines/flow/StateFlow;", "episodeDetails", "Lkotlinx/coroutines/flow/MutableStateFlow;", "loading", "Landroidx/compose/runtime/MutableState;", "", "getLoading", "()Landroidx/compose/runtime/MutableState;", "loadingShow", "getLoadingShow", "loadingState", "loadingStateShow", "showDetails", "Lcom/example/mysongdb/presentation/ShowResponseStatus;", "showsDetailState", "getShowsDetailState", "Showit", "", "name", "", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.mysongdb.domain.usecase.showsUseCase showsUseCase = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.mysongdb.data.model.EpisodeResponse.EpisodeResponse> episodeDetails = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.example.mysongdb.data.model.EpisodeResponse.EpisodeResponse> episodeDetailState = null;
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> loadingState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> loading = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.mysongdb.presentation.ShowResponseStatus> showDetails = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.example.mysongdb.presentation.ShowResponseStatus> showsDetailState = null;
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> loadingStateShow = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> loadingShow = null;
    
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.example.mysongdb.domain.usecase.showsUseCase showsUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.mysongdb.data.model.EpisodeResponse.EpisodeResponse> getEpisodeDetailState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<java.lang.Boolean> getLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.mysongdb.presentation.ShowResponseStatus> getShowsDetailState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<java.lang.Boolean> getLoadingShow() {
        return null;
    }
    
    public final void Showit(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
}