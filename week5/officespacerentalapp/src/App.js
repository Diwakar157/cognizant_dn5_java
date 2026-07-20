import office from "./office.jpeg";
import "./App.css";

function App() {

  const heading = "Office Space";

  const officeList = [
    {
      Name: "DBS",
      Rent: 50000,
      Address: "Chennai"
    },
    {
      Name: "Regus",
      Rent: 75000,
      Address: "Bangalore"
    },
    {
      Name: "WeWork",
      Rent: 65000,
      Address: "Hyderabad"
    }
  ];

  return (
    <div style={{ marginLeft: "50px" }}>

      <h1>{heading}, at Affordable Range</h1>

      <img
        src={office}
        width="25%"
        height="25%"
        alt="Office Space"
      />

      {
        officeList.map((item, index) => (

          <div key={index}>

            <h2>Name: {item.Name}</h2>

            <h3
              style={{
                color: item.Rent <= 60000 ? "red" : "green"
              }}
            >
              Rent: Rs. {item.Rent}
            </h3>

            <h3>Address: {item.Address}</h3>

            <hr />

          </div>

        ))
      }

    </div>
  );

}

export default App;