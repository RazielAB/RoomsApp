package com.example.affirmations.data
import com.example.affirmations.model.Affirmation
import com.example.affirmations.R


class Datasource {
    fun loadAffirmations() :  List<Affirmation>  {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1,R.string.bldg1, R.string.max_c1, R.string.curr_c1),
            Affirmation(R.string.affirmation2,R.string.bldg2, R.string.max_c2, R.string.curr_c2),
            Affirmation(R.string.affirmation3,R.string.bldg3, R.string.max_c3, R.string.curr_c3),
            Affirmation(R.string.affirmation4,R.string.bldg4, R.string.max_c4, R.string.curr_c4),
            Affirmation(R.string.affirmation5,R.string.bldg5, R.string.max_c5, R.string.curr_c5),
            Affirmation(R.string.affirmation6,R.string.bldg6, R.string.max_c6, R.string.curr_c6),
            Affirmation(R.string.affirmation7,R.string.bldg7, R.string.max_c7, R.string.curr_c7),
            Affirmation(R.string.affirmation8,R.string.bldg8, R.string.max_c8, R.string.curr_c8),
            Affirmation(R.string.affirmation9,R.string.bldg9, R.string.max_c9, R.string.curr_c9),
            Affirmation(R.string.affirmation10,R.string.bldg10, R.string.max_c10, R.string.curr_c10)
        )
    }
}