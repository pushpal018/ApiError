package com.recipe.search.ui.view.auth.appwrite_auth;

import android.content.Context;
import com.recipe.search.base.BasePresenter_MembersInjector;
import com.recipe.search.data.network.api_service.SearchApiService;
import com.recipe.search.rx.AppSchedulerProvider;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppwriteRegistrationPresenter_Factory
    implements Factory<AppwriteRegistrationPresenter> {
  private final Provider<AppwriteRegistrationContract.View> viewProvider;

  private final Provider<AppSchedulerProvider> appSchedulerProvider;

  private final Provider<Context> contextProvider;

  private final Provider<SearchApiService> searchApiServiceProvider;

  public AppwriteRegistrationPresenter_Factory(
      Provider<AppwriteRegistrationContract.View> viewProvider,
      Provider<AppSchedulerProvider> appSchedulerProvider,
      Provider<Context> contextProvider,
      Provider<SearchApiService> searchApiServiceProvider) {
    this.viewProvider = viewProvider;
    this.appSchedulerProvider = appSchedulerProvider;
    this.contextProvider = contextProvider;
    this.searchApiServiceProvider = searchApiServiceProvider;
  }

  @Override
  public AppwriteRegistrationPresenter get() {
    AppwriteRegistrationPresenter instance = new AppwriteRegistrationPresenter(viewProvider.get());
    BasePresenter_MembersInjector.injectAppSchedulerProvider(instance, appSchedulerProvider.get());
    BasePresenter_MembersInjector.injectContext(instance, contextProvider.get());
    AppwriteRegistrationPresenter_MembersInjector.injectSearchApiService(
        instance, searchApiServiceProvider.get());
    return instance;
  }

  public static AppwriteRegistrationPresenter_Factory create(
      Provider<AppwriteRegistrationContract.View> viewProvider,
      Provider<AppSchedulerProvider> appSchedulerProvider,
      Provider<Context> contextProvider,
      Provider<SearchApiService> searchApiServiceProvider) {
    return new AppwriteRegistrationPresenter_Factory(
        viewProvider, appSchedulerProvider, contextProvider, searchApiServiceProvider);
  }

  public static AppwriteRegistrationPresenter newAppwriteRegistrationPresenter(
      AppwriteRegistrationContract.View view) {
    return new AppwriteRegistrationPresenter(view);
  }
}
