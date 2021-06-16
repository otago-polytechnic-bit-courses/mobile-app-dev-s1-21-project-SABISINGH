package op.mobile.app.dev.singhs2.travelling.allCountryActivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import op.mobile.app.dev.singhs2.travelling.R.id.recycler_view_phrases_nz
import op.mobile.app.dev.singhs2.travelling.R.layout.activity_new_zealand
import op.mobile.app.dev.singhs2.travelling.adapter.ItemAdapter
import op.mobile.app.dev.singhs2.travelling.data.DatasourceNewZealand

class NewZealandActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_new_zealand)

        // Initialize data.
        val myDataset = DatasourceNewZealand().loadTest()
        val recyclerView = findViewById<RecyclerView>(recycler_view_phrases_nz)
        recyclerView.adapter = ItemAdapter(this, myDataset)
        recyclerView.setHasFixedSize(true)
    }
}