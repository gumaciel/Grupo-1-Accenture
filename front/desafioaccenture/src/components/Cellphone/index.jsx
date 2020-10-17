import React from 'react';

const Cellphone = () => {
  return (
    <div className="content">
      <Teclado />
    </div>
  )
} 

const Teclado = () => {
  return (
    <div className="teclado">
      <div className="teclado-row">
        <button>1</button>
        <button>2</button>
        <button>3</button>
      </div>
      <div className="teclado-row">
        <button>4</button>
        <button>5</button>
        <button>6</button>
      </div>
      <div className="teclado-row">
        <button>7</button>
        <button>8</button>
        <button>9</button>
      </div>
      <div className="teclado-row">
        <button>*</button>
        <button>0
          __
        </button>
        <button>&gt;</button>
      </div>
    </div>
  )
}

export default Cellphone;