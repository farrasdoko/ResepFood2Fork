# Resep Food2Fork
Rest API Example With MVP. This app is using [Food2Fork API](https://www.food2fork.com/about/api)

---
## Screenshot

![1](https://raw.githubusercontent.com/farrasdoko/ResepFood2Fork/master/SCREENSHOT/1.png) ![2](https://raw.githubusercontent.com/farrasdoko/ResepFood2Fork/master/SCREENSHOT/2.png)

---
## Gradle
```Java
apply plugin: 'com.android.application'

android {

    compileSdkVersion 28
    defaultConfig {
        applicationId "com.farrasabiyyu12.resepfood2fork"
        minSdkVersion 15
        targetSdkVersion 28
        versionCode 1
        versionName "1.0"
        testInstrumentationRunner "android.support.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android.txt'), 'proguard-rules.pro'
        }
    }
}
```

``` Java
dependencies {

    implementation fileTree(include: ['*.jar'], dir: 'libs')
    implementation 'com.android.support:appcompat-v7:28.0.0'
    implementation 'com.android.support.constraint:constraint-layout:1.1.3'
    testImplementation 'junit:junit:4.12'
    androidTestImplementation 'com.android.support.test:runner:1.0.2'
    androidTestImplementation 'com.android.support.test.espresso:espresso-core:3.0.2'
    //    TODO BUTTERKNIFE
    implementation 'com.jakewharton:butterknife:8.8.1'
    annotationProcessor 'com.jakewharton:butterknife-compiler:8.8.1'
    //    TODO GLIDE
    implementation 'com.github.bumptech.glide:glide:4.8.0'
    annotationProcessor 'com.github.bumptech.glide:compiler:4.8.0'
    //    TODO RETROFIT
    implementation 'com.squareup.retrofit2:retrofit:2.4.0'
    implementation 'com.squareup.retrofit2:converter-gson:2.4.0'
    //    TODO DESIGN
    implementation 'com.android.support:design:28.0.0'
    implementation 'com.android.support:cardview-v7:28.0.0'
    
}
```
---

## Contact

* Instagram : [farrasdoko](https://instagram.com/farrasdoko)
* facebook : [farrasdoko](https://facebook.com/farras.abiyyu.31)
* Email : farras.abiyyu.doko@gmail.com
