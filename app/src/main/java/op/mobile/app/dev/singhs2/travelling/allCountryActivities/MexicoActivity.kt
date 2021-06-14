package op.mobile.app.dev.singhs2.travelling.allCountryActivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import op.mobile.app.dev.singhs2.travelling.R.id.recycler_view_phrases_me
import op.mobile.app.dev.singhs2.travelling.R.layout.activity_mexico
import op.mobile.app.dev.singhs2.travelling.adapter.ItemAdapter
import op.mobile.app.dev.singhs2.travelling.data.DatasourceMexico

class MexicoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_mexico)

        // Initialize data.
        val myDataset = DatasourceMexico().loadTest()
        val recyclerView = findViewById<RecyclerView>(recycler_view_phrases_me)
        recyclerView.adapter = ItemAdapter(this, myDataset)
        recyclerView.setHasFixedSize(true)
    }
}