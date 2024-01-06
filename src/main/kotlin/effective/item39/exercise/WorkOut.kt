package effective.item39.exercise

import kotlin.properties.Delegates

// model 부분 --------------------------------
class Exercise(val name: String) // 운동에 대한 정보를 포함하는 클래스

sealed class WorkoutState
class PrepareState(val exercise: Exercise) : WorkoutState()
class ExerciseState(val exercise: Exercise) : WorkoutState()
data object DoneState : WorkoutState()  // data 키워드 제거 (object 자체가 싱글톤임)

fun List<Exercise>.toStates(): List<WorkoutState> =
    this.flatMap { exercise ->
        listOf(PrepareState(exercise), ExerciseState(exercise))
    } + DoneState

// presenter 부분 --------------------------------
class WorkoutPresenter(private val states: List<WorkoutState>) {
    private var currentStateIndex = 0

    // 현재 상태를 반환하고, 다음 상태로 이동
    fun getCurrentStateAndMoveToNext(): WorkoutState {
        val currentState = states.getOrElse(currentStateIndex) { DoneState }
        currentStateIndex++
        return currentState
    }

    // 다른 로직들...
}

// view 부분 --------------------------------

class ExerciseView(private val presenter: WorkoutPresenter) {
    private var state: WorkoutState by Delegates.observable<WorkoutState>(DoneState) { _, _, newState ->
        updateView(newState)
    }

    init {
        state = presenter.getCurrentStateAndMoveToNext()  // 초기 상태 설정
    }

    // 상태에 따른 뷰 업데이트 로직
    private fun updateView(newState: WorkoutState) {
        when (newState) {
            is PrepareState -> println("준비: ${newState.exercise.name}")
            is ExerciseState -> println("운동 중: ${newState.exercise.name}")
            is DoneState -> println("운동 끝")
        }
    }

    // 다음 상태로 이동
    fun moveToNextState() {
        state = presenter.getCurrentStateAndMoveToNext()
    }
}

