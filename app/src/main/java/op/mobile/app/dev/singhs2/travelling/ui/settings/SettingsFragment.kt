package op.mobile.app.dev.singhs2.travelling.ui.settings

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.widget.SwitchCompat
import op.mobile.app.dev.singhs2.travelling.R
import op.mobile.app.dev.singhs2.travelling.R.id.*

class SettingsFragment : Fragment() {
//    private lateinit var viewModel: SettingsViewModel
    private lateinit var sharedPreference: SharedPreferences
    private lateinit var themeChangeSwitch: SwitchCompat

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.settings_fragment, container, false)
        sharedPreference = activity?.getPreferences(Context.MODE_PRIVATE)!!
        themeChangeSwitch = view.findViewById(R.id.toggleSwitch)
        val isDarkMode: Boolean = sharedPreference.getBoolean(getString(R.string.switch_dark_mode), false)
        if (isDarkMode) {
            (activity as AppCompatActivity?)!!.delegate.localNightMode =
                AppCompatDelegate.MODE_NIGHT_YES
        } else {
            (activity as AppCompatActivity?)!!.delegate.localNightMode =
                AppCompatDelegate.MODE_NIGHT_NO
        }
        themeChangeSwitch.isChecked = isDarkMode == true
        themeChangeSwitch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                (activity as AppCompatActivity?)!!.delegate.localNightMode =
                    AppCompatDelegate.MODE_NIGHT_YES
                sharedPreference.edit().putBoolean(getString(R.string.switch_dark_mode), isChecked).apply()
            } else {
                (activity as AppCompatActivity?)!!.delegate.localNightMode =
                    AppCompatDelegate.MODE_NIGHT_NO
                sharedPreference.edit().putBoolean(getString(R.string.switch_dark_mode), isChecked).apply()
            }
        }

        val facebook = view?.findViewById<Button>(facebook)
        val github = view?.findViewById<Button>(github)
        val privacyPolicy = view?.findViewById<Button>(privacyPolicy)
        val termsAndConditions = view?.findViewById<Button>(termsAndConditions)
        val aboutUs = view?.findViewById<Button>(aboutUs)

        facebook?.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.settings_facebook_link)))
            startActivity(intent)
        }
        github?.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.settings_github_link)))
            startActivity(intent)
        }
        privacyPolicy?.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("file:///D:/IN721%20-%20Mobile%20Application%20Development/project/feature-Settings/Privacy%20policy.html"))
            startActivity(intent)
        }
        termsAndConditions?.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("file:///D:/IN721%20-%20Mobile%20Application%20Development/project/feature-Settings/Terms%20&%20Conditions.html"))
            startActivity(intent)
        }
        aboutUs?.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("file:///C:/Users/angel/OneDrive/Desktop/project/feature-Settings/About%20Us.html"))
            startActivity(intent)
        }
        return view
    }
}