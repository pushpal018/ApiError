package com.recipe.search.ui.view.auth.appwrite_auth;

import android.content.Context;
import com.recipe.search.base.BasePresenter_MembersInjector;
import com.recipe.search.data.network.api_service.SearchApiService;
import com.recipe.search.rx.AppSchedulerProvider;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppwriteRegistrationPresenter_MembersInjector
    implements MembersInjector<AppwriteRegistrationPresenter> {
  private final Provider<AppSchedulerProvider> appSchedulerProvider;

  private final Provider<Context> contextProvider;

  private final Provider<SearchApiService> searchApiServiceProvider;

  public AppwriteRegistrationPresenter_MembersInjector(
      Provider<AppSchedulerProvider> appSchedulerProvider,
      Provider<Context> contextProvider,
      Provider<SearchApiService> searchApiServiceProvider) {
    this.appSchedulerProvider = appSchedulerProvider;
    this.contextProvider = contextProvider;
    this.searchApiServiceProvider = searchApiServiceProvider;
  }

  public static MembersInjector<AppwriteRegistrationPresenter> create(
      Provider<AppSchedulerProvider> appSchedulerProvider,
      Provider<Context> contextProvider,
      Provider<SearchApiService> searchApiServiceProvider) {
    return new AppwriteRegistrationPresenter_MembersInjector(
        appSchedulerProvider, contextProvider, searchApiServiceProvider);
  }

  @Override
  public void injectMembers(AppwriteRegistrationPresenter instance) {
    BasePresenter_MembersInjector.injectAppSchedulerProvider(instance, appSchedulerProvider.get());
    BasePresenter_MembersInjector.injectContext(instance, contextProvider.get());
    injectSearchApiService(instance, searchApiServiceProvider.get());
  }

  public static void injectSearchApiService(
      AppwriteRegistrationPresenter instance, SearchApiService searchApiService) {
    instance.searchApiService = searchApiService;
  }
}
