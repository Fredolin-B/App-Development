import React from 'react'
import Chatcss from '../css/Chatcss.css';
import store from '../Redux/Store';
import { Link } from 'react-router-dom';
import Sidenav from './Sidenav';
function Chatjsx() {
  return (
    <>
    <div className="app-container">
        
      <header className="navbar navbar-top">
        <div className="logo">Mobile Recharge Portal</div>
        <nav className="nav-links">
          <a href="/recharge">Home</a>
          <a href="/plans">Plans</a>
          <a href="/balance">Balance</a>
          <a href="/loans">Loans & Credit Card</a>
          <a href="/offers">Offers</a>
        </nav>
      </header>
      
    </div>
      <footer className="navbar navbar-bottom">
        <nav className="nav-links">
          <a href="/faq">FAQ</a>
          <a href="/about">About Us</a>
          <a href="/contact">Contact</a>
          <a href="/help">Help</a>
          <a href="/">Log Out</a>
        </nav>
      </footer>
      </>
  )
}

export default Chatjsx