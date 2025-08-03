import React, { useState } from "react";
import BookDetails from "./BookDetails";
import BlogDetails from "./BlogDetails";
import CourseDetails from "./CourseDetails";

function App() {
  // Use state to show/hide components
  const [showBook, setShowBook] = useState(true);
  const [showBlog, setShowBlog] = useState(true);
  const [showCourse, setShowCourse] = useState(true);

  // Function rendering & switch case (advanced conditional rendering)
  function renderSection(section) {
    switch (section) {
      case "book":
        return <BookDetails show={showBook} />;
      case "blog":
        return <BlogDetails show={showBlog} />;
      case "course":
        return <CourseDetails show={showCourse} />;
      default:
        return <p>Select a section</p>;
    }
  }

  return (
    <div style={{ display: "flex", justifyContent: "center", gap: "2em", marginTop: "3em" }}>
      <div>
        <button onClick={() => setShowCourse((s) => !s)}>
          Toggle Course Details
        </button>
        <CourseDetails show={showCourse} />
      </div>
      <div style={{ borderLeft: "4px solid green", borderRight: "4px solid green", padding: "0 2em" }}>
        <button onClick={() => setShowBook((s) => !s)}>
          Toggle Book Details
        </button>
        <BookDetails show={showBook} />
      </div>
      <div>
        <button onClick={() => setShowBlog((s) => !s)}>
          Toggle Blog Details
        </button>
        <BlogDetails show={showBlog} />
      </div>
      {/* Function and switch-based conditional rendering */}
      {/* Uncomment below to see advanced method */}
      {/* <div>{renderSection("book")}</div>
          <div>{renderSection("blog")}</div>
          <div>{renderSection("course")}</div> */}
    </div>
  );
}

export default App;


