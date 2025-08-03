import React from "react";

// If/Else Rendering
function CourseDetails({ show }) {
  if (!show) return null;
  return (
    <div>
      <h2>Course Details</h2>
      <div>
        <h3>Angular</h3>
        <span>4/5/2021</span>
      </div>
      <div>
        <h3>React</h3>
        <span>6/3/2020</span>
      </div>
    </div>
  );
}
export default CourseDetails;
