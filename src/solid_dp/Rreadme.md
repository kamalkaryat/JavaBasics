# Solid Design Patterns

1. `S- Single Responsibility Principle (SRP)`
   - A class should do one thing only. 
   - If a class has more than one job, it becomes harder to change or fix later.

2. `O- Open/Closed Principle (OCP)`
   - Code should be open for extension (you can add new things) but closed for modification (you don’t have to change old code when requirements change).
   - NOTE: Bad code uses if-else or switch to handle growing logic. Good OCP-based design uses interfaces and new classes so you extend behavior without editing old code.

3. `L- Liskov Substitution Principle`

4. `I - Interface Segregation Principle`
   - An interface should only have the methods that are relevant to the class that implements it. 
   - NOTE: Don’t force a class to implement things it doesn’t need.
   - Big interfaces are bad. Break them into smaller, focused interfaces
   
5. 