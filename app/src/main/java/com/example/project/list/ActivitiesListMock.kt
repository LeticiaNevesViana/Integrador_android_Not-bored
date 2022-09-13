package Network
import com.example.project.model.ActivityModel
import com.example.project.R

object ActivityList {
    fun getActivityList(): List<ActivityModel> {
        return listOf(
            ActivityModel(
                id = 1,
                image= R.drawable.education_icon,
                activity = "education",
                title = "Learn a new language in 1 year.",
                price = "Free"

            ),
            ActivityModel(
                id = 2,
                image= R.drawable.recreational_icon,
                activity = "recreational",
                title = "learn how to play guitar",
                price = "Medium"
            ),
            ActivityModel(
                id = 3,
                image= R.drawable.social_icon,
                activity = "social",
                title = "How to apply for volunteer work?",
                price = "Free"
            ),
            ActivityModel(
                id = 4,
                image= R.drawable.diy_icon,
                activity = "diy",
                title = "Learn how to make a custom jeans.",
                price = "Medium"
            ),
            ActivityModel(
                id = 5,
                image= R.drawable.charity_icon,
                activity = "charity",
                title = "Save lives in winter, donating clothes and blankets.",
                price = "Medium"
            ),
            ActivityModel(
                id = 6,
                image= R.drawable.cooking_icon,
                activity = "cooking",
                title = "Learn how to make pancakes.",
                price = "Free"
            ),
            ActivityModel(
                id = 7,
                image= R.drawable.relaxation_icon,
                activity = "relaxation",
                title = "Learn yoga techniques.",
                price = "Medium"
            ),
            ActivityModel(
                id = 8,
                image= R.drawable.music_icon,
                activity = "music",
                title = "Write songs with your life experiences",
                price = "Medium"
            ),
            ActivityModel(
                id = 9,
                image= R.drawable.work_icon,
                activity = "busywork",
                title = "Organized your time to work more efficiently.",
                price = "Free"
            ),
            ActivityModel(
                id = 10,
                image= R.drawable.education_icon,
                activity = "education",
                title = "Learn about history.",
                price = "Free"

            ),
            ActivityModel(
                id = 11,
                image= R.drawable.recreational_icon,
                activity = "recreational",
                title = "Play thuth or dare.",
                price = "Medium"
            ),
            ActivityModel(
                id = 12,
                image= R.drawable.social_icon,
                activity = "social",
                title = "How to thow the most iconic bachelorette party of your frinds life",
                price = "Higth"
            ),
            ActivityModel(
                id = 13,
                image= R.drawable.diy_icon,
                activity = "diy",
                title = "Learn how to make a treehouse.",
                price = "Higth"
            ),
            ActivityModel(
                id = 14,
                image= R.drawable.charity_icon,
                activity = "charity",
                title = "Helping abused women learn a new craft.",
                price = "Free"
            ),
            ActivityModel(
                id = 15,
                image= R.drawable.cooking_icon,
                activity = "cooking",
                title = "Competition of best food with friends.",
                price = "Medium"
            ),
            ActivityModel(
                id = 16,
                image= R.drawable.relaxation_icon,
                activity = "relaxation",
                title = "Listen to your favorite songs.",
                price = "Free"
            ),
            ActivityModel(
                id = 17,
                image= R.drawable.music_icon,
                activity = "music",
                title = "Listen to a song you've never heard before",
                price = "Medium"
            ),
            ActivityModel(
                id = 18,
                image= R.drawable.work_icon,
                activity = "busywork",
                title = "Work focused.",
                price = "Medium"
            ),

        )
    }
}