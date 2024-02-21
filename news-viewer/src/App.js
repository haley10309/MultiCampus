import logo from './logo.svg';
import './App.css';
import {Routes,Route} from 'react-router-dom';
import NewsPage from './components/NewsPage';
 
function App() {
  return (
    <Routes>
      <Route path='/:category?' element={<NewsPage/>}/>
    </Routes>
    
  );
}

export default App;
