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
        <button>
          1
        </button>
        <button>
          2
          <small>abc</small>
        </button>
        <button>
          3
          <small>def</small>
        </button>
      </div>
      <div className="teclado-row">
        <button>
          4
          <small>ghi</small>
        </button>
        <button>
          5
          <small>jkl</small>
        </button>
        <button>
          6
          <small>mno</small>
        </button>
      </div>
      <div className="teclado-row">
        <button>
          7
          <small>pqrs</small>
        </button>
        <button>
          8
          <small>tuv</small>
        </button>
        <button>
          9
          <small>wxyz</small>
        </button>
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