package op.mobile.app.dev.singhs2.travelling.allCountryActivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import op.mobile.app.dev.singhs2.travelling.R.id.recycler_view_phrases_ch
import op.mobile.app.dev.singhs2.travelling.R.layout.activity_china
import op.mobile.app.dev.singhs2.travelling.adapter.ItemAdapter
import op.mobile.app.dev.singhs2.travelling.data.DatasourceChina

class ChinaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_china)

        // Initialize data.
        val myDataset = DatasourceChina().loadTest()
        val recyclerView = findViewById<RecyclerView>(recycler_view_phrases_ch)
        recyclerView.adapter = ItemAdapter(this, myDataset)
        recyclerView.setHasFixedSize(true)
    }
}