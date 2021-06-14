package op.mobile.app.dev.singhs2.travelling.allCountryActivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import op.mobile.app.dev.singhs2.travelling.R.id.recycler_view_phrases_in
import op.mobile.app.dev.singhs2.travelling.R.layout.activity_india
import op.mobile.app.dev.singhs2.travelling.adapter.ItemAdapter
import op.mobile.app.dev.singhs2.travelling.data.DataSourceIndia

class IndiaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_india)

        // Initialize data.
        val myDataset = DataSourceIndia().loadTest()
        val recyclerView = findViewById<RecyclerView>(recycler_view_phrases_in)
        recyclerView.adapter = ItemAdapter(this, myDataset)
        recyclerView.setHasFixedSize(true)
    }
}