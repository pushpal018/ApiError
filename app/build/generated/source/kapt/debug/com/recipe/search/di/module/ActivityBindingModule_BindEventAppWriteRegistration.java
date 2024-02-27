package com.recipe.search.di.module;

import com.recipe.search.di.scope.ActivityScope;
import com.recipe.search.ui.view.auth.appwrite_auth.AppwriteRegistrationActivity;
import com.recipe.search.ui.view.auth.appwrite_auth.AppwriteRegistrationModule;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      ActivityBindingModule_BindEventAppWriteRegistration.AppwriteRegistrationActivitySubcomponent
          .class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityBindingModule_BindEventAppWriteRegistration {
  private ActivityBindingModule_BindEventAppWriteRegistration() {}

  @Binds
  @IntoMap
  @ClassKey(AppwriteRegistrationActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      AppwriteRegistrationActivitySubcomponent.Builder builder);

  @Subcomponent(modules = AppwriteRegistrationModule.class)
  @ActivityScope
  public interface AppwriteRegistrationActivitySubcomponent
      extends AndroidInjector<AppwriteRegistrationActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<AppwriteRegistrationActivity> {}
  }
}
