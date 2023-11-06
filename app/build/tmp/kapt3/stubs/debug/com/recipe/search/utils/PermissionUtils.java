package com.recipe.search.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lcom/recipe/search/utils/PermissionUtils;", "", "preferenceManager", "Lcom/recipe/search/data/prefs/PreferenceManager;", "(Lcom/recipe/search/data/prefs/PreferenceManager;)V", "requestPermissionLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "getRequestPermissionLauncher", "()Landroidx/activity/result/ActivityResultLauncher;", "setRequestPermissionLauncher", "(Landroidx/activity/result/ActivityResultLauncher;)V", "checkPermission", "", "context", "Landroid/content/Context;", "permission", "listener", "Lcom/recipe/search/utils/PermissionUtils$OnPermissionAskListener;", "shouldAskPermission", "", "OnPermissionAskListener", "app_debug"})
public final class PermissionUtils {
    private final com.recipe.search.data.prefs.PreferenceManager preferenceManager = null;
    public androidx.activity.result.ActivityResultLauncher<java.lang.String> requestPermissionLauncher;
    
    public PermissionUtils(@org.jetbrains.annotations.NotNull
    com.recipe.search.data.prefs.PreferenceManager preferenceManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.activity.result.ActivityResultLauncher<java.lang.String> getRequestPermissionLauncher() {
        return null;
    }
    
    public final void setRequestPermissionLauncher(@org.jetbrains.annotations.NotNull
    androidx.activity.result.ActivityResultLauncher<java.lang.String> p0) {
    }
    
    private final boolean shouldAskPermission() {
        return false;
    }
    
    public final boolean shouldAskPermission(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String permission) {
        return false;
    }
    
    public final void checkPermission(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String permission, @org.jetbrains.annotations.NotNull
    com.recipe.search.utils.PermissionUtils.OnPermissionAskListener listener) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lcom/recipe/search/utils/PermissionUtils$OnPermissionAskListener;", "", "onNeedPermission", "", "onPermissionGranted", "onPermissionPreviouslyDenied", "onPermissionPreviouslyDeniedWithNeverAskAgain", "app_debug"})
    public static abstract interface OnPermissionAskListener {
        
        public abstract void onNeedPermission();
        
        public abstract void onPermissionPreviouslyDenied();
        
        public abstract void onPermissionPreviouslyDeniedWithNeverAskAgain();
        
        public abstract void onPermissionGranted();
    }
}