# Design_Patterns


**Strategy Design Pattern:**

-> Strategy pattern is also known as Policy Pattern. We define multiple algorithms and let client application pass the algorithm to be used as a parameter.
-> Strategy pattern is useful when we have multiple algorithms for specific task and we want our application to be flexible to chose any of the algorithm at runtime for specific task.

**Example:**

-> One of the best example of strategy pattern is Collections.sort() method that takes Comparator parameter. Based on the different implementations of Comparator interfaces, the Objects are getting sorted in different ways.

**Advantages:**

-> Open-Closed Principle: The Strategy pattern follows the Open-Closed Principle, which states that a class should be open for extension but closed for modification.
-> Flexibility: The Strategy pattern allows the behavior of an object to be changed dynamically at runtime by selecting different algorithms.
-> Modularity: The pattern encapsulates the algorithms in separate classes, making it easy to add or remove algorithms without affecting other parts of the code.
-> Testability: The pattern makes it easy to test the different algorithms separately, without affecting the overall behavior of the code.

**Disadvantages:**

-> The application must be aware of all the strategies to select the right one for the right situation.

-> Overall, the Strategy pattern is a useful design pattern that allows the behavior of an object to be selected dynamically at runtime, providing flexibility, modularity, and testability.
