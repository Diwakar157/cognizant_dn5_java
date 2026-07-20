import React from "react";

import BookDetails from "./Components/BookDetails";
import BlogDetails from "./Components/BlogDetails";
import CourseDetails from "./Components/CourseDetails";

function App() {

  // Conditional Rendering Variables
  const showBooks = true;
  const showBlogs = true;
  const showCourses = true;

  return (

    <div
      style={{
        display: "flex",
        justifyContent: "space-around",
        marginTop: "50px"
      }}
    >

      <div
        style={{
          borderRight: "4px solid green",
          paddingRight: "40px"
        }}
      >

        {showCourses && <CourseDetails />}

      </div>

      <div
        style={{
          borderRight: "4px solid green",
          paddingRight: "40px",
          paddingLeft: "40px"
        }}
      >

        {showBooks ? <BookDetails /> : null}

      </div>

      <div
        style={{
          paddingLeft: "40px"
        }}
      >

        {showBlogs ? <BlogDetails /> : null}

      </div>

    </div>

  );

}

export default App;