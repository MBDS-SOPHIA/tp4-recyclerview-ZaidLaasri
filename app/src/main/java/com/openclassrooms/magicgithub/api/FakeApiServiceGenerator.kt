package com.openclassrooms.magicgithub.api

import com.openclassrooms.magicgithub.model.User
import java.util.*

object FakeApiServiceGenerator {


    @JvmField
    var FAKE_USERS = mutableListOf(
        User("001", "Jake", "https://i.pravatar.cc/150?u=1"),
        User("002", "Paul", "https://i.pravatar.cc/150?u=2"),
        User("003", "Phil", "https://i.pravatar.cc/150?u=3"),
        User("004", "Guillaume", "https://i.pravatar.cc/150?u=4"),
        User("005", "Francis", "https://i.pravatar.cc/150?u=5"),
        User("006", "George", "https://i.pravatar.cc/150?u=6"),
        User("007", "Louis", "https://i.pravatar.cc/150?u=7"),
        User("008", "Mateo", "https://i.pravatar.cc/150?u=8"),
        User("009", "April", "https://i.pravatar.cc/150?u=9"),
        User("010", "Louise", "https://i.pravatar.cc/150?u=10"),
        User("011", "Elodie", "https://i.pravatar.cc/150?u=11"),
        User("012", "Helene", "https://i.pravatar.cc/150?u=12"),
        User("013", "Fanny", "https://i.pravatar.cc/150?u=13"),
        User("014", "Laura", "https://i.pravatar.cc/150?u=14"),
        User("015", "Gertrude", "https://i.pravatar.cc/150?u=15"),
        User("016", "Chloé", "https://i.pravatar.cc/150?u=16"),
        User("017", "April", "https://i.pravatar.cc/150?u=17"),
        User("018", "Marie", "https://i.pravatar.cc/150?u=18"),
        User("019", "Henri", "https://i.pravatar.cc/150?u=19"),
        User("020", "Rémi", "https://i.pravatar.cc/150?u=20")
    )

    @JvmField
    var FAKE_USERS_RANDOM = Arrays.asList(
        User("021", "Lea", "https://i.pravatar.cc/150?u=21"),
        User("022", "Geoffrey", "https://i.pravatar.cc/150?u=22"),
        User("023", "Simon", "https://i.pravatar.cc/150?u=23"),
        User("024", "André", "https://i.pravatar.cc/150?u=24"),
        User("025", "Leopold", "https://i.pravatar.cc/150?u=25")
    )
}