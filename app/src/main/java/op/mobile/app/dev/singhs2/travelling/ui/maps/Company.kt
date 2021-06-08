package op.mobile.app.dev.singhs2.travelling.ui.maps

import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.clustering.ClusterItem

data class Company(val latLng: LatLng, val name: String, val city: String) : ClusterItem {
    override fun getPosition(): LatLng = latLng
    override fun getTitle(): String = name
    override fun getSnippet(): String = ""
}