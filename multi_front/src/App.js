import React,{ useState }  from "react";
import MyComponent from "./ex02/MyComponent";
import Counter from "./ex05/Counter";
import Info from "./info";

function App(props) {
  const [visable, setVisable] = useState(false);

  return (
    <div>
      
      
       <Counter/>
      
    </div>
  );
}

export default App;
