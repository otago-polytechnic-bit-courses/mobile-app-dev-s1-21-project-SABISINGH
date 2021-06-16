package op.mobile.app.dev.singhs2.travelling.data

import op.mobile.app.dev.singhs2.travelling.R
import op.mobile.app.dev.singhs2.travelling.model.KeyPhrasesTest

class DatasourceMexico {
    fun loadTest(): List<KeyPhrasesTest> {
        return listOf<KeyPhrasesTest>(
            KeyPhrasesTest(R.string.Mexico_phrase_1),
            KeyPhrasesTest(R.string.Mexico_phrase_1_meaning),
            KeyPhrasesTest(R.string.Mexico_phrase_2),
            KeyPhrasesTest(R.string.Mexico_phrase_2_meaning),
            KeyPhrasesTest(R.string.Mexico_phrase_3),
            KeyPhrasesTest(R.string.Mexico_phrase_3_meaning),
            KeyPhrasesTest(R.string.Mexico_phrase_4),
            KeyPhrasesTest(R.string.Mexico_phrase_4_meaning),
            KeyPhrasesTest(R.string.Mexico_phrase_5),
            KeyPhrasesTest(R.string.Mexico_phrase_5_meaning),
            KeyPhrasesTest(R.string.Mexico_phrase_6),
            KeyPhrasesTest(R.string.Mexico_phrase_6_meaning)
        )
    }
}