# AnimeFlow - Anime Streaming Android App

A production-ready anime streaming application built with Kotlin, Jetpack Compose, and modern Android architecture patterns. This app provides a Crunchyroll-like experience with seamless streaming, episode tracking, and personalized recommendations.

## 🎯 Features

- 🎬 **Stream Anime** - Watch thousands of anime series and movies with adaptive bitrate streaming
- 🔍 **Advanced Search & Filtering** - Find anime by genre, season, rating, and keywords
- 👤 **User Authentication** - Secure login and registration with JWT tokens
- ❤️ **Watchlist & Favorites** - Save your favorite anime and track watching progress
- 📺 **Episode Management** - Browse episodes, track watched progress, resume from last watched
- 💬 **Reviews & Ratings** - Rate and review anime series
- 🌍 **Multi-Language Support** - Subtitles and dub options (English, Japanese, etc.)
- 📱 **Responsive Design** - Beautiful UI built with Jetpack Compose
- 🎨 **Dark/Light Theme** - System-aware theming support
- 🔄 **Offline Support** - Cache episodes for offline viewing
- ⭐ **Recommendations** - Personalized recommendations based on viewing history

## 🏗️ Architecture

### Design Patterns & Principles
- **MVVM (Model-View-ViewModel)** - Separation of concerns
- **Clean Architecture** - Domain, Data, and Presentation layers
- **SOLID Principles** - All 5 principles implemented
- **Repository Pattern** - Abstraction of data sources
- **Dependency Injection** - Hilt for DI management

### Tech Stack

#### Frontend
- **Kotlin** - Modern Android development language
- **Jetpack Compose** - Declarative UI framework
- **Coroutines** - Asynchronous programming
- **Flow** - Reactive data streams
- **ViewModel** - UI state management
- **StateFlow** - Reactive state holder
- **Navigation Compose** - Type-safe navigation
- **Hilt** - Dependency injection

#### Networking & Data
- **Retrofit** - HTTP client
- **OkHttp** - HTTP interceptor
- **Moshi** - JSON parsing
- **Room** - Local database
- **DataStore** - Secure preferences

#### Testing
- **JUnit 4** - Unit testing
- **Mockk** - Mocking library for Kotlin
- **Coroutines Test** - Testing coroutines
- **Turbine** - Flow testing

## 📋 Getting Started

### Prerequisites
- Android Studio Arctic Fox or later
- Android SDK 26+ (API level 26)
- Kotlin 1.9+
- Java 11+

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/anil101k/anime-streaming-app.git
   cd anime-streaming-app
   ```

2. **Open in Android Studio**
   ```bash
   open -a "Android Studio" .
   ```

3. **Build the project**
   ```bash
   ./gradlew build
   ```

4. **Run on emulator or device**
   ```bash
   ./gradlew installDebug
   ```

## 🧪 Testing

### Run all tests
```bash
./gradlew test
```

### Run specific test class
```bash
./gradlew testDebug --tests "com.animeflow.domain.usecase.anime.GetAnimeUseCaseTest"
```

### Run with coverage
```bash
./gradlew testDebugUnitTestCoverage
```

### Run instrumented tests
```bash
./gradlew connectedAndroidTest
```

## 🔐 Security

- JWT token-based authentication
- Encrypted SharedPreferences for token storage
- HTTPS only communication
- ProGuard/R8 code obfuscation

## 📝 License

MIT License - see [LICENSE](LICENSE) file

---

Built with ❤️ for anime fans using Kotlin and Jetpack Compose
