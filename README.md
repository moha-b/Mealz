# Mealz 
<img width="200" align="right" src="https://user-images.githubusercontent.com/73842931/224693767-d9cc8388-3327-4c4c-b44d-1ed09ac0ecea.png" alt="preview-meals" />
 
- Minimum SDK level 21
- Kotlin based
- Architecture
  - Clean Architecture (App layer - Data layer - Domain layer)
  - Repository pattern
  - Singleton pattern
- [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - used for surviving configuration changes and holding business logic for the views.
- [Live Data](https://developer.android.com/topic/libraries/architecture/livedata) - used to keep the view's data up to date. (the dependency in the gradle file but it's not used)
- [Hilt](https://dagger.dev/hilt/) - handles dependency injection/management.
- [Coroutines](https://github.com/Kotlin/kotlinx.coroutines) - used for reducing the complexity of asynchronous code and concurrency.
- [Kotlin Flow](https://kotlinlang.org/docs/reference/coroutines/flow.html) - used for simplistic cold observables
- [Android KTX](https://developer.android.com/kotlin/ktx) - a set of Kotlin extensions.
- [Glide](https://github.com/bumptech/glide) - a tried and true image loading library for android.
