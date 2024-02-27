package com.recipe.search.ui.view.auth.appwrite_auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/recipe/search/ui/view/auth/appwrite_auth/AppwriteRegistrationActivity;", "Lcom/recipe/search/base/MvpBaseActivity;", "Lcom/recipe/search/ui/view/auth/appwrite_auth/AppwriteRegistrationPresenter;", "Lcom/recipe/search/ui/view/auth/appwrite_auth/AppwriteRegistrationContract$View;", "()V", "binding", "Lcom/recipe/search/databinding/ActivitySignUpBinding;", "getContentView", "Landroid/view/View;", "onViewReady", "", "savedInstanceState", "Landroid/os/Bundle;", "intent", "Landroid/content/Intent;", "signupDidSucceed", "response", "Lcom/recipe/search/data/network/api_response/SignUpResponseModel;", "app_debug"})
public final class AppwriteRegistrationActivity extends com.recipe.search.base.MvpBaseActivity<com.recipe.search.ui.view.auth.appwrite_auth.AppwriteRegistrationPresenter> implements com.recipe.search.ui.view.auth.appwrite_auth.AppwriteRegistrationContract.View {
    private com.recipe.search.databinding.ActivitySignUpBinding binding;
    
    public AppwriteRegistrationActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.view.View getContentView() {
        return null;
    }
    
    @java.lang.Override
    public void onViewReady(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState, @org.jetbrains.annotations.NotNull
    android.content.Intent intent) {
    }
    
    @java.lang.Override
    public void signupDidSucceed(@org.jetbrains.annotations.NotNull
    com.recipe.search.data.network.api_response.SignUpResponseModel response) {
    }
}