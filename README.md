# Welcome to AnimationLibKC!

## AnimationLibKC is a powerful Android animation library that offers a wide range of animations for enhancing your user interfaces. With over 20 animations already included and plans for continuous expansion, you can bring your apps to life with both 2D and 3D effects.

# Installation
## To integrate AnimationLibKC into your Android project, add the following lines to your project's build.gradle file:
```
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        maven(url = "https://jitpack.io")
    }
}
```
# Then, add the dependency:
```
dependencies {
    implementation "com.github.yusufkhan08070817:AnimatationLIbkc:Tag"
}

```
## Replace Tag =
``` 
1.0
```
with the specific version you wish to use.

Features
20+ Animations: Choose from a variety of animations to suit your app's needs.
2D and 3D Animations: Enjoy a mix of 2D and 3D effects for versatile visual enhancements.
Easy Integration: Simply add the library to your project and start using animations with ease.
Usage
Using AnimationLibKC is straightforward. Simply follow these steps:

Import Library: Make sure the library is added to your project's dependencies.
Choose Animation: Select the animation you want to use from the library.
# Example
##H ere's a quick example of how to use AnimationLibKC:
```

val imageView:ImageView=findViewById(R.id.imageView)
val anim= AnimationKC(this)
anim.AnimationStater(imageView,anim.rotate90)
```
# Contribution
We welcome contributions to AnimationLibKC! Whether you want to add new animations, improve existing ones, or fix bugs, your contributions are highly appreciated. Feel free to fork the repository, make your changes, and submit a pull request.

# License
AnimationLibKC is licensed under the MIT License. See the LICENSE file for more details.

# Contact
For any inquiries or feedback, please reach out to us at yusufkhan08070817@gmail.com

Thank you for using AnimationLibKC! We hope it brings your Android apps to life in exciting new ways.
