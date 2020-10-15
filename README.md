# ViewModelLiveDataExampleKT

 [**LiveData**](https://developer.android.com/topic/libraries/architecture/livedata?hl=id)
 [**KTX**](https://developer.android.com/kotlin/ktx)

- Add dependencies on `Gradle`
```gradle
implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0"
implementation "androidx.activity:activity-ktx:1.1.0"
implementation "androidx.fragment:fragment-ktx:1.2.5"
```

- Make Class `MainVM`.
```kotlin
class MainVM: ViewModel(){

    val currentName: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
    
}
```

- Use `ViewModel` on activity
```kotlin
class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    // Use the 'by viewModels()' Kotlin property delegate
    // from the activity-ktx artifact
    private val model: MainVM by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        model.currentName.value = "Hallo GZeinNumer"

        model.currentName.observe(this, Observer {
            Log.d(TAG, "onCreate: $it")
        })
    }
}
```

---

```
Copyright 2020 M. Fadli Zein
```

