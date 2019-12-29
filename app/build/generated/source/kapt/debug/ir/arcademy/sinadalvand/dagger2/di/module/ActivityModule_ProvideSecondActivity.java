package ir.arcademy.sinadalvand.dagger2.di.module;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import ir.arcademy.sinadalvand.dagger2.SecondActivity;
import ir.arcademy.sinadalvand.dagger2.di.scope.ActivityScope;

@Module(subcomponents = ActivityModule_ProvideSecondActivity.SecondActivitySubcomponent.class)
public abstract class ActivityModule_ProvideSecondActivity {
  private ActivityModule_ProvideSecondActivity() {}

  @Binds
  @IntoMap
  @ClassKey(SecondActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SecondActivitySubcomponent.Factory builder);

  @Subcomponent(modules = SafePrefModule.class)
  @ActivityScope
  public interface SecondActivitySubcomponent extends AndroidInjector<SecondActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SecondActivity> {}
  }
}
