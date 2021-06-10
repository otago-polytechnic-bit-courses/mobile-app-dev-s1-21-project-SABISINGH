package op.mobile.app.dev.singhs2.travelling.allCountryActivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import op.mobile.app.dev.singhs2.travelling.R
import op.mobile.app.dev.singhs2.travelling.adapter.ItemAdapter
import op.mobile.app.dev.singhs2.travelling.data.Datasource
import op.mobile.app.dev.singhs2.travelling.data.DatasourceGermany

class GermanyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_germany)

        // Initialize data.
        val myDataset = DatasourceGermany().loadTest()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view_phrases_gr)
        recyclerView.adapter = ItemAdapter(this, myDataset)

        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true)
    }
}