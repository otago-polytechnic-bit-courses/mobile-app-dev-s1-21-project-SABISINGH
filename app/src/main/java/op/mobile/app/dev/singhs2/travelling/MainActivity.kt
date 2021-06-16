package op.mobile.app.dev.singhs2.travelling

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import op.mobile.app.dev.singhs2.travelling.R.drawable.travelearth

@Suppress("DEPRECATION")
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
        if (pressTime + 1000 > System.currentTimeMillis()) {
            exitToastMessage.cancel()
            val alertDialog = AlertDialog.Builder(this).create()
            alertDialog.setTitle(getString(R.string.exit_app))
            alertDialog.setIcon(travelearth)
            alertDialog.setMessage(getString(R.string.backpress_exit_confirmation_message))
            alertDialog.setCancelable(false)
            alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, getString(R.string.backpress_exit_yes)) { dialog, which ->
                finish()
                dialog.dismiss()
            }
            alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, getString(R.string.backpress_no_text)) { dialog, which ->
                dialog.dismiss()
            }
            alertDialog.show()
        } else {
            exitToastMessage = Toast.makeText(
                this,
                getString(R.string.backpress_toast_confirmation),
                Toast.LENGTH_SHORT
            )
            exitToastMessage.show()
        }
        pressTime = System.currentTimeMillis()
    }
}