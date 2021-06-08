package op.mobile.app.dev.singhs2.travelling

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    var pressTime: Long = 0
    lateinit var exitToastMessage: Toast
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val navView: BottomNavigationView = findViewById(R.id.navigation_view)
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.navigation_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home,
                R.id.navigation_translation,
                R.id.navigation_phrases,
                R.id.navigation_quiz,
                R.id.navigation_settings
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }


    override fun onBackPressed() {
        if (pressTime + 2000 > System.currentTimeMillis()) {
            exitToastMessage.cancel()
            val alertDialog = AlertDialog.Builder(this).create()
            alertDialog.setTitle("Exit App")
            alertDialog.setIcon(R.drawable.alert)
            alertDialog.setMessage("Are you sure you want to exit ?")
            alertDialog.setCancelable(false)
            alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "Yes") { dialog, which ->
                finish()
                dialog.dismiss()
            }

            alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "No") { dialog, which ->
                dialog.dismiss()
            }
            alertDialog.show()
        } else {
            exitToastMessage = Toast.makeText(
                this,
                "Please press twice if you want to exit the app",
                Toast.LENGTH_SHORT
            )
            exitToastMessage.show()
        }
        pressTime = System.currentTimeMillis()
    }
}