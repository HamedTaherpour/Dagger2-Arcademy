package ir.arcademy.sinadalvand.dagger2.di.module;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import ir.arcademy.sinadalvand.dagger2.MainActivity;
import ir.arcademy.sinadalvand.dagger2.di.scope.ActivityScope;

@Module(subcomponents = ActivityModule_ProvideMainAcitivty.MainActivitySubcomponent.class)
public abstract class ActivityModule_ProvideMainAcitivty {
  private ActivityModule_ProvideMainAcitivty() {}

  @Binds
  @IntoMap
  @ClassKey(MainActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MainActivitySubcomponent.Factory builder);

  @Subcomponent(modules = SafePrefModule.class)
  @ActivityScope
  public interface MainActivitySubcomponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MainActivity> {}
  }
}
