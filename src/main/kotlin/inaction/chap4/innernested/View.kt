package inaction.chap4.innernested

interface View {
    fun getCurrentState(): State
    fun restoreState(state: State) {}
}