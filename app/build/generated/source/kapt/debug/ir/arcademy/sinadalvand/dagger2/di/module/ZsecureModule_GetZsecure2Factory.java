// Generated by Dagger (https://dagger.dev).
package ir.arcademy.sinadalvand.dagger2.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import ir.arcademy.sinadalvand.dagger2.Zsecure;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ZsecureModule_GetZsecure2Factory implements Factory<Zsecure> {
  private final ZsecureModule module;

  public ZsecureModule_GetZsecure2Factory(ZsecureModule module) {
    this.module = module;
  }

  @Override
  public Zsecure get() {
    return getZsecure2(module);
  }

  public static ZsecureModule_GetZsecure2Factory create(ZsecureModule module) {
    return new ZsecureModule_GetZsecure2Factory(module);
  }

  public static Zsecure getZsecure2(ZsecureModule instance) {
    return Preconditions.checkNotNull(instance.getZsecure2(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
