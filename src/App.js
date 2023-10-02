
import React from 'react';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import Logo from './components/logo/Logo';
import NavBar from './components/navBar/NavBar';
import Home from './pages/home/Home';
//import LoginForm from './pages/form/LoginForm';
import Footer from './components/footer/Footer';
import About from './components/about/About';
import Login from './pages/Auth/Login';
import Banner from './components/banner/Banner';
import Contact from './components/contact/Contact';
import Appl from './components/cards/Appl';

import './App.css';
import Cards from './components/cards/Cards';



const App = () => {


  return (
  
 
      <BrowserRouter>
      <Routes>
      <Route path="/" element={<Home />}/>

      {/* path="*" fonctionne si jamais l'url ne correspond à rien de déclaré a dessus */}
      <Route path="*" element={<Home />}/>
      <Route path='logo' element={<Logo />}/>
      <Route path='nav' element={<NavBar />}/>
      {/* <Route path='login' element={<LoginForm />}/> */}
      <Route path='footer' element={<Footer />}/>
      <Route path='about' element={<About />}/>
      <Route path='login' element={<Login />}/>
      <Route path='banner' element={<Banner />}/>
      <Route path='contact' element={<Contact />}/>
      <Route path='app' element={<Appl />}/>
      <Route path='cards' element={<Cards />}/>
      
      </Routes>
      </BrowserRouter>


  );
  
};

export default App;
