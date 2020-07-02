package app.tetsukay.androidtemplates

import android.app.Application
import app.tetsukay.androidtemplates.di.AppComponent
import app.tetsukay.androidtemplates.di.DaggerAppComponent


class App : Application() {

    companion object {
        lateinit var appComponent: AppComponent
            private set
    }

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.factory().create(applicationContext)
        appComponent.inject(this)
    }
}
