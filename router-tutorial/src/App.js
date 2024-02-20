import './App.css';
import About from './About';
import Home from './Home';
import React  from 'react';
import { Routes, Route, Link} from 'react-router-dom';
import Profile from './component/Profile';

function App() {
  return (
    <div className="App">
      <ul>
        <li><Link to ="/">홈</Link></li>
        <li><Link to ="/about">소개</Link></li>
        <li><Link to ="/profile/haley">haley's profile</Link></li>
        <li><Link to ="/profile/emiley">emily's profile</Link></li>
      </ul>
      <hr/>
      <Routes>
        <Route path="/" element={<Home/>}/>;
        <Route path="/about" element={<About/>}/>
        <Route path="/profile/:username" element={<Profile/>}/>
      </Routes>
    </div>
  );
}

export default App;
