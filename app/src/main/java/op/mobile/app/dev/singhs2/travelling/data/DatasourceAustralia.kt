package op.mobile.app.dev.singhs2.travelling.data

import op.mobile.app.dev.singhs2.travelling.R
import op.mobile.app.dev.singhs2.travelling.model.KeyPhrasesTest

class DatasourceAustralia {
    fun loadTest(): List<KeyPhrasesTest> {
        return listOf<KeyPhrasesTest>(
            KeyPhrasesTest(R.string.Australia_phrase_1),
            KeyPhrasesTest(R.string.Australia_phrase_1_meaning),
            KeyPhrasesTest(R.string.Australia_phrase_2),
            KeyPhrasesTest(R.string.Australia_phrase_2_meaning),
            KeyPhrasesTest(R.string.Australia_phrase_3),
            KeyPhrasesTest(R.string.Australia_phrase_3_meaning),
            KeyPhrasesTest(R.string.Australia_phrase_4),
            KeyPhrasesTest(R.string.Australia_phrase_4_meaning),
            KeyPhrasesTest(R.string.Australia_phrase_5),
            KeyPhrasesTest(R.string.Australia_phrase_5_meaning),
            KeyPhrasesTest(R.string.Australia_phrase_6),
            KeyPhrasesTest(R.string.Australia_phrase_6_meaning),
            KeyPhrasesTest(R.string.Australia_phrase_7),
            KeyPhrasesTest(R.string.Australia_phrase_7_meaning)
        )
    }
}