import React from "react";

function UserPage() {
  return (
    <div>

      <h2>Welcome Back!</h2>

      <h3>You can now book your flight tickets.</h3>

      <table border="1" cellPadding="8">
        <thead>
          <tr>
            <th>Flight</th>
            <th>From</th>
            <th>To</th>
            <th>Time</th>
            <th>Status</th>
          </tr>
        </thead>

        <tbody>
          <tr>
            <td>AI101</td>
            <td>Bangalore</td>
            <td>Delhi</td>
            <td>10:00 AM</td>
            <td>Book Now</td>
          </tr>

          <tr>
            <td>AI202</td>
            <td>Chennai</td>
            <td>Mumbai</td>
            <td>2:30 PM</td>
            <td>Book Now</td>
          </tr>
        </tbody>
      </table>

    </div>
  );
}

export default UserPage;