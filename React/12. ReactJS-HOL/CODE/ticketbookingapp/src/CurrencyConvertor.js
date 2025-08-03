import React, { Component } from 'react';

class CurrencyConvertor extends Component {
  constructor(props) {
    super(props);
    this.state = {
      amount: '',
      converted: ''
    };
  }

  handleChange = (event) => {
    this.setState({ amount: event.target.value });
  };

  handleSubmit = () => {
    const inr = parseFloat(this.state.amount);
    if (!isNaN(inr)) {
      const result = inr * 0.011; // Example: INR to EUR conversion
      this.setState({ converted: result.toFixed(2) });
    } else {
      alert("Please enter a valid number");
    }
  };

  render() {
    return (
      <div>
        <h1 style={{ color: 'green' }}>Currency Convertor!!!</h1>
        <p><strong>Amount:</strong> <input type="text" onChange={this.handleChange} /></p>
        <p><strong>Currency:</strong> <textarea value={this.state.converted} readOnly /></p>
        <button onClick={this.handleSubmit}>Submit</button>
      </div>
    );
  }
}

export default CurrencyConvertor;


