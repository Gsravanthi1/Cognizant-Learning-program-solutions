import React from "react";

function App() {
  const office = {
    name: "DBS",
    rent: 50000,
    address: "Chennai",
    image: "https://img.staticmb.com/mbcontent/images/uploads/2022/3/Office-space.jpeg"
  };

  const rentStyle = {
    color: office.rent < 60000 ? "red" : "green",
    fontWeight: "bold",
    fontSize: "18px"
  };

  return (
    <div style={{ textAlign: "center", marginTop: "40px" }}>
      <h1 style={{ fontFamily: "Arial", fontWeight: "bold" }}>
        Office Space , at Affordable Range
      </h1>
      <img
        src={office.image}
        alt="Office"
        style={{ width: "300px", marginTop: "20px", borderRadius: "8px" }}
      />
      <h2 style={{ marginTop: "30px" }}>Name: {office.name}</h2>
      <p style={rentStyle}>Rent: Rs. {office.rent}</p>
      <p style={{ fontWeight: "bold" }}>Address: {office.address}</p>
    </div>
  );
}

export default App;

