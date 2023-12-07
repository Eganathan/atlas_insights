# Atlas Insight
## Atlas Insights: Your Gateway to Global Discovery

### Description
Atlas Insights is an interactive and educational app designed to bring the world's geography to your fingertips. With an expansive database covering countries, capitals, landmarks, and cultural information, this app offers an enriching journey through global territories. Whether you're a curious explorer, a student, or a geography enthusiast, Atlas Insights makes learning about the world both fun and informative. Dive into detailed maps, enjoy engaging quizzes, and uncover fascinating facts about different regions. From the bustling cities of Europe to the serene landscapes of Oceania, Atlas Insights is your personal guide to understanding and appreciating the diversity of our planet.

### Features

### 

### Demo
This is a Kotlin Multiplatform project targeting Android, iOS, Desktop.

* `/composeApp` is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
  - `commonMain` is for code that’s common for all targets.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
    For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
    `iosMain` would be the right folder for such calls.

* `/iosApp` contains iOS applications. Even if you’re sharing your UI with Compose Multiplatform, 
  you need this entry point for your iOS app. This is also where you should add SwiftUI code for your project.


Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html)…