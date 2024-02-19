import React,{ useState }  from "react";
import MyComponent from "./ex02/MyComponent";
import Counter from "./ex05/Counter";
import Info from "./info";
import Average from "./ex05/Average";

function App(props) {
  const [visable, setVisable] = useState(false);

  return (
    <div>
      
      
       <Average/>
      
    </div>
  );
}

export default App;
