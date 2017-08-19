package tutorialspoint7.example.com.mvp2

import android.view.View

/**
 * Created by mibihi on 8/18/17.
 */
class MainPresenter(var view : MainMVP.View) :MainMVP.Presenter{
    val interactor = MainInteractor(this)
    override fun displayNameInTextView(name: String) {
        interactor.getUsersFromServer()
    }
@Override
    fun  setNameOnText(name: String) {
         view.setNameOnText(name)
    }
}