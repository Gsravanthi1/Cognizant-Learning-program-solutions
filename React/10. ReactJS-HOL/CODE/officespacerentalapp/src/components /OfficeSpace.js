import React from "react";

const OfficeSpace = () => {
  const officeList = [
    { name: "Space 1", rent: 45000, address: "Hyderabad" },
    { name: "Space 2", rent: 65000, address: "Bangalore" },
    { name: "Space 3", rent: 55000, address: "Chennai" },
    { name: "Space 4", rent: 75000, address: "Mumbai" }
  ];

  return (
    <div>
      <h1>🏢 Welcome to Office Space Rental App</h1>
      <img
        src="https://via.placeholder.com/600x200.png?text=Office+Space"
        alt="office"
        style={{ width: "600px", borderRadius: "10px" }}
      />
      <br /><br />
      {officeList.map((office, index) => (
        <div key={index} style={{
          border: "1px solid #ccc",
          padding: "10px",
          marginBottom: "10px",
          borderRadius: "8px",
          width: "400px"
        }}>
          <h3>{office.name}</h3>
          <p><strong>Address:</strong> {office.address}</p>
          <p>
            <strong>Rent:</strong>{" "}
            <span style={{ color: office.rent < 60000 ? "red" : "green" }}>
              ₹{office.rent}
            </span>
          </p>
        </div>
      ))}
    </div>
  );
};

export default OfficeSpace;
