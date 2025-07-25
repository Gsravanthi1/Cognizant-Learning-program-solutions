import React from 'react';
import '../Stylesheets/mystyle.css';

function CalculateScore(props) {
  const average = ((props.total / 300) * 100).toFixed(2); // Assuming out of 300

  return (
    <div className="container">
      <h1 className="heading">Student Details:</h1>
      <p><span className="label name-label">Name:</span> <span className="value name-value">{props.name}</span></p>
      <p><span className="label school-label">School:</span> <span className="value school-value">{props.school}</span></p>
      <p><span className="label total-label">Total:</span> <span className="value total-value">{props.total}Marks</span></p>
      <p><span className="label score-label">Score:</span> <span className="value score-value">{average}%</span></p>
    </div>
  );
}

export default CalculateScore;
