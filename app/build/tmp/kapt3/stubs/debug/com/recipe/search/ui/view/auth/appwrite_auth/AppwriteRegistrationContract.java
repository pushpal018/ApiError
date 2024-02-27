package com.recipe.search.ui.view.auth.appwrite_auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/recipe/search/ui/view/auth/appwrite_auth/AppwriteRegistrationContract;", "", "Presenter", "View", "app_debug"})
public abstract interface AppwriteRegistrationContract {
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/recipe/search/ui/view/auth/appwrite_auth/AppwriteRegistrationContract$View;", "Lcom/recipe/search/base/BaseContract$View;", "signupDidSucceed", "", "response", "Lcom/recipe/search/data/network/api_response/SignUpResponseModel;", "app_debug"})
    public static abstract interface View extends com.recipe.search.base.BaseContract.View {
        
        public abstract void signupDidSucceed(@org.jetbrains.annotations.NotNull
        com.recipe.search.data.network.api_response.SignUpResponseModel response);
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\"\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/recipe/search/ui/view/auth/appwrite_auth/AppwriteRegistrationContract$Presenter;", "Lcom/recipe/search/base/BaseContract$Presenter;", "doSignUp", "", "dataMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "app_debug"})
    public static abstract interface Presenter extends com.recipe.search.base.BaseContract.Presenter {
        
        public abstract void doSignUp(@org.jetbrains.annotations.NotNull
        java.util.HashMap<java.lang.String, java.lang.String> dataMap);
    }
}