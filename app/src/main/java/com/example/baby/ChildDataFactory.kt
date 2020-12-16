package com.example.baby

object ChildDataFactory {
    private val colors = listOf(
        R.color.bluedark,
        R.color.bluelight,
        R.color.greendark,
        R.color.greenlight,
        R.color.orangedark,
        R.color.orangelight
    )
    private val titles = arrayListOf(
        "One",
        "Two",
        "Three",
        "Four",
        "Five"
    )

    fun getChildren(count: Int): List<ChildModel> {
        val children = mutableListOf<ChildModel>()
        repeat(count) {
            val child = ChildModel(colors.random(), titles.random())
            children.add(child)
        }
        return children
    }
}