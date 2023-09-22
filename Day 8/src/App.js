import {BrowserRouter, Routes, Route} from 'react-router-dom'
import './css/App.css';
import Login from './pages/Login';
import Register from './pages/Register';
import Rechargejsx from './pages/Rechargejsx';
import Portaljsx from './pages/Portaljsx';
import Plansjsx from './pages/Plansjsx';
import Balancejsx from './pages/Balancejsx';
function App() {
  return (
    <>
    <BrowserRouter>
    <Routes>
      <Route exact path='/' element={<Login/>}/>
      <Route exact path='/register' element={<Register/>}/>
      <Route exact path='/recharge' element={<Rechargejsx/>}/>
      <Route exact path='/portal' element={<Portaljsx/>}/>
      <Route exact path='/plans' element={<Plansjsx/>}/>
      <Route exact path='/balance' element={<Balancejsx/>}/>
    </Routes>
    </BrowserRouter>
    </>
  );
}
export default App;