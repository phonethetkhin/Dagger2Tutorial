import com.example.dagger2tutorial.Motor
import com.example.dagger2tutorial.Vehicle
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
internal class MyModule {
    @Provides
    @Singleton
    fun provideMotor(): Motor {
        return Motor()
    }

    @Provides
    @Singleton
    fun provideVehicle(): Vehicle {
        return Vehicle(Motor())
    }
}