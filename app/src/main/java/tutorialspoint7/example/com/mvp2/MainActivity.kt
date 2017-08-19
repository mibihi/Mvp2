package tutorialspoint7.example.com.mvp2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),MainMVP.View {

val presenter: MainPresenter by lazy{MainPresenter(this)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1.setOnClickListener{
            txt1.text=""
            presenter.displayNameInTextView("xxxxxxx")
            Toast.makeText(this,"toooast",Toast.LENGTH_LONG).show()
        }
    }
    override fun setNameOnText(name: String) {
        txt1.text = name
    }


}
