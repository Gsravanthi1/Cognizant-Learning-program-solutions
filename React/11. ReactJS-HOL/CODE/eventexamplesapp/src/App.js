import React, { Component } from 'react';
import CurrencyConvertor from './CurrencyConvertor';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      counter: 5
    };
  }

  increment = () => {
    this.setState({ counter: this.state.counter + 1 });
  };

  decrement = () => {
    this.setState({ counter: this.state.counter - 1 });
  };

  sayWelcome = () => {
    alert("Hello! Member1");
  };

  handleClick = () => {
    alert("I was clicked!");
  };

  render() {
    return (
      <div style={{ padding: '20px', fontFamily: 'Arial' }}>
        <h2>{this.state.counter}</h2>
        <button onClick={this.increment}>Increment</button>
        <br /><br />
        <button onClick={this.decrement}>Decrement</button>
        <br /><br />
        <button onClick={this.sayWelcome}>Say welcome</button>
        <br /><br />
        <button onClick={this.handleClick}>Click on me</button>
        <br /><br />
        <CurrencyConvertor />
      </div>
    );
  }
}

export default App;
