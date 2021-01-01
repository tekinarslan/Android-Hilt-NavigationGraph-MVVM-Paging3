object Dependencies {
    val kotlinDependencies = arrayListOf(
        Libraries.kotlinJdk,
        Libraries.kotlinCoreKtx,
        Libraries.coroutine
    )

    val googleDependencies = arrayListOf(
        Libraries.googleMaterial,
        Libraries.gson,
        Libraries.paging
    )

    val androidLifecycle = arrayListOf(
        Libraries.lifecycleViewmodel,
        Libraries.lifecycleLivedata
    )
    val androidLifecycleCompiler = arrayListOf(
        Libraries.lifecycleCompiler
    )

    val androidxDependencies = arrayListOf(
        Libraries.xFragmentKtx,
        Libraries.xFragment,
        Libraries.constraintLayout
    )

    val okhttpDependencies = arrayListOf(
        Libraries.okhttp,
        Libraries.okhttpLoggingInterceptor
    )

    val loggerDependencies = arrayListOf(
        Libraries.logger,
        Libraries.timber
    )

    val retrofitDependencies = arrayListOf(
        Libraries.retrofit,
        Libraries.retrofitConverterGson,
        Libraries.retrofitAdapterRxJava
    )

    val glideDependencies = arrayListOf(
        Libraries.glide,
        Libraries.glideOkhttpIntegration
    )

    val navigationDependencies = arrayListOf(
        Libraries.navigationFragment,
        Libraries.navigationUiKtx
    )

    val storageDependencies = arrayListOf(
        Libraries.dataStoragePreferences
    )

    val unitTestDependencies = arrayListOf(
        Libraries.junit,
        Libraries.coroutinesTest,
        Libraries.archCoreTest,
        Libraries.mockitoInline,
        Libraries.mockitoKotlin
    )
}

object Versions {
    const val hiltVersion = "2.30.1-alpha"
    const val kotlinVersion = "1.4.0"
    const val coroutineVersion = "1.4.2"
    const val kotlinCoreKtxVersion = "1.5.0-alpha02"
    const val navigationVersion = "2.3.1"
    const val sharedPreferenceVersion = "1.0.0-alpha05"
    const val loggerVersion = "2.2.0"
    const val timberVersion = "4.7.1"
    const val fragmentVersion = "1.2.4"
    const val dataBindingVersion = "4.1.1"
    const val googleMaterialVersion = "1.2.1"
    const val constraintLayoutVersion = "2.0.4"
    const val lifeCycleVersion = "2.2.0"

    const val retrofitVersion = "2.9.0"
    const val glideVersion = "4.11.0"

    const val gsonVersion = "2.8.6"
    const val okhttpVersion = "4.9.0"
    const val pagingVersion = "3.0.0-alpha11"
    const val junitVersion = "4.13"
    const val xJunitVersion = "1.1.2"
    const val testingCoreVersion = "2.1.0"
    const val coroutinesTestVersion = "1.4.2"
    const val mockitoVersion = "3.5.13"
    const val mockitoKotlinVersion = "2.2.0"

}

object Libraries {
    const val kotlinJdk = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlinVersion}"
    const val xFragmentKtx = "androidx.fragment:fragment-ktx:${Versions.fragmentVersion}"
    const val xFragment = "androidx.fragment:fragment:${Versions.fragmentVersion}"
    const val googleMaterial = "com.google.android.material:material:${Versions.googleMaterialVersion}"

    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayoutVersion}"
    const val dataBinding = "androidx.databinding:databinding-compiler:${Versions.dataBindingVersion}"
    const val paging = "androidx.paging:paging-runtime:${Versions.pagingVersion}"

    const val lifecycleViewmodel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifeCycleVersion}"
    const val lifecycleLivedata = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifeCycleVersion}"
    const val lifecycleCompiler = "androidx.lifecycle:lifecycle-compiler:${Versions.lifeCycleVersion}"

    const val kotlinCoreKtx = "androidx.core:core-ktx:${Versions.kotlinCoreKtxVersion}"
    const val coroutine = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutineVersion}"

    const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navigationVersion}"
    const val navigationUiKtx = "androidx.navigation:navigation-ui-ktx:${Versions.navigationVersion}"

    const val dataStoragePreferences = "androidx.datastore:datastore-preferences:${Versions.sharedPreferenceVersion}"

    const val logger = "com.orhanobut:logger:${Versions.loggerVersion}"
    const val timber = "com.jakewharton.timber:timber:${Versions.timberVersion}"

    const val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttpVersion}"
    const val okhttpLoggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttpVersion}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofitVersion}"
    const val retrofitConverterGson = "com.squareup.retrofit2:converter-gson:${Versions.retrofitVersion}"
    const val retrofitAdapterRxJava = "com.squareup.retrofit2:adapter-rxjava3:${Versions.retrofitVersion}"

    const val glide = "com.github.bumptech.glide:glide:${Versions.glideVersion}"
    const val glideOkhttpIntegration = "com.github.bumptech.glide:okhttp3-integration:${Versions.glideVersion}"
    const val glideCompiler = "com.github.bumptech.glide:compiler:${Versions.glideVersion}"

    const val hilt = "com.google.dagger:hilt-android:${Versions.hiltVersion}"
    const val hiltCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hiltVersion}"
    const val hiltViewModel = "androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha02"
    const val hiltViewModelCompiler = "androidx.hilt:hilt-compiler:1.0.0-alpha02"
    
    const val gson = "com.google.code.gson:gson:${Versions.gsonVersion}"

    const val junit = "junit:junit:${Versions.junitVersion}"
    const val androidxJunit = "androidx.test.ext:junit:${Versions.xJunitVersion}"
    const val archCoreTest = "androidx.arch.core:core-testing:${Versions.testingCoreVersion}"
    const val coroutinesTest = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutinesTestVersion}"

    const val mockitoAndroid = "org.mockito:mockito-android:${Versions.mockitoVersion}"
    const val mockitoInline = "org.mockito:mockito-inline:${Versions.mockitoVersion}"
    const val mockitoKotlin = "com.nhaarman.mockitokotlin2:mockito-kotlin:${Versions.mockitoKotlinVersion}"
}
