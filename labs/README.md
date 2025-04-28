# 🌟 Spring Boot Lab: Basic Beans and Dependency Injection

**Goal**:  
Learn how to create a Spring Boot project, define `@Component` beans, inject dependencies between them, and use them inside `CommandLineRunner`.

---

## Instructions

1. **Create a new Spring Boot project**:
   - Use [Spring Initializr](https://start.spring.io/).
   - Project Type: Maven or Gradle (your choice)
   - Language: Java
   - Dependencies: **None** (leave it empty)
   - Java Version: 17 or higher recommended

2. **Project Setup**:
   - After downloading and opening your project, go to your `src/main/java` folder.

3. **Create two classes** annotated with `@Component`:
   
   - `HelperService`
   - `MainService`

4. **Details for each class**:

   **HelperService.java**:
   - Annotate the class with `@Component`
   - Create a method called `getHelp()` that returns a `String` like `"HelperService is working!"`

   **MainService.java**:
   - Annotate the class with `@Component`
   - Inject `HelperService` into `MainService` using `@Autowired`
   - Create a method called `performAction()` that:
     - Calls `helperService.getHelp()`
     - Prints the result to the console.

5. **Modify your main class** (e.g., `DemoApplication.java`) to:

   - Implement `CommandLineRunner`
   - Autowire the `MainService` bean into the main class
   - In the `run(String... args)` method, call `mainService.performAction()`

6. **Run your application**:
   - You should see the printed message from `HelperService`.

