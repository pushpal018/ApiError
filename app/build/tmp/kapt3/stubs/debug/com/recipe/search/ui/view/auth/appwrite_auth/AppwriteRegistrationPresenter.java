package com.recipe.search.ui.view.auth.appwrite_auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0005J,\u0010\f\u001a\u00020\r2\"\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000fj\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010`\u0011H\u0016R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0012"}, d2 = {"Lcom/recipe/search/ui/view/auth/appwrite_auth/AppwriteRegistrationPresenter;", "Lcom/recipe/search/base/BasePresenter;", "Lcom/recipe/search/ui/view/auth/appwrite_auth/AppwriteRegistrationContract$View;", "Lcom/recipe/search/ui/view/auth/appwrite_auth/AppwriteRegistrationContract$Presenter;", "view", "(Lcom/recipe/search/ui/view/auth/appwrite_auth/AppwriteRegistrationContract$View;)V", "searchApiService", "Lcom/recipe/search/data/network/api_service/SearchApiService;", "getSearchApiService", "()Lcom/recipe/search/data/network/api_service/SearchApiService;", "setSearchApiService", "(Lcom/recipe/search/data/network/api_service/SearchApiService;)V", "doSignUp", "", "dataMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "app_debug"})
public final class AppwriteRegistrationPresenter extends com.recipe.search.base.BasePresenter<com.recipe.search.ui.view.auth.appwrite_auth.AppwriteRegistrationContract.View> implements com.recipe.search.ui.view.auth.appwrite_auth.AppwriteRegistrationContract.Presenter {
    @javax.inject.Inject
    public com.recipe.search.data.network.api_service.SearchApiService searchApiService;
    
    @javax.inject.Inject
    public AppwriteRegistrationPresenter(@org.jetbrains.annotations.NotNull
    com.recipe.search.ui.view.auth.appwrite_auth.AppwriteRegistrationContract.View view) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.recipe.search.data.network.api_service.SearchApiService getSearchApiService() {
        return null;
    }
    
    public final void setSearchApiService(@org.jetbrains.annotations.NotNull
    com.recipe.search.data.network.api_service.SearchApiService p0) {
    }
    
    @java.lang.Override
    public void doSignUp(@org.jetbrains.annotations.NotNull
    java.util.HashMap<java.lang.String, java.lang.String> dataMap) {
    }
}