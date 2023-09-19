import {BrowserRouter, Routes, Route} from 'react-router-dom'
import './css/App.css';
import Login from './pages/Login';
import Register from './pages/Register';
import Home from './pages/Home';
function App() {
  return (
    <>
    <BrowserRouter>
    <Routes>
      <Route exact path='/' element={<Login/>}/>
      <Route exact path='/register' element={<Register/>}/>
      <Route exact path='/home' element={<Home/>}/>
    </Routes>
    </BrowserRouter>
    </>
  );
}

export default App;