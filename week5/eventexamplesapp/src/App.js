import React, { useState } from "react";
import CurrencyConvertor from "./Components/CurrencyConvertor";

function App() {

  const [count, setCount] = useState(0);

  // Increment Counter
  const increment = () => {
    setCount(count + 1);
  };

  // Decrement Counter
  const decrement = () => {
    setCount(count - 1);
  };

  // Hello Function
  const sayHello = () => {
    alert("Hello! Member1");
  };

  // Multiple Functions
  const handleIncrement = () => {
    increment();
    sayHello();
  };

  // Welcome Function
  const sayWelcome = (message) => {
    alert(message);
  };

  // Synthetic Event
  const handleClick = () => {
    alert("I was clicked");
  };

  return (
    <div style={{ marginLeft: "20px" }}>

      <h2>{count}</h2>

      <button onClick={handleIncrement}>Increment</button>

      <br /><br />

      <button onClick={decrement}>Decrement</button>

      <br /><br />

      <button onClick={() => sayWelcome("Welcome")}>
        Say Welcome
      </button>

      <br /><br />

      <button onClick={handleClick}>
        Click on me
      </button>

      <br /><br />

      <CurrencyConvertor />

    </div>
  );
}

export default App;