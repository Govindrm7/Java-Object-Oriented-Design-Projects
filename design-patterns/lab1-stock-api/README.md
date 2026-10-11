# CSYE 7374 — Lab 1: Stock API Lab (Fall 2025)

**Course:** CSYE7374  
**Assignment:** Lab 1 — Stock API  


## 📌 Objective

Implement a simple **Stock Market** simulation in Java:

1. A `StockMarket` class implemented as a **lazy Singleton**.
2. Ability to **add**, **trade** (re-price using bid + metric), **remove**, and **display** stocks.
3. Define **2 APIs**:
   - `Tradeable0` — default implementation for `setBid()` and `getMetric()`
   - `Tradeable1` — default implementation **only** for `getMetric()`
4. A `Stock` superclass with (at least):
   - `String name` (e.g., `"IBM"`)
   - `double price` (e.g., `131.15`)
   - `String description` (e.g., `"IBM Common Stock"`)
5. A `Tradable` interface (this is the contract every stock must implement):
   ```java
   public interface Tradable {
       void setBid(String bid);
       String getMetric();
   }
