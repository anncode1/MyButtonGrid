
# Welcome to ButtonGrid Library!

Using this library you will be able to create a **Grid of Buttons** like this

<img width="320" alt="Screenshot 2023-05-11 at 19 23 04" src="https://github.com/anncode1/MyButtonGrid/assets/11036504/e8120b14-08b8-484d-8ca9-f8a7a168785e">

You will be able to define:
- Text Copy
- Gradient Background
- Trigger an Action 

## Implementation

Instructions: https://jitpack.io/#anncode1/MyButtonGrid/3.0

1. In your settings.gradle file add the maven jitpack repository `maven { url 'https://jitpack.io' }`   as follow:
```
dependencyResolutionManagement {  
      repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)  
      repositories {  
	      google()  
	      mavenCentral()  
	      maven { url 'https://jitpack.io' }  <--- this
	}
}
```
2. Add the dependency to the gradle project file.
```
dependencies {
	implementation 'com.github.anncode1:MyButtonGrid:3.0'
}
```

## How it works?

This UI component was made using Jetpack Compose.

1. The main Composable is called: `GridButton` this receives a List of `GridButtonConfiguration` 

2. `GridButtonConfiguration` is an interface that contains the basic fields for initialize the view.

    - text: String **-> text button copy**
    -  colors: Pair<Color, Color> **-> represents Gradient color**
    - onClick: () -> Unit **-> represents the button click action to trigger**

3. If you need to add extra validations to the data fields you can use the  `ButtonDecorator` class and inherit from there.

## Code Example
```kotlin
val buttons = getButtonDecorators()  
// We call the GridButton passing the Button list configuration and defining
/// the number of columns for the grid
GridButton(buttons = buttons, 3)
```

```kotlin
// We use the ButtonDecorator class to config every button
private fun getButtonDecorators() = listOf(  
	ButtonDecorator(  
	  "Home",  
	  Pair(Color(0xFFDD5E89), Color(0xFFF7BB97))  
	) { Toast.makeText(this@MainActivity, "Home", Toast.LENGTH_SHORT).show() },  
  ButtonDecorator(  
    "My Profile",  
    Pair(Color(0xFFB80F87), Color(0xFFF5B1D5))  
  ) { Toast.makeText(this@MainActivity, "My Profile", Toast.LENGTH_SHORT).show() },  
  ButtonDecorator(  
    "My Bag",  
    Pair(Color(0xFFDE6262), Color(0xFFFFB88C))  
  ) { Toast.makeText(this@MainActivity, "My Bag", Toast.LENGTH_SHORT).show() },  
  ButtonDecorator(  
    "Wish List",  
    Pair(Color(0xFFB80F87), Color(0xFFF5B1D5))  
  ) { Toast.makeText(this@MainActivity, "Wish List", Toast.LENGTH_SHORT).show() },  
  ButtonDecorator(  
    "Browse",  
    Pair(Color(0xFFF2709C), Color(0xFFFF9472))  
  ) { Toast.makeText(this@MainActivity, "Browse", Toast.LENGTH_SHORT).show() },  
  ButtonDecorator(  
    "Navigator",  
    Pair(Color(0xFFB80F87), Color(0xFFF5B1D5))  
  ) { Toast.makeText(this@MainActivity, "Navigator", Toast.LENGTH_SHORT).show() }  
)
```

## Result:
<img width="320" alt="Screenshot 2023-05-11 at 19 23 04" src="https://github.com/anncode1/MyButtonGrid/assets/11036504/e8120b14-08b8-484d-8ca9-f8a7a168785e">
