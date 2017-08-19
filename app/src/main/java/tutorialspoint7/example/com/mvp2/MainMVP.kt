package tutorialspoint7.example.com.mvp2

/**
 * Created by mibihi on 8/18/17.
 */
class MainMVP {
    interface View {
        fun setNameOnText(name:String)
    }
    interface Presenter{
        fun displayNameInTextView(name:String)
    }
    interface Interactor{}
}