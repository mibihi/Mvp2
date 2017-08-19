package tutorialspoint7.example.com.mvp2

/**
 * Created by mibihi on 8/18/17.
 */
class MainInteractor(val presenter:MainPresenter) :MainMVP.Interactor{
    @Override
    fun getUsersFromServer() {
       //use this function to return a list of name or one name use   Retrofit later
        println("MainInteractor is sending out!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!")
        presenter.setNameOnText("hhhhhhhhhhhhhhh")
    }

}