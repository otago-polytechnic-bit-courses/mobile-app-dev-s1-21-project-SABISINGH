package op.mobile.app.dev.singhs2.travelling

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_quiz.*

class QuizActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        btn_start.setOnClickListener {

            if (et_name.text.toString().isEmpty()) {
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT).show()
            }
                        else {

                val intent = Intent(this@QuizActivity, QuizQuestionsActivity::class.java)

                startActivity(intent)
                finish()
            }
        }
    }
}