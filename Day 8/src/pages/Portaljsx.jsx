import React from 'react'
import Chatjsx from './Chatjsx'
import Chatcss from '../css/Chatcss.css'
function Portaljsx() {
  return (
    <div>
        <Chatjsx/>
        <main className="main-content">
      <div className='welcome'><h1>Here's your Transaction History:)</h1></div>
      
      </main>
    </div>
  )
}

export default Portaljsx