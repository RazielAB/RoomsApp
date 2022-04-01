package com.example.affirmations.model

import androidx.annotation.StringRes

data class Affirmation(
    @StringRes val stringResourceRoomName: Int,
    @StringRes val stringResourceBuilding: Int,
    @StringRes val stringResourceMaxCapacity: Int,
    @StringRes val stringResourceCurrCapacity: Int


) {
}