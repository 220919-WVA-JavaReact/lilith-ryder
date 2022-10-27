import React from 'react';
import './AboutMe.css';
import Header from './components/header/Header';
import Nav from './components/nav/Nav';
import Footer from './components/footer/Footer';
import Home from './components/home/Home';
import TTAAL from './components/ttaal/TTAAL';
import { BrowserRouter, Route, Routes } from 'react-router-dom';

function App() {
  return (
    <>
      <Header />
      <BrowserRouter>
        <Nav />
        <Routes>
          <Route path='/' element={<Home />}></Route>
          <Route path='/ttaal' element={<TTAAL />}></Route>
        </Routes>
      </BrowserRouter>
      <Footer />
    </>
  );
}

export default App;