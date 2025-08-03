import React from "react";

const books = [
  { id: 1, bname: "Master React", price: 670 },
  { id: 2, bname: "Deep Dive into Angular 11", price: 800 },
  { id: 3, bname: "Mongo Essentials", price: 450 }
];

function BookDetails({ show }) {
  // Logical AND Operator
  return show && (
    <div>
      <h2>Book Details</h2>
      <ul>
        {books.map(book =>
          // Render with map, show keys
          <li key={book.id}>
            <strong>{book.bname}</strong> <br />
            <em>{book.price}</em>
          </li>
        )}
      </ul>
    </div>
  );
}
export default BookDetails;
