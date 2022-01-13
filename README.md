# Paging3JetpackCompose

**Architecture**
----
The architecture of this application relies and complies with the following points below:

- A single-activity architecture, using the Navigation Components to manage fragment operations.
- Pattern Model-View-ViewModel(MVVM) which facilitates a separation of development of the graphical user interface.
- Android architecture components which help to keep the application robust, testable, and maintainable.

**Technologies used:**
- Unsplash API
- ViewModel: to store and manage UI-related data in a lifecycle conscious way.
- Navigation Component: to handle all navigations and also passing of data between destinations.
- Kotlin Coroutines: for managing background threads and reducing needs for callbacks.
- Room: persistence library which provides an abstraction layer over SQLite to allow for more robust database access while harnessing the full power of SQLite.
- Dagger-Hilt

