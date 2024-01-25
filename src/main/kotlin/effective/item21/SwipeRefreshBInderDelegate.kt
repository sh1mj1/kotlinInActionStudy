package effective.item21

/*

class SwipeRefreshBInderDelegate(val id: Int) {
    private var cache: SwipeRefreshLayout? = null

    operator fun getValue(activity: Activity, prop: KProperty<*>): SwipeRefreshLayout {
        return cache ?: activity.findViewById<SwipeRefreshLayout>(id)
            .also { cache = it }
    }

    operator fun getValue(fragment: Fragment, prop: KProperty<*>): SwipeRefreshLayout {
        return cache ?: fragment.view.findViewById<SwipeRefreshLayout>(id)
            .also { cache = it }
    }
}
*/
