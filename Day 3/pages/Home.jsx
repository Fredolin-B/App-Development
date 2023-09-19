import React from 'react'
import Bar from '../css/Bar.css';
function Home() {
  return (
    <div>
    <nav>
      <input type="checkbox" id="check"></input>
      <label for="check">
        <i class="fas fa-bars"></i>
      </label>
      <label className="logo">Vodafone</label>
      <ul>
        <div ></div>
        <div className='active'>
        <li><a href="#">Home</a></li>
        <li><a href="#">About</a></li>
        <li><a href="#">Plans</a></li>
        <li><a href="#">Offers</a></li>
        <li><a href="#">Contact</a></li>
        <li><a href="#">Feedback</a></li>
        <li><a href="#">Log Out</a></li>
        </div>
      </ul>
      
    </nav>
    </div>
  )
}

export default Home