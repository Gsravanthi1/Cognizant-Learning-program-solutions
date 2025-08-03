import React from "react";

function BlogDetails({ show }) {
  // Ternary Operator
  return show ? (
    <div>
      <h2>Blog Details</h2>
      <div>
        <h3>React Learning</h3>
        <strong>Stephen Biz</strong>
        <p>
          Welcome to learning React!
        </p>
        <h3>Installation</h3>
        <strong>Schwezdenier</strong>
        <p>
          You can install React from npm.
        </p>
      </div>
    </div>
  ) : null;
}
export default BlogDetails;
