import React from "react";

function GuestPage() {
  return (
    <div>
      <h2>Flight Details</h2>

      <table border="1" cellPadding="8">
        <thead>
          <tr>
            <th>Flight</th>
            <th>From</th>
            <th>To</th>
            <th>Time</th>
          </tr>
        </thead>

        <tbody>
          <tr>
            <td>AI101</td>
            <td>Bangalore</td>
            <td>Delhi</td>
            <td>10:00 AM</td>
          </tr>

          <tr>
            <td>AI202</td>
            <td>Chennai</td>
            <td>Mumbai</td>
            <td>2:30 PM</td>
          </tr>
        </tbody>
      </table>

      <br />

      <p>Please login to book your tickets.</p>

    </div>
  );
}

export default GuestPage;