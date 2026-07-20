import React, { useState } from "react";

import LoginButton from "./Components/LoginButton";
import LogoutButton from "./Components/LogoutButton";
import GuestPage from "./Components/GuestPage";
import UserPage from "./Components/UserPage";

function App() {

  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLogin = () => {
    setIsLoggedIn(true);
  };

  const handleLogout = () => {
    setIsLoggedIn(false);
  };

  return (
    <div style={{ margin: "50px" }}>

      {isLoggedIn ? (
        <div>
          <h1>Welcome back</h1>

          <LogoutButton onClick={handleLogout} />

          <br />
          <br />

          <UserPage />
        </div>
      ) : (
        <div>
          <h1>Please sign up.</h1>

          <LoginButton onClick={handleLogin} />

          <br />
          <br />

          <GuestPage />
        </div>
      )}

    </div>
  );
}

export default App;